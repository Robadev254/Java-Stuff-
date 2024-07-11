public class Program2 {
    double x;
    double y;
    double width;
    double height;

    public Program2(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        return x >= this.x - width / 2 && x <= this.x + width / 2 &&
                y >= this.y - height / 2 && y <= this.y + height / 2;
    }

    public boolean contains(Program2 r) {
        return contains(r.x - r.width / 2, r.y - r.height / 2) &&
                contains(r.x + r.width / 2, r.y + r.height / 2);
    }

    public boolean overlaps(Program2 r) {
        return !((r.x + r.width / 2 < x - width / 2) ||
                (r.x - r.width / 2 > x + width / 2) ||
                (r.y + r.height / 2 < y - height / 2) ||
                (r.y - r.height / 2 > y + height / 2));
    }

    public static void main(String[] args) {
        Program2 r1 = new Program2(2, 2, 5.5, 4.9);

        // The area and perimeter of r1
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // The result of contains, contains[MyRectangle2D], and overlaps
        System.out.println("Contains (3, 3): " + r1.contains(3, 3));
        System.out
                .println("Contains new MyRectangle2D(4, 5, 10.5, 3.2): " + r1.contains(new Program2(4, 5, 10.5, 3.2)));
        System.out.println("Overlaps new MyRectangle2D(3, 5, 2.3, 5.4): " + r1.overlaps(new Program2(3, 5, 2.3, 5.4)));
    }
}
