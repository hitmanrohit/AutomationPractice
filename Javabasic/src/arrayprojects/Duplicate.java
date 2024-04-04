package arrayprojects;

public class Duplicate {
	public static void main(String[] args) {
		int[] call= {1,2,3,4};
		int smallest= smallestElement(call);
		System.out.println(smallest);
	}
	static int smallestElement(int[] arr) {
		int smallest = arr[0];
		for (int i=1;i<arr.length;i++) {
			if (arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return smallest;
	}

}
