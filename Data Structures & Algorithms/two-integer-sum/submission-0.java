class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ts = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]+nums[j] == target && i!=j){
                    ts[0] = i;
                    ts[1] = j;
                }
            }
        }
        Arrays.sort(ts);
        return ts;
    }
}
