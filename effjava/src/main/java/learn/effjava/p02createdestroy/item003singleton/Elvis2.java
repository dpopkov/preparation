package learn.effjava.p02createdestroy.item003singleton;

import java.util.function.Supplier;

/*
Static factory approach
-----------------------
1. Gives the flexibility to change your mind whether the class is a singleton
without changing its API.
2. You can write a generic singleton factory (Item 30).
3. Method reference can be used as a supplier.
 */
public class Elvis2 implements Elvis {
    private static final Elvis2 INSTANCE = new Elvis2();

    public static Elvis2 getInstance() {
        return INSTANCE;
    }

    private Elvis2() {
        /*
        A privileged client can invoke the private constructor reflectively
        with the aid of the AccessibleObject.setAccessible method. If you
        need to defend against this attack, modify the constructor to make it throw an
        exception if it’s asked to create a second instance.
         */
    }

    @Override
    public void leaveTheBuilding() {
    }

    public static void main(String[] args) {
        // Usage of method reference
        useMethodReferenceAsSupplier(Elvis2::getInstance);
    }

    private static void useMethodReferenceAsSupplier(Supplier<Elvis2> factoryMethodRef) {
        Elvis2 elvis = factoryMethodRef.get();
        elvis.leaveTheBuilding();
    }
}
