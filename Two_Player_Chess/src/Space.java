
public class Space {
    private Piece piece;
    private int locationID;

    public Space(Piece piece, int locationID) {
        this.piece = piece;
        this.locationID = locationID;
    }
    
    public boolean setNewPiece(Piece piece){
        this.piece = piece;
        return true;
    }
    //Created in iteration 1
    
    public boolean removePiece(){// <---This will remove the piece for movement
        this.piece = null;
        return true;
    }
    
    public boolean addPiece(Piece piece){/*<---This will add the piece to the space,
        Theoretically, this should be able to replace pieces.*/ 
        this.piece = piece;
        return true;
    }
     public Piece getPiece(){
        return this.piece;
    }
    
    public int getLocation(){
        return this.locationID;
    }

    public void endTurn(Space space)
    {
        boolean whiteTurn = true;
        
        if(space.setNewPiece(piece) || space.removePiece())
        {
            if(whiteTurn)
            {
                
                System.out.println("It is now Black Pieces turn.");
                whiteTurn = false;
              
            }
            else
            {
                
                System.out.println("It is now White Pieces turn.");    
                whiteTurn = true;
                
            }
        }
    }
    
    @Override
    public String toString() {
        return "Space{" + "piece=" + piece + ", locationID=" + locationID + '}';
    }
    
}
