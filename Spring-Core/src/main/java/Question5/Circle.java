package Question5;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

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
    @Resource(name = "pointA")
    public void setCenter(Point center) {
        this.center = center;
    }
}
