class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int i = 0 ; 
        int oddcount = 0 ;
        int res = 0 ;
        while(i<nums.length){
            if(nums[i]%2!=0){
                oddcount++;
            }
            if(map.containsKey(oddcount-k)){
                res+=map.get(oddcount-k);
            }
            map.put(oddcount,map.getOrDefault(oddcount,0)+1);
            i++;
        }
        return res;


        
    }
}