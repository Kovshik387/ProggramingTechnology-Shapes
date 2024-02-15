package Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{

    private double height;

    public Square(int x, int y, Color color, double side){
        super(x,y,color); this.height = side;
    }

    @Override
    public void drawShape(GraphicsContext context) {
        context.setFill(getColor());
        context.fillRect(super.getX(),super.getY(),this.height, this.height);
    }

    @Override
    public String toString(){
        return "Квадрат с координатами x: " + super.getX() + " y: " + super.getY() + " Цвет: " + super.getColor().toString();
    }
}