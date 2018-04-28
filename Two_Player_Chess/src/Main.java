import java.util.Arrays;
public class Main {
       
    
    public static void main(String[] args) {
        King whiteKing = new King("wKing", "White", 1);
        Queen whiteQueen = new Queen("wQueen", "White", 2);
        Bishop whiteBishop = new Bishop("wBishop", "White", 3);
        Pawn whitePawn = new Pawn("wPawn", "White", 4);
        
        Space a1 = new Space(whiteKing, 1);
       Space a2 = new Space(whiteQueen, 2);
       Space a3 = new Space(whiteBishop, 3);
       Space a4 = new Space(whitePawn, 4);
     
      
        System.out.println(whiteKing.toString());
        Space [] spacesArray = {a1,a2,a3,a4};
        Piece [] pieceArray = {whiteKing,whiteQueen,whiteBishop,whitePawn};
       

      
        
        Grid board = new Grid(spacesArray, pieceArray);
        board.drawGrid();

        Queen blackQueen = new Queen("bQueen", "Black", 1);
      
        System.out.println(a1.toString());
        a1.setNewPiece(whiteKing);
        System.out.println(a1.toString());
        a1.setNewPiece(blackQueen);
        System.out.println(a1.toString());
        a1.removePiece();
        System.out.println(a1.toString());
        
        a1.getLocation();
        
    }
}
