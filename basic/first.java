public class first {
    public static void main(String a[]){
        int[] arr = {9,56,34,23,12,45,67,89,90,100}; 
        // int first = Integer.MIN_VALUE;
        // int sec = Integer.MIN_VALUE;

        int first = 0;
        int sec = 0;
        int sum = 0;
        int average = 0;
        int length = arr.length;

        for(int i=0;i<arr.length;i++){
            if (arr[i]>first) {
                sec = first;
                first = arr[i];
                // System.out.println("largest :" + first);
            }
            // else if (arr[i] > sec && arr[i] != first) {
            //     sec = arr[i];
            //     System.out.println("sec largest:"+sec);
            // }

            //average
            sum=sum+arr[i];
            average = sum/arr.length;

        }
        System.out.println("Final largest: " + first);
        System.out.println("Final second largest: " + sec);
        System.out.println("total: " + sum);
        System.out.println("average: " + average);
        System.out.println("length: " + length);
    }
}
