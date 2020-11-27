package learn.effjava.p02createdestroy.item002builder.hierarchy;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // default

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
