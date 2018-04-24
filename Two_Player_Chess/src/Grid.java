public class Grid {
    
    Space [] spacesArray = new Space[64];
    
    //drawGrid;
    
    public void drawGrid(){
        
        int spaceCounter = 0;
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //movePiece;
    //updateGrid;
    //
    
    public void setInitialSpaces(){
        
    }
}
