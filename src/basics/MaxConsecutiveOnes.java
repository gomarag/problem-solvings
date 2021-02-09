/*
 * Example 1:
	Input: [1,1,0,1,1,1]
	Output: 3
	Explanation:The first two digits or the last three digits are consecutive 1s.
	    		The maximum number of consecutive 1s is 3.
	Note:
	
	The input array will only contain 0 and 1.
	The length of input array is a positive integer and will not exceed 10,000
 */

package basics;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int currCount = 0;
		
		for (int el : nums) {
			if (el == 1) {
				currCount++;
			} else {
				if (max < currCount) {
					max = currCount;
				}
				if (max >= nums.length / 2) {
					return max;
				}
				currCount = 0;
			}
		}
		return Math.max(max, currCount);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 1, 0, 1, 1, 1};
		int res = findMaxConsecutiveOnes(arr);
		System.out.println(res);
	}
}
