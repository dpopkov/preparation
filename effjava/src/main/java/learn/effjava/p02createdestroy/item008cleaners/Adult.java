package learn.effjava.p02createdestroy.item008cleaners;

public class Adult {
    public static void main(String[] args) {
        System.out.println("Adult::main()");
        try (Room room = new Room(7)) {
            System.out.println("Adult::main() - Room created.");
        }
    }
}
