package Lab3;

public class Driver {
    public static void main(String[] args) {
        Pawn can = new Pawn();
        King kei = new King();

        System.out.println(can);
        can.move();
        System.out.println(kei);
        kei.move();
        //System.out.println((move(can)).toString);
    }
}
