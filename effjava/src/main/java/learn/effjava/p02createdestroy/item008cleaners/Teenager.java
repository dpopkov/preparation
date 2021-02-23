package learn.effjava.p02createdestroy.item008cleaners;

public class Teenager {
    public static void main(String[] args) {
        System.out.println("Teenager::main()");
        Room room = new Room(99);
        System.out.println("Teenager::main() - calling System.gc()");
        System.gc();
        System.out.println("Teenager::main() - exiting");
    }
}
