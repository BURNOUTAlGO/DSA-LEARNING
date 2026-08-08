class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return countSubbarrayWithAtMostK(nums,k) - countSubbarrayWithAtMostK(nums,k-1);
    }

    private int countSubbarrayWithAtMostK(int [] nums , int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0 ;
        int right = 0 ;
        int count = 0 ;
        while(right<nums.length){

            int r = nums[right];
            map.put(r,map.getOrDefault(r,0)+1);

            while(map.size()>k){
                int l = nums[left];
                map.put(l,map.getOrDefault(l,0)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                left++;

            }
            count=count+right-left+1;

            right++;

        }
        return count;



    }
}