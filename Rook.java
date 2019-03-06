package Lab3;

public class Rook extends ChessPiece {
    public boolean hasBeenPromoted;
    ChessPiece newPiece;

    public Rook(int value,String name) {
        super(value,name);
    }

    @Override
    public int getValue() {
        return 5;
    }

    @Override
    public void move() {
        System.out.println("horizontally or vertically");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
