package Model;

import javafx.scene.paint.Color;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;
    @BeforeEach
    public void Setup(){
        circle = new Circle(10,10,Color.AQUA,30.,30.);
    }

    @Test
    public void testNotNull(){
        assertNotNull(circle);
    }

    @Test
    public void testSet(){
        var newCircle = new Circle(20,20,Color.RED,40.,40.);
        assertEquals(newCircle.getClass(),circle.getClass());
    }

    @Test
    public void testSetupShape() {
        assertEquals(10,circle.getX());
        assertEquals(10,circle.getY());
        assertEquals(Color.AQUA,circle.getColor());
    }

    @Test
    public void testToString(){
        var expectedString = "Круг с координатами x: 10" + " y: " + 10 + " Цвет: " + Color.AQUA.toString();
        assertEquals(expectedString,circle.toString());
    }

    @Test
    public void testWrong(){
        var wrongString = "Круг";
        assertEquals(wrongString,circle.toString());
    }
}