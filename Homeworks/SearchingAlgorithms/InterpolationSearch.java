//  Implement interpolation search

public class InterpolationSearch {

  public static int interpolSearch(int[] nums, int val) {
      
    int low = 0, mid = 0, high = nums.length - 1;
    
    while (nums[low] <= val && nums[high] >= val) {
        
      mid = low + ((val - nums[low]) * (high - low)) / (nums[high] - nums[low]);
      if (nums[mid] < val) {
        low = mid + 1;
      } else if (nums[mid] > val) {
        high = mid - 1;
      } else return mid;
    }
    if (nums[low] == val) return low;
    
    return -1;
  }

  public static void main(String[] args) {

    int[] values = {12, 25, 35, 50, 70, 85, 100, 110, 125};

    System.out.println(interpolSearch(values, 25));

    System.out.println(interpolSearch(values, 111));
  }
}