package ArraysProgram;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int left = 0;
		int right = arr.length - 1;
		int maxwater = 0;
		while (left < right) {
			int width = right - left;
			int height = Math.min(arr[left], arr[right]);
			int currwater = width * height;
			maxwater = Math.max(maxwater, currwater);
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(maxwater);
	}
}
