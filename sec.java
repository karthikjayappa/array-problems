import java.util.Scanner;

class sec{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];

        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter number " + (i+1) + ":");
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){  
        System.out.println("You entered: " + numbers[i]);
        }

        int target = 8;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == target){
                System.out.println("Target number " + target + " found at index: " + i);
                return;
            }
        }
        System.out.println("Target number " + target + " not found in the array.");
    }
}