
// Performs calculations on a given circle's parameters.
public class CircleProcessor {
	private double radius;
	private double height;

	public CircleProcessor(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Calls the four calculations and prints results.
	public void processCircle() {
		System.out.println("Processing circle...");
        	double area = calculateArea();
        	System.out.println("Area of the circle with radius " + radius + ": " + area);
        
        	double circumference = calculateCircumference();
       	 	System.out.println("Circumference of the circle with radius " + radius + ": " + circumference);
        
        	double volume = calculateVolume();
        	System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + ": " + volume);
        
        	double surfaceArea = calculateSurfaceArea();
        	System.out.println("Surface area of the cylinder with radius " + radius + " and height " + height + ": " + surfaceArea);
	}
	
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}

	public double calculateVolume() {
		return Math.PI * radius * radius * height;
	}

	public double calculateSurfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
}
