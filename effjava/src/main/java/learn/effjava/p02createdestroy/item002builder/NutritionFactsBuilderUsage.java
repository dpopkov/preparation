package learn.effjava.p02createdestroy.item002builder;

public class NutritionFactsBuilderUsage {
    public static void main(String[] args) {
        NutritionFacts facts = new NutritionFacts.Builder(420, 5)
                .calories(100)
                .sodium(20)
                .build();
    }
}
