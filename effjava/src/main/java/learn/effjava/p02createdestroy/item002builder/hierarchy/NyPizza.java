package learn.effjava.p02createdestroy.item002builder.hierarchy;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public Size getSize() {
        return size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
