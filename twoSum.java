class Solution {
    /*
    input is an array and a target -> return two indices who's elements sum to target
    do we have a valid array and is it atleast size of 2
    1 approach for nested for loops -> O(n^2) time complexity - constant memory
    2nd aproach = Map and two loops -> O(n) time complexity and O(n) memory 
    */
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length < 2) return new int[0];

        int n = nums.length;
        Map<Integer, Integer> indexMap = new HashMap<>();

        // populate the index map
        for(int i = 0; i < n; i++) {
            indexMap.put(nums[i], i);
        }

        // find two sum
        for(int i = 0; i < n; i++) {
            int op = target - nums[i];
            if(indexMap.containsKey(op)) {
                int opIdx = indexMap.get(op);
                if(opIdx != i) return new int[]{i, opIdx};
            }
        }

        return new int[0];
    }
}
