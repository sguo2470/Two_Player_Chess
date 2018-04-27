public class Grid {
    
Space [] spacesArray = new Space[64];
    Piece [] pieceArray = new Piece[32];
    
    //drawGrid;
    
    public void drawGrid(){
        
        int arrayCounter = 0;
        if (arrayCounter < spacesArray.length){
            for(int i = 0; i < 8; i ++){
                int temp = arrayCounter;
                for(int j = temp; j < temp + 8; j ++){
                    System.out.print(" " + spacesArray[j].getPiece().getId() + " ");
                    arrayCounter ++;
                }
                
                System.out.println();
            }
        }
    }
    
    public void movePiece(Space sp1, Space sp2){
        Piece p = sp1.getPiece();
        sp1.setNewPiece(new Piece("--", "Null", 0));
        sp2.setNewPiece(p);
    }
    
    public void setInitialSpaces(){
        
        //create all spaces;
        for(int i = 0; i < spacesArray.length; i ++){
            Piece p = new Piece("--", "null", 0);
            Space s = new Space(p, i);
            spacesArray [i] = s;
        }
        
        int arrayCounter = 0;
                
        for(int i = 0; i < spacesArray.length; i ++){
            if(spacesArray[i].getLocation() >= 8 && spacesArray[i].getLocation() <= 15){
                Piece p = new Piece("BP", "Black", 0);
                spacesArray[i].setNewPiece(p);
            }
            // white Rook Spaces
            if(spacesArray[i].getLocation() == 0 || spacesArray[i].getLocation() == 7){
                Piece p = new Piece ("BR", "Black", 0);
                spacesArray[i].setNewPiece(p);
            }
            //White knight
            if(spacesArray[i].getLocation() == 1 || spacesArray[i].getLocation() == 6){
                Piece p = new Piece ("BN", "Black", 0);
                spacesArray[i].setNewPiece(p);
            }
            //White Bishop
            if(spacesArray[i].getLocation() == 2 || spacesArray[i].getLocation() == 5){
                Piece p = new Piece("BB", "Black", 0);
                spacesArray[i].setNewPiece(p);
            }
            //White Queen
            if(spacesArray[i].getLocation() == 3){
                Piece p = new Piece("BQ", "Black", 0);
                spacesArray[i].setNewPiece(p);
            }
            //White King
            if(spacesArray[i].getLocation() == 4){
                Piece p = new Piece("BK", "Black", 0);
                spacesArray[i].setNewPiece(p);
            }
            
            //black pawn
            if(spacesArray[i].getLocation() >= 48 && spacesArray[i].getLocation() <= 55){
                Piece p = new Piece("WP", "White", 0);
                spacesArray[i].setNewPiece(p);
            }
            //black rook 
            if(spacesArray[i].getLocation() == 56 || spacesArray[i].getLocation() == 63){
                Piece p = new Piece ("WR", "White", 0);
                spacesArray[i].setNewPiece(p);
            }
            //Black Knight
            if(spacesArray[i].getLocation() == 57 || spacesArray[i].getLocation() == 62){
                Piece p = new Piece ("WN", "White", 0);
                spacesArray[i].setNewPiece(p);
            }
            //Black Bishop
            if(spacesArray[i].getLocation() == 58 || spacesArray[i].getLocation() == 61){
                Piece p = new Piece ("WB", "White", 0);
                spacesArray[i].setNewPiece(p);
            }
            //Black Queen
            if(spacesArray[i].getLocation() == 59){
                Piece p = new Piece("WQ", "White", 0);
                spacesArray[i].setNewPiece(p);
            }
            //Black King
            if(spacesArray[i].getLocation() == 60){
                Piece p = new Piece("WK", "White", 0);
                spacesArray[i].setNewPiece(p);
            }
        }
              
    }
    
    public void createPieces(){

        int arrayCounter = 0;
        //White pawns
        for(int i = 0; i < 8; i ++){
            Piece p = new Piece("WP", "White", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //white Rook
        for(int i = 0; i < 2; i ++){
            Piece p = new Piece("WR", "White", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //white Knight
        for(int i = 0; i < 2; i ++){
            Piece p = new Piece("WK", "White", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
            
        }
        
        //White Bishop
        for(int i = 0; i < 2; i ++){
            Piece p = new Piece("WB", "White", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //White Queen
        {
            Piece p = new Piece ("WQ", "White", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        //white King
        {
            Piece p = new Piece("WK", "White", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //black pawn
        for(int i = 0; i < 8; i ++){
            Piece p = new Piece("BP", "Black", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //black rook
        for(int i = 0; i < 2; i ++){
            Piece p = new Piece("BR", "Black", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //black Knight
        for(int i = 0; i < 2; i ++){
            Piece p = new Piece("BK", "Black", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
            
        }
        
        //Black Bishop
        for(int i = 0; i < 2; i ++){
            Piece p = new Piece("BB", "Black", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //Black Queen
        {
            Piece p = new Piece ("BQ", "Black", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
        //Black King
        {
            Piece p = new Piece("BK", "Black", 0);
            pieceArray[arrayCounter] = p;
            arrayCounter ++;
        }
        
    }

}
