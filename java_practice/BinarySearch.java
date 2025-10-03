public class BinarySearch {

    public int lowerBound (int[]nums,int key)
    {
        int start = 0;
        int end = nums.length -1;
        int mid =0;

        while ( start < end )
        {
            mid  = start +(end-start)/2;

            if (nums[mid]<key) start = mid+1;
            else end = mid; 
        }

        return start;

    }

    public int upperBound(int[]nums,int key){

        int start = 0;
        int end = nums.length -1;
        int mid =0;

        while ( start < end )
        {
            mid  = start +(end-start)/2;

            if (nums[mid]<=key) start = mid+1;
            else end = mid; 
        }

        return start;

    }

    public int binarySearch (int[]nums,int key)
    {
        int start = 0;
        int end = nums.length -1;

        int mid =0;

        while (start<=end)
        {
            mid  = (start+end)/2;

            if (nums[mid]==key) return mid;
            else if (nums[mid]<key) start=mid+1;
            else end = mid -1;
        }
        return -1;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int start =1;

        int end = 0;

        for (int i:piles) if (i>end) end = i;

        int ans = 1<<31;

        while (start <= end)
        {
            int mid = start + (end-start)/2;

            if ( check(piles,h,mid)) {

                ans = mid;
                end = mid-1;
            }
            else 
            {
                start = mid+1;
            }
        }
        return ans;

        
    }

    public boolean check(int[]piles, int h , int mid)
    {
        int totalHours = 0;

        for (int i :piles)
        {
            totalHours += (i+mid-1)/mid;

            if (totalHours > h ) return false;

        }
        return true;
    }

    public static void main ( String [] args) {

        BinarySearch b = new BinarySearch();

        System.out.println(b.lowerBound(new int[] {1,2,5,5,5,6}, 5));
        System.out.println(b.upperBound(new int[] {1,2,5,5,5,6}, 5));

    }
    
}
