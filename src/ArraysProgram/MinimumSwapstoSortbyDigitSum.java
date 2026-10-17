package ArraysProgram;

public class MinimumSwapstoSortbyDigitSum {

	public static void main(String[] args) {
        int nums[]= {18,43,34,16};
		int arr[] = new int[nums.length];
		for (int i = 0; i <= nums.length - 1; i++) {
			int sum = 0;
			while (nums[i] > 0) {
				int digit = nums[i] % 10;
				sum += digit;
				nums[i] = nums[i] / 10;
			}
			arr[i] = sum;
			sum = 0;
		}
		int count = 0;
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			if (arr[i] >= arr[j]) {
				count++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(count);

	}
}