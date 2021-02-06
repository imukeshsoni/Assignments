package Question5;

public class Circle implements Shape{
    private Point center;

    @Override
    public void draw()
    {
        System.out.println("Drawing circle!!");
        System.out.println("Center of the circle is : ("+ center.getX() + ", " + center.getY() + ")");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
