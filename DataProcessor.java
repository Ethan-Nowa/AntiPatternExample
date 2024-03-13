import java.util.*;

// Performs five calculations on a list of numbers.
public class DataProcessor {
	private List<Integer> numbers;

	public DataProcessor(List<Integer> numbers) {
		this.numbers = numbers;
	}

	// Calls the five calculations and prints results.
	public void processNumbers() {
		System.out.println("Processing numbers...");
		int sum = calculateSum(numbers);
		System.out.println("Sum of numbers: " + sum);

		double average = calculateAverage(numbers);
		System.out.println("Average of numbers: " + average);

		int max = calculateMax(numbers);
		System.out.println("Maximum number: " + max);

		int min = calculateMin(numbers);
		System.out.println("Minimum number: " + min);

		boolean allPositive = areAllPositive(numbers);
		System.out.println("All numbers positive: " + allPositive);
	}

	private int calculateSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	private double calculateAverage(List<Integer> numbers) {
		if (numbers.isEmpty()) {
			return 0.0;
		}

		int sum = calculateSum(numbers);
		return (double) sum / numbers.size();
	}

	private int calculateMax(List<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	private int calculateMin(List<Integer> numbers) {
		int min = Integer.MAX_VALUE;
		for (int num : numbers) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

	private boolean areAllPositive(List<Integer> numbers) {
		for (int num : numbers) {
			if (num <= 0) {
				return false;
			}
		}
		return true;
	}
}
