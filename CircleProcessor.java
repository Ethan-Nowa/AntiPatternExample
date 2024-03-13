
public class CircleProcessor {
	public double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public double calculateVolume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}

	public double calculateSurfaceArea(double radius, double height) {
		return 2 * Math.PI * radius * (radius + height);
	}
}
