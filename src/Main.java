class Main {
    public static void main(String[] args) {
    Circle circle = new Circle("Круг", 23);
    Triangle triangle = new Triangle("Треугольник", 24,5, 6);
    Square square = new Square("Квадрат", 34);
    Rectangle rectangle = new Rectangle("Прямоугольник", 42, 56);

    Bus bus = new Bus("Китайский автобус");
    Car car = new Car("Мерседес");
    Transport car2 = new Car("Тойота");

    Drawable [] drawables  = {circle, triangle, square, rectangle, bus, car, car2};
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + "Периметр -> " +
                        ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Transport) {
                System.out.println(((Transport) drawables[i]).getName());
            }
            drawables[i].draw();
        }
    }
}