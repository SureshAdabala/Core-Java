package Arrays_Concept;

public class Sum_of_PrimeNumbers {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sumP = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				sumP += arr[i];
			}
		}
		System.out.println("Sum of prime numbers in an Array: " + sumP);

	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}
}