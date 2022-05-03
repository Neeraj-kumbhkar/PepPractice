package StringAndArray;

public class FirstMissingPositiveNum41 {
    /*
    * Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
* */
    public static int firstMissngPositv(int[] nums){
        int i=0; int n = nums.length;
        while (i<n){
            if(nums[i]>0 && nums[i]<n+1 &&  nums[nums[i]-1]!=nums[i]){
                swap(nums,i,nums[i]-1);
            } else i++;
        }
        i=0;
        while (i<n){
            if(nums[i]!=i++ +1) return i;
        }
        return n+1;
    }
    public static void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        System.out.println(FirstMissingPositiveNum41.firstMissngPositv(new int[]{-2,2,0,1,3}));
    }
}
