import java.util.*;

public class Main {
	public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers();
        DataProcessor dataProcessor = new DataProcessor(numbers);
        dataProcessor.processNumbers();

        double radius = 5.0;
        double area = DataProcessor.calculateArea(radius);
        System.out.println("Area of the circle with radius " + radius + ": " + area);
        
        double circumference = DataProcessor.calculateCircumference(radius);
        System.out.println("Circumference of the circle with radius " + radius + ": " + circumference);
        
        double height = 10.0;
        double volume = DataProcessor.calculateVolume(radius, height);
        System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + ": " + volume);
        
        double surfaceArea = DataProcessor.calculateSurfaceArea(radius, height);
        System.out.println("Surface area of the cylinder with radius " + radius + " and height " + height + ": " + surfaceArea);
    }
	
	private static List<Integer> generateRandomNumbers() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }
}
