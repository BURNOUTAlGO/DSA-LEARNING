class Solution {
    public int maxScore(int[] nums, int k) {

        int i = 0 ;
        int j = 0 ;
        int windowsum = 0;
        int totalsum = 0;
        int minsum = 0 ;
        for(int m = 0 ; m<nums.length ; m++){
            totalsum+=nums[m];
        }
        while(j<nums.length-k){
            windowsum+=nums[j];
            j++;
        }
        minsum=windowsum;
        while(j<nums.length){
            windowsum+=nums[j]-nums[i];
            minsum= Math.min(minsum,windowsum);
            i++;
            j++;
        }
        return totalsum-minsum;

        

        

        
    }
}