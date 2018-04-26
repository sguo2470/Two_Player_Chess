
public class Space {
    private Piece piece;
    private String locationID;

    public Space(Piece piece, String locationID) {
        this.piece = piece;
        this.locationID = locationID;
    }
    
    public void setNewPiece(Piece piece){
        this.piece = piece;
    }
    //Created in iteration 1
    
    public void removePiece(){// <---This will remove the piece for movement
        this.piece = null;
    }
    
    public void addPiece(Piece piece){/*<---This will add the piece to the space,
        Theoretically, this should be able to replace pieces.*/ 
        this.piece = piece;
    }
     public Piece getPiece(){
        return this.piece;
    }
    
    public String getLocation(){
        return this.locationID;
    }


    @Override
    public String toString() {
        return "Space{" + "piece=" + piece + ", locationID=" + locationID + '}';
    }
    
}
