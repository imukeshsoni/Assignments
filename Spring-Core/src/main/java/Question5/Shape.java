package Question5;

import org.springframework.beans.factory.annotation.Required;

interface Shape {
    @Required
    public void draw();
}
