package Lab3;

public class Bishop extends ChessPiece {
    public boolean hasBeenPromoted;
    ChessPiece newPiece;

    public Bishop(int value,String name) {
        super(value,name);
    }

    @Override
    public int getValue() {
        return 3;
    }

    @Override
    public void move() {
        System.out.println("diagonally");
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
