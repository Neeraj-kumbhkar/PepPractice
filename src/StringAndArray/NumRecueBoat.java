package StringAndArray;

import java.util.Arrays;

https:leetcode.com/problems/boats-to-save-people/
/*Input: people = [1,2], limit = 3
        Output: 1
        Explanation: 1 boat (1, 2)
        Example 2:

        Input: people = [3,2,2,1], limit = 3
        Output: 3
        Explanation: 3 boats (1, 2), (2) and (3)
        Example 3:

        Input: people = [3,5,3,4], limit = 5
        Output: 4
        Explanation: 4 boats (3), (3), (4), (5) */
public class NumRecueBoat {
    public static int numRescueBoats(int[] people,int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        int ans = 0;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
                r--;
                ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
     int[] arr = new int[]{3,2,2,1};
     int limit =3;
     System.out.println(new NumRecueBoat().numRescueBoats(arr,limit));
    }
}
