
public class Solution {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 1, 7, 34, 75, 23, 57};
		line();
		System.out.println("Unsorted Original List");
		line();
		for(int num : nums) {
			System.out.println(num);
		}
		line();
		System.out.println("Sorted List");
		selectionSort(nums);
		line();
		for(int num : nums) {
			System.out.println(num);
		}
	}

	static int[] selectionSort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int min = i;
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
			}
		}
		return nums;
	}
	
	static void line() {
		System.out.println("===========================");
	}
}
