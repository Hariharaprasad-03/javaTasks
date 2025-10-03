import java.util.Arrays;

public class InsertionSort {


    public static  void swap ( int[] nums , int i , int j ) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    // swap based
    public static void insertionSort(int[]nums) {

        for ( int i = 0 ; i < nums.length ; ++i) {

            int pos =i;

            while ( pos>0 && nums[pos-1]>nums[pos]) {

                swap(nums, pos-1,pos);
                pos--;
            }
        }
    }

    // shift based 

    public static void insertionSort2(int[] nums) {

        for ( int i = 0 ; i < nums.length ; ++i) {

            int pos =i;
            int key = nums[i];

            while ( pos>0 && nums[pos-1]>key) {

               nums[pos] = nums[pos-1];
               pos--;
            }
            nums[pos] = key;
        }


    }

    // recursive InsertionSort 

    public static void recursiveInertionSort(int[] nums,int n) {

        if ( n<=0) return ;
        recursiveInertionSort(nums, n-1);

        int key = nums[n];
        int pos = n-1;

        while (pos>=0 && nums[pos]>key) {
            nums[pos+1]=nums[pos];
            pos--;   
        }
        nums[pos+1]=key;

    }

    public static void main(String[] args) {
        
        int[] nums = {5,4,3,2,1};
        // insertionSort(nums);
        // insertionSort2(nums);
        recursiveInertionSort(nums, nums.length-1);
        System.out.println(Arrays.toString(nums));
                
    }
    
}
