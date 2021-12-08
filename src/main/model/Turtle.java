package main.model;

import main.controller.util.Util;

import java.awt.*;

public class Turtle{

    /**
     * Constructor
     * Initializes the currentLocation to (0,0)
     * Initializes the currentDirection to 0 degrees(Parallel to X-axis towards right)
     */
    public Turtle(){
        currentLocation = new Point(0,0);
        currentDirection = 0.0f;
    }

    /**
     * currentDirection: holds the current direction (in degrees) of the turtle
     * currentLocation:  holds the current location (X & Y coordinates) of the turtle
     */

    private float currentDirection;
    private Point currentLocation;

    /**
     * Move the turtle distance units in the current direction
     * @param distance
     */
    public void move(int distance){
        double radians = (float)(direction() * Math.PI / 180);
        double deltaX = Math.cos(radians) * distance;
        double deltaY = Math.sin(radians) * distance;
        location().setLocation(location().getX()+deltaX, location().getY()+deltaY);
    }

    /**
     * Add “degrees” to the current heading of the turtle
     * @param degrees
     */
    public void turn(int degrees){
        currentDirection = (currentDirection + degrees)%360;
    }

    /**
     * Returns the current direction of the turtle
     * @return currentDirection
     */
    private float direction(){
        return currentDirection;
    }

    /**
     * Returns the current location of the turtle.
     * @return currentLocation
     */
    private Point location(){
        return currentLocation;
    }

    /**
     * Returns the distance to the given point
     * @param target
     * @return
     */
    private float distanceTo(Point target){
        return Util.calculateDistanceBetweenPoints(location(), target);
    }

    /**
     * Returns the angle in degrees to the given point
     * @param target
     * @return
     */
    private float bearingTo(Point target){
        double Px = location().getX();
        double Py = location().getY();
        double Tx = target.getX();
        double Ty = target.getY();
        return (float)Math.toDegrees(Math.atan((Py - Ty)/(Px -Tx)));
    }

    public void print(){
        System.out.println(location());
        System.out.println(direction());
    }
}
