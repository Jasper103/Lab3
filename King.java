package Lab3;

public class King extends ChessPiece {
    public boolean hasBeenPromoted;
    ChessPiece newPiece;

    public King() {
        super(1000,"King");
    }

//    @Override
//    public int getValue() {
//        return 1000;
//    }

    @Override
    public void move() {
        System.out.println("one square");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}