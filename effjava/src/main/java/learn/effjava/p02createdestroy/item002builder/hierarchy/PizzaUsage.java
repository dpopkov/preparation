package learn.effjava.p02createdestroy.item002builder.hierarchy;

import static learn.effjava.p02createdestroy.item002builder.hierarchy.NyPizza.Size.*;
import static learn.effjava.p02createdestroy.item002builder.hierarchy.Pizza.Topping.*;

public class PizzaUsage {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
