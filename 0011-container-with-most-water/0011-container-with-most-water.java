class Solution {
    static int left;
    static int right;
    public int maxArea(int[] height) {
        int answer = Integer.MIN_VALUE;
        left = 0;
        right = height.length-1;
        
        while(left<=right){
            answer = Math.max(answer,evalArea(height));
        }
        return answer;
    }
    public static int evalArea(int[] height){
        int h = Math.min(height[left],height[right]);
        int w = right-left;
        System.out.println(left+","+right);
        System.out.println(h*w);

        if(height[left]<height[right]){
            left++;
        }
        else if(height[left]>height[right]){
            right--;
        }
        else{
            left++;
            right--;
        }
       
        return h*w;
    }
}