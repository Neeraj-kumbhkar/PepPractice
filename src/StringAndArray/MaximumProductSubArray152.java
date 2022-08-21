package StringAndArray;

public class MaximumProductSubArray152 {
    public static int maxProduct(int[] nums){
        int currentProduct =1;
        int ans = Integer.MIN_VALUE; //-infinity
        for(int i:nums){
            currentProduct*=i;
            ans = Math.max(ans,currentProduct);
            if(currentProduct==0) currentProduct=1;
        }
        currentProduct=1;
        for (int i=nums.length-1;i>=0;i--){
            currentProduct*=nums[i];
            ans=Math.max(ans,currentProduct);
            if(currentProduct==0) currentProduct=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        /*Example 1:

        Input: nums = [2,3,-2,4]
        Output: 6
        Explanation: [2,3] has the largest product 6.
        Example 2:

        Input: nums = [-2,0,-1]
        Output: 0
        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/
        System.out.println(MaximumProductSubArray152.maxProduct(new int[]{2,3,-2,4})); //6
        System.out.println(MaximumProductSubArray152.maxProduct(new int[]{-2,0,-1}));  //0
        System.out.println(MaximumProductSubArray152.maxProduct(new int[]{-2,-1,0,4,3,0,3,2}));//12
    }
}
