// colors red, white, green
//using dutch national flag

//arr given [0,1,2,1,0,2,1,0,2]
// array of [0,0,0,1,1,1,2,2,2]

import java.util.Arrays;

public class color {
    public static void main(String[] args) {
        int [] arr = {0,1,2,1,0,2,1,0,2};
        int n= arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
            while(mid<=high){
            if(arr[mid]==0){
                arr[mid]=arr[low];
                arr[low]=0;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
