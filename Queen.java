package Lab3;

public class Queen extends ChessPiece {
    public boolean hasBeenPromoted;
    ChessPiece newPiece;

    public Queen(int value,String name) {
        super(value,name);
    }

    @Override
    public int getValue() {
        return 9;
    }

    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
