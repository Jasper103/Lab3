package Lab3;

public class Knight extends ChessPiece {
    public boolean hasBeenPromoted;
    ChessPiece newPiece;

    public Knight() {
        super(2,"Knight");
    }

    @Override
    public void move() {
        System.out.println("like an L");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
