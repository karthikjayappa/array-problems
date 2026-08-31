public class solution{
    public int[] twosum (int[] numbers ,int target){
        int n= numbers.length;
        int l=0;
        int r=n-1;

        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[] {l,r};
            }
            else if(sum > target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String args[]){
        solution s = new solution();
        int[] numbers = {2,7,11,15};
        int target = 18;
        int[] result = s.twosum(numbers,target);
        System.out.println(result[0] + " " + result[1]);
    }
}
