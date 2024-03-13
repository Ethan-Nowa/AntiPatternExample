
public class CircleProcessor {
    // Golden Hammer: Overuse of a single tool (method) that may not be suited for the problem
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    
    public static double calculateSurfaceArea(double length, double width, double height) {
        return 2 * ((length * width) + (length * height) + (width * height));
    }
}
