package learn.effjava.p02createdestroy.item008cleaners;

import java.lang.ref.Cleaner;

/** AutoClosable class using a Cleaner as a safety net. */
public class Room implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    /** Resource that requires cleaning. Must not refer to Room. */
    private static class State implements Runnable {
        private int numJunkPiles;

        State(int numJunkPiles) {
            System.out.println("Room.State::init");
            this.numJunkPiles = numJunkPiles;
        }

        // Invoked by close method or cleaner
        @Override
        public void run() {
            System.out.println("Room.State::run() - Cleaning room");
            System.out.println("Room.State::run() - Thread " + Thread.currentThread().getName());
            numJunkPiles = 0;
        }

        public int getNumJunkPiles() {
            return numJunkPiles;
        }
    }

    /** State of this room, shared with our cleanable. */
    @SuppressWarnings("FieldCanBeLocal")
    private final State state;

    /** Cleanable cleans the room when it's eligible for GC. */
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        System.out.println("Room::init");
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        System.out.println("Room::close(), Thread " + Thread.currentThread().getName());
        cleanable.clean();
        System.out.println("Room::close() - exiting. numJunkPiles = " + state.getNumJunkPiles());
    }
}
