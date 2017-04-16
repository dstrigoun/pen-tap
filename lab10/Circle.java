package p4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import java.util.Random;

/**
 * Circle.
 * <p>Defines a Circle class with methods to create and 
 * draw a circle of random size, colour, and location.</p>
 * 
 * @author A00983479
 * @version 05/04/2017
 */
public class Circle {
    private int centerX, centerY;
    private int radius;
    private Color color;
    
    static Random generator = new Random();
    
    public Circle(Point point) {
        radius = Math.abs(generator.nextInt()%50 + 25);
        color = new Color(Math.abs(generator.nextInt())% 16777216);
        centerX = point.x;
        centerY = point.y;
    }
    
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }
    
    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }
    
    public boolean isInside(Point p) {
        double xPow = Math.pow((centerX - p.x), 2);
        double yPow = Math.pow((centerY - p.y), 2);
        int distance =(int) Math.sqrt(xPow + yPow);
        if (distance < radius) {
            return true;
        }
        return false;
    }
}
