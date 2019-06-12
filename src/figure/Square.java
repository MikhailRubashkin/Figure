package figure;

public class Square extends Figure {

    private float width;
    private float height;

    public Square(String name, float width, float height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public float getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width +
                ", height=" + height;
    }

    public static class Hexagon extends Figure {

        private float width;
        private float height;

        public Hexagon(String name, float width, float height) {
            super(name);
            this.width = width;
            this.height = height;
        }

        public Hexagon(String name) {
            super(name);
        }

        @Override
        public float getPerimeter() {
            return width * 2 + height * 2;
        }

        @Override
        public float getArea() {
            return width * height;
        }
        public static class Тrapeze extends Figure {
            private float width;
            private float height;

            public Тrapeze(String name, float width, float height) {
                super(name);
                this.width = width;
                this.height = height;
            }

            @Override
            public float getPerimeter() {
                return width * 2 + height * 2;
            }

            @Override
            public float getArea() {
                return width * height;
            }

            @Override
            public String toString() {
                return super.toString()+ ", width=" + width +
                        ", height=" + height;
            }
        }
    }
}
