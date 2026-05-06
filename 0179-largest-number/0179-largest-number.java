class Solution {
    public String largestNumber(int[] nums) {

        String[] stringArray = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            stringArray[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(stringArray,(a,b)->(b+a).compareTo(a+b));

        if(stringArray[0].equals("0")){
          return "0";
        } 

        StringBuilder result = new StringBuilder();
        for(String s : stringArray){
            result.append(s);
        }

        return result.toString();
        
    }
}