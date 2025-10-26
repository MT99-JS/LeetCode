class Solution {
    public int trap(int[] height) {

        int[] pMax = height.clone();
        int[] sMax = height.clone();
        int max = pMax[0];

        for(int i=1;i<height.length;i++){
            if(max<height[i]){
                max = height[i];
            }
            pMax[i] = max;
        }

        max = sMax[height.length-1];
        for(int i=height.length-1;i>0;i--){
            if(max<height[i]){
                max = height[i];
            }
            sMax[i] = max;
        }

        int tapWater = 0;


        for(int i=1;i<height.length-1;i++){
            int leftMax = pMax[i-1];
            int rightMax = sMax[i+1];
            int minimum
             = leftMax<rightMax ? leftMax: rightMax;
            int contribution = minimum - height[i];
            if(contribution>0){
            tapWater = tapWater + contribution;
            }

        }

        return tapWater;
        
    }
}