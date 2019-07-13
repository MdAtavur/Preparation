/**
 * Created by AM051984 on 7/11/2019.
 */
public class Arrays1 {

    class Solution {

        public int getSum(int i, int j, int[] nums){
            int sum = 0;
            for(int x = i; x<=j; x++){
                sum+=num[x];
            }
            return sum;
        }
        public int pivotIndex(int[] nums) {
            int leftSum = 0, rigtSum=0;
            for(int i=1; i< nums.length ; i++){
                leftSum = getSum(0, i-1, nums);
                rightSum = getSum(i+1, nums.length-1, nums);
                if(leftSum == rightSum){
                    return i;
                }
            }
            return -1;


        }

    }
    }
}
