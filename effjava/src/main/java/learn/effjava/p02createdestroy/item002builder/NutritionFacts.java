package learn.effjava.p02createdestroy.item002builder;

public class NutritionFacts {
    private final int servingSize; // Required
    private final int servings; // Required
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        private final int servingSize; // Required
        private final int servings; // Required
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int amount) {
            this.calories = amount;
            return this;
        }

        public Builder fat(int amount) {
            this.fat = amount;
            return this;
        }

        public Builder sodium(int amount) {
            this.sodium = amount;
            return this;
        }

        public Builder carbohydrate(int amount) {
            this.carbohydrate = amount;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
