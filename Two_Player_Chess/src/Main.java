/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svg5502
 */
public class Main {
       
    
    public static void main(String[] args) {
        King whiteKing = new King("wKing", "White", 1);
        System.out.println(whiteKing.toString());
        
        Grid board = new Grid();
        board.drawGrid();
    //Created in iteration 1
        Queen blackQueen = new Queen("bQueen", "Black", 1);
        Space a1 = new Space(null, "A1");
        
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
