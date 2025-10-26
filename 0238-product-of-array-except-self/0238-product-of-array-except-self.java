class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = nums.clone();
        
        for(int i=1;i<nums.length;i++){
           prefixProduct[i] = nums[i] * prefixProduct[i-1];
        }


        int suffix = 1;
        for(int i = nums.length-1;i>0;i--){
            prefixProduct[i] = prefixProduct[i-1] * suffix;
            suffix = suffix * nums[i];
        }

        prefixProduct[0] = suffix;
        return prefixProduct;
        
    }
}