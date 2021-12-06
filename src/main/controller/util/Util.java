package main.controller.util;

import java.awt.*;

public class Util {

    /**
     * Accepts two Points(X,Y) as input and returns the distance between them
     * @param a -- Point a
     * @param b -- Point b
     * @return
     */
    public static float calculateDistanceBetweenPoints(
            Point a, Point b) {
        double x1 = a.getX();
        double x2 = b.getX();
        double y1 = a.getY();
        double y2 = b.getY();

        return (float)Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}
