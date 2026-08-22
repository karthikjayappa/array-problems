// find the largest number among three numbers

public class largest {
    public static void  main (String a[]){

        int [] arr = {12,323,3,545,67,68,2};
        int largest = arr[0];

        for (int i=0; i<arr.length;i++){
            
               if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }   
}