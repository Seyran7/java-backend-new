package ForGithub;

public interface Shape {
    void draw();
    void getArea();

    public static void main(String[] args) {

        Shape circle = new Shape() {
            int r = 10;

            @Override
            public void draw() {
                System.out.println("Drawing Circle.");
            }

            @Override
            public void getArea() {

                double Ar=r*r*Math.PI;
                System.out.println(Ar);
            }
        };
        circle.getArea();
        circle.draw();

        Shape rectangle=new Shape() {
            int width=5,height=10;
            @Override
            public void draw() {
                System.out.println("Drawing Rectangle.");

            }

            @Override
            public void getArea() {
                double area=width*height;
                System.out.println(area);

            }
        };
        rectangle.draw();
        rectangle.getArea();

    };
}
