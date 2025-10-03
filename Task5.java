import java.util.Scanner;

public class Task5 {

    public static void getInputTwoDArray(int[][] arr) {

        Scanner sc = new Scanner(System.in);

        for ( int i = 0 ; i < arr.length ; ++i) {

            for ( int j = 0 ; j < arr[i].length ; ++j) {

                arr[i][j] = sc.nextInt();

            }

        }
        sc.close();

    }

    public static void printTwoDArray(int[][] arr) {

        for ( int i = 0 ; i < arr.length ; ++i) {

            for ( int j = 0 ; j < arr[i].length ; ++j) {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }

    }
    public static void getInput(int[] arr) {

        Scanner sc = new Scanner(System.in);

        for ( int i = 0 ; i < arr.length ; ++i) {

                arr[i] = sc.nextInt();

        }
        sc.close();

    }
    public static void printArray(int[] arr) {

        for ( int i = 0 ; i < arr.length ; ++i) {

                System.out.print(arr[i]+" ");

        }
        System.out.println();

    }

    public static int diagonalSum(int[][] arr){
        int sum = 0;
        int i=0 , j=arr[0].length -1;
        while ( i < arr.length && j>=0) {
            if ( i==j) {
                sum+=arr[i][j];
            }
            else {
                sum+=arr[i][j]+arr[j][i];
            }
        }
        return sum;
    }

    public static int oddLengthSubarraySum(int[] nums) {
        int sum =0;
        for ( int i = 0 ; i < nums.length ; ++i){

            int contribution = (i+1)*(nums.length-i);
            int oddContibution = contribution/2;
            if ( contribution%2==1) oddContibution++;
            sum += oddContibution*nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,4,2,5,3};
        System.out.println(oddLengthSubarraySum(nums));
                
    }
    
}
