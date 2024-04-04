package arrayprojects;
//left rotate

public class Copyarray {
	public static void main(String[] args) {
		int numbers[] = new int[] { 1, 2, 3, 4 };
		int result[] = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			result[i] = numbers[i];
		}
		System.out.println("old array");
		for (int num : numbers) {
			System.out.println(" " + num);
		}
		System.out.println("new array");
		for (int num : result) {
			System.out.println(" " + num);
		}
	}
}
