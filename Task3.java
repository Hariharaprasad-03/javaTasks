

class Task3 {


    public static int gcd( int a , int b) {
        if (a<=b) return gcd(b,a);
        if (a==b) return a;
        if (b==0) return a;

        return gcd(b,a%b);
    }

    public static int gcdBruteForec( int a ,  int b) {

        int gcd =1;

        for ( int i=2 ; i<Math.min(a,b); i++) {

            if (a%i==0 && b%i==0) {

                gcd = i;
            }
        }
        return gcd;
    }

    public static int lcmBruteForce(int a , int b) {

        int ans = a>b ? a:b;

        while (true) {

            if (ans%a==0 && ans%b==0) break;
            ans++;
        }
        return ans;
    }

    public static int lcm(int a, int b) {

        return ((a*b)/gcd(a, b));
    }

    public static double distanceOfPoints(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void printBinary(int n, StringBuilder sb) {
        if (n > 1) {
            printBinary(n / 2, sb);  
        }
        sb.append(n % 2); 
    }

    public static  String binaryValue(int n ) {

        StringBuilder sb = new StringBuilder();
        printBinary(n, sb);

        return sb.toString();

    }

    public static void pascalTriangle( int n ) {


        int[] pascal = new int[100];

        pascal[0] =1;

        for ( int i=1; i<=n ; ++i) {

            

            for ( int j =0 ; j<n ; j++) {
                
                if (j<n-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(pascal[j+i-n]+" ");
                }
            }

            for ( int j=i ; j>=1; j--) 
            {
                pascal[j]+= pascal[j-1]; 
            }
            System.out.println();
        }


    }

    public static void printPascal(int n) {
        
        for (int i = 0; i < n; i++) {
            
            for (int space = 0; space < n - i - 1; space++) 
            {
                System.out.print("  ");
            }

            int coeff = 1; 

            for (int j = 0; j <= i; j++) 
            {
                System.out.printf("%4d", coeff); 
                coeff = coeff * (i - j) / (j + 1); 
            }
            System.out.println();


            
        }
    }

    

    public static int evenNumersCnt(int[] arr , int start ) {

        if (start == arr.length ) return 0;

        int ans = 0;
        ans += arr[start]%2==0 ? 1: 0;

        return  ans + evenNumersCnt(arr, start+1);
    }

    private static int  recursiveMin( int [] nums ,int Idx ) {

        if (Idx==nums.length) return Integer.MAX_VALUE;

        int min = nums[Idx];
        min = Math.min(min , recursiveMin(nums,Idx+1));

        return min;

    }

    public static int minInArray(int[] nums ){

        int minimum = recursiveMin(nums, 0);

        if (minimum == Integer.MAX_VALUE) return -1;
        return minimum;
    }

    public static int factorial ( int n) 
    {
        if ( n<=1) return 1;
        return n*factorial(n-1);
        
    }

    public static int rangeSum( int start, int end) {

        if( start > end ) return rangeSum(end, start);
        if ( start == end ) return end;

        return start + rangeSum(start+1, end);
    }

    public static void countDown ( int n) {

        if ( n<0) return ;

        System.out.println(n);
        countDown(n-1);

    }

    public static int powOf(int n , int m) {

        if (m==0)return 1;
        return n*powOf(n,m-1);
    }

    public static void main( String [] args) {

        pascalTriangle(5);

        int a =16;
        int b =48;
        System.out.println("binary value of"+ a +"="+binaryValue(8));
        System.out.println("gcd of"+ a +"and"+ b +" ="+gcd(18, 48));
        System.out.println("lcm of"+ a +"and"+ b +" ="+lcm(18,48));
        System.out.println("distance of two points (0,0) and (1,1) = "  + distanceOfPoints(0, 0, 1, 1));


       int min = minInArray(new int[] {11,2,3,4,5,6});
       System.out.println(min);

       int evenCnt = evenNumersCnt(new int[] {1,2,3,4,2,4,4,5,6}, 0);
       System.out.println(evenCnt);

       
       
    }
}
