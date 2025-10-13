import java.util.Arrays;

public class Task4 {


    public int minIdx(int[] nums,int idx , int end) {

        if (idx==end-1) return idx;

        int k = minIdx(nums,idx+1,end);


        return (nums[idx]<nums[k]) ? idx :k;
    }

    public void recursiveSelectionSort( int []nums , int n , int index) {

        if( index == n) return ;

        int k = minIdx (nums, index, n);

        if ( k!=index){

            int temp = nums[k];
            nums[k] = nums[index];
            nums[index] = temp;

        }
        recursiveSelectionSort(nums, n, index+1);
    }



    public static void BubbleSort(int[] nums) {

        int i , j, temp;
        int n = nums.length;
        boolean swapped = false;


        for ( i=0 ; i<n; ++i) {

            swapped = false;

            for (j=0 ; j<n-i-1; ++j) {

                if (nums[j]>nums[j+1]) {

                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                    swapped = true;

                }
                
            }
            if( ! swapped) 
                break;
        }
    }




    public static void recursiveBubbleSort( int[] nums , int n ) {

        boolean swapped = false;

        for ( int i=0 ; i<n-1 ; i++) {

            if(nums[i]>nums[i+1]) {

                int temp = nums[i];
                nums[i]= nums[i+1];
                nums[i+1] = temp;
                swapped = true;
            }
        }
        if ( ! swapped) 
            return ;

        recursiveBubbleSort(nums, n-1);
    }





    public static boolean recursivePalindrome ( String s , int i , int j ) {

        if ( i>=j) 
            return true;

        if (s.charAt(i)!=s.charAt(j)) 
            return false;

        return recursivePalindrome(s, i+1, j-1);
    }

    public static void insertionSort( int[] nums) {

        int n = nums.length;

        for ( int i= 0 ; i<n ; i++) {

            int pos =i;

            while (pos >0 && nums[pos]<nums[pos-1]) {  

                int temp = nums[pos];
                nums[pos] = nums[pos-1];
                nums[pos-1] = temp;

                pos--;   
            }  

        }
    }




    public static void  shellSort(int[] arr)
    {
        int n = arr.length;

      
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            
            for (int i = gap; i < n; i += 1)
            {
                
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        
    }



    public static  void recursiveShellSort(int[]nums ,int n, int gap ) {

       
        if (gap==0)
            return ;

        for ( int i= gap ; i<n ; i++) {

            int key = nums[i];
            int pos =i;

            while (pos>=gap && nums[pos-gap]>key) {

                nums[pos]=nums[pos-gap];
                pos-=gap;
                
            }
            nums[pos] = key;
        }
        recursiveShellSort(nums,n, gap/2);
    }




    public static void recursiveInertionSort(int[] nums,int n) {

        if ( n<=1) return ;

        recursiveInertionSort(nums, n-1);

        int key = nums[n-1];
        int pos = n-2;

        while (pos>=0 && nums[pos]>key) { 

            nums[pos+1]=nums[pos];
            pos--;
            
        }
        nums[pos+1]=key;

    
    }

    public static int recusiveLinearSearch ( int [] nums , int i ,int key ) {

        if ( i== nums.length)
            return -1;
        if (nums[i]==key)
            return i;
        return recusiveLinearSearch(nums, i+1, key);
    }




    public static int recursiveBinarySearch(int[] nums, int l, int r, int target) {
    if (l > r)  // base case first
        return -1;

    int mid = l + (r - l) / 2;  

    if (nums[mid] == target)
        return mid;

    else if (nums[mid] > target)
        return recursiveBinarySearch(nums, l, mid - 1, target);

    else
        return recursiveBinarySearch(nums, mid + 1, r, target);
    }




    public static void printBinary(int n, StringBuilder sb) {
        if (n > 1) {
            printBinary(n / 2, sb);  
        }
        sb.append(n % 2); 
    }

    public static String decimalToBinary( int n ) {

        StringBuilder sb = new StringBuilder();

        printBinary(n, sb);
        return sb.toString();
    }


    

    public static int gcd( int a , int b) {
        if (a<=b) return gcd(b,a);
        if (a==b) return a;
        if (b==0) return a;

        return gcd(b,a%b);
    }



    public static void main( String[] args) {

        int[] nums = {1,2,3,6,4,5,7,9,8,11,10,1,1,2};
        recursiveShellSort(nums, nums.length,nums.length/2);
        System.out.println(Arrays.toString(nums));
        System.out.println(recursiveBinarySearch(nums, 0, nums.length-1, 10));

    }
    
}
