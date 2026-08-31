public class area{
    public static void main(String a[]){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int n =height.length;
        int left = 0;
        int right = n-1;
        int max = 0;

        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right - left;
            int area = h * w;     
             max = Math.max(max,area);

            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(max);
    }
}