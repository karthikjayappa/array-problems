//finding largest and second largest number in an array


public class fourth {
    public static void main(String a[]){

        int [] arr = {21,334,343,45,45,6,6};
        int largest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                System.out.println(largest);
            }
        }
    }
}
