class Solution {

    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int i = 0;
        int currsum = 0 ; 
        int res = 0 ;
        while(i<nums.length){
            currsum+=nums[i];
            if(map.containsKey(currsum-goal)){
                res+=map.get(currsum-goal) ;
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);
            i++;
        }
        return res;
    }
}