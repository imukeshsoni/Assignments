package Question6;

import javax.inject.Inject;

public class Circle implements Shape {
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
    // Inject annotation mathces byType first so it accessed "pointA" bean in spring.xml
    @Inject
    public void setCenter(Point center) {
        this.center = center;
    }
}
