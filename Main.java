import java.util.*;

public class Main {
	public static void main(String[] args) {
		// Generates a list of numbers and performs calculations on it.
		List<Integer> numbers = generateRandomNumbers();
        	DataProcessor dataProcessor = new DataProcessor(numbers);
        	dataProcessor.processNumbers();
		
        
        	// Performs calculations on a given circle's parameters.
		double radius = 5.0, height = 10.0;
        	CircleProcessor circleProcessor = new CircleProcessor(radius, height);
        	circleProcessor.processCircle();
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
