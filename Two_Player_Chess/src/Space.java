
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
}
