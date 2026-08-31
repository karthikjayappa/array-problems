public class maxsub {
    public static void main(String a[]){
        int [] arr = {1,4,2,10,23,3,1,0,20};
        int n = arr.length;
        int k = 4;
        int submax = 0;
        for(int i=0;i<k;i++){
            submax += arr[i]; 
        }
        
        int max = submax;

            for(int j=k;j<n;j++){
                submax +=arr[j];
                submax -=arr[j-k];

                max = Math.max(max, submax);
            }
        
        System.out.println(max);
    }
}
