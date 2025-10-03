class Solution  {



    // Recursion

    //     Write a Java program to print the numbers from 1 to 'n'.

    //     Write a Java program to find the sum of 'n' numbers?

    //     Write a Java program to the sum of the digits of a number?

    //     Write a Java program to reverse a string without using string inbuilt function?

    //     Write a Java program to find the fibonacci series of 'n th ' term?




    public void printNum(int n) {
        if (n==0) return ;
        
        printNum(n-1);

        System.out.println(n); 
         
    }



    public int sumOfNumbers(int n) {

        if (n==1) return n;
        if (n<=0) return 0;

        return n + sumOfNumbers(n-1);
    }



    public int sumOfDigits(int n) {

        if (n<10) return n;

        int temp =0;

        while(n>0){

            temp += n%10;
            n = n/10;
        }
        return sumOfDigits(temp);
    }



    private String recurse(String s , int Idx , int len) {

        if (Idx>=len) return "";

        String ans = recurse(s, Idx+1, len);

        ans +=s.charAt(Idx);
        return ans;
    }

    public String reverseString( String s) {

        int n = s.length();

        String ans = recurse(s,0,n);

        return ans;
    }

    public int  fib( int n ) {

        if (n<=1) return n;
        return fib(n-2) + fib(n-1);
        
    }

    public static void main(String[] args) {
        
        Solution s = new Solution();

        
        s.printNum(10);
        String rev = s.reverseString("edcba");
        System.out.println(rev);
        System.out.println(s.sumOfNumbers(5));
        System.out.println(s.sumOfDigits(87));
    }


}