
public class CircleProcessor {
	public static double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}

	public static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public static double calculateVolume(double radius, double height) {
		return Math.PI * radius * radius * height;
	}

	public static double calculateSurfaceArea(double radius, double height) {
		return 2 * Math.PI * radius * (radius + height);
	}
}
