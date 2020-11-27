package learn.effjava.p02createdestroy.item003singleton;

/*
Final field approach
--------------------
Keep constructor private and export a public static member to provide access
to the sole instance.
 */
public class Elvis1 implements Elvis {
    public static final Elvis1 INSTANCE = new Elvis1();

    private Elvis1() {}

    @Override
    public void leaveTheBuilding() {
    }
}
