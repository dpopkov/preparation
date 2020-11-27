package learn.effjava.p02createdestroy.item003singleton;

/*
Enum Singleton - the preferred approach
---------------------------------------
1. Concise.
2. Provides the serialization machinery for free.
3. Provides an ironclad guarantee against multiple instantiation,
even in the face of sophisticated serialization or reflection attacks.
 */
public enum Elvis3 implements Elvis {
    INSTANCE;

    @Override
    public void leaveTheBuilding() {
    }
}
