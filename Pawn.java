package Lab3;

import java.util.Objects;

public class Pawn extends ChessPiece {
    public boolean hasBeenPromoted;
    private ChessPiece newPiece;

    public Pawn() {
        super(1,"Pawn");
    }
//    public Pawn(int value,String name) {
//        super(value,name)
//    }
//    @Override
//    public String getName() {
//        return "Pawn";
//    }
//
//    @Override
//    public int getValue() {
//        return 1;
//    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return hasBeenPromoted == pawn.hasBeenPromoted &&
                newPiece.equals(pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasBeenPromoted, newPiece);
    }

    //ChessPiece Pawn == ChessPiece King
    // Pawn Can
}
