import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

class task1 {




    public void pattern1(int n ) {


        for ( int i=0 ;i<n ; i++) {

            for ( int j =0 ; j<=i ; ++j) {
                
                if ((j&1)==0) 
                    System.out.print("* ");
                else 
                    System.out.print("# ");
            }
            System.out.println();
        }
    }






    public void pattern2(int n ) {

        for ( int i=0; i<n;  ++i) {

            for( int j =0 ; j < n-i; ++j ) {

                if ((j&1)==0) 
                    System.out.print("* ");
                else 
                    System.out.print("# ");

            }
            System.out.println();
        }
    }






    public void prime(){

        int n = 100;
        int i = 2;

        Scanner scanner = new Scanner(System.in);

        boolean[] primes = new boolean[101];
        Arrays.fill(primes,true);

        
        ArrayList<Integer> nonPrimeList = new ArrayList<>();
        while(i*i <=n){

            if (primes[i])
                for( int j = (i*i) ; j<=n ; j+=i){
                    primes[j]=false;
                    nonPrimeList.add(j);

                }
            i+=1;
        }

        int choice=0;

        do {

            System.out.println("Enter options :");
            System.out.println("1: For primes  2: For Non primes 3 : to Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1: {

                    for ( int j = 2 ; j < 101 ; ++j ) {
                        if ( primes[j] ) {
                            System.out.print( j +" ");
                        }

                    }
                    System.out.println();
                    break;
                }
                case 2: {

                    // for ( int j = 2 ; j < 101 ; ++j ){

                    //     if ( !primes[j] ) {
                    //         System.out.print( j +" " );
                    //     }

                    // }
                    // System.out.println();

                    System.out.println(nonPrimeList.toString());
                    break;


                }
                default:
                    break;
            }
        }while ( choice<=2 && choice !=0 && choice >0 );
        scanner.close();
    }

    public boolean isPrime(int n ){

        for ( int i = 2 ;i < (n/2) ; ++i ){

            if ( n%i==0 ) 
                return false;
        }

        return true;
    }

    public int reverseNum( int n ){

        int sign = 1;
        int num =0;

        if (n<0) sign = -1;

        while(n>0){
            num = num * 10 + n%10;
            n/=10;
        }

        return sign*num;
    }

    public boolean twistedPrime(int n ) {

        int rev = reverseNum(n);

        return (isPrime(n) && isPrime(rev));
    }

    public int fact( int n ){

        if (n==1) return 1;

        return n*fact(n-1);
    }

    public int sumOfSeries(int n){

        int sum =0;

        for ( int i=1; i<=n ; ++i){
            sum += (1/fact(i));
        }

        return sum;
    }

    public void pattern3(String s){

        int n = s.length();

        for( int i=0 ; i<2*n ; i++ ) {

            int range =0;

            if (i <n) range = i;
            
            else {
                int r = 2*n-2;
                range = r-i;
            } 

            for( int j =0 ; j <= range ; j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    }

    public void kPattern(int n) {

        for ( int i=0 ; i<= 2*n ; ++i) {

            for ( int j =0 ; j<=n; ++j) {

                if ( j==0 || i+j==n || i-j==n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    

    public void hallDiamond( int n ) {

        for ( int i=0 ; i<=2*n ; ++i) {
            for ( int j =0 ; j<= 2*n ; ++j) {

                if ( i+j==n || j-i==n || i-j==n || i+j == 3*n) {
                    
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public String zigzagPattern( int numRows ) {

        String s = "WELCOMETOZOHO";

        if (numRows ==1) return s;

        int len = s.length();

        StringBuilder sb = new StringBuilder();

        for ( int i=0 ; i< numRows ; ++i) {

            for ( int j = i ; j<len ; j+=2*(numRows-1) ) {

                sb.append(s.charAt(j));

                if( i>0 && i<numRows-1 && j+2*(numRows-1)-(2*i)<len){
                    sb.append( s.charAt( j + 2 * ( numRows - 1 ) - ( 2*i )));
                }
            }
        }
        return sb.toString();
        

    }

    public void inverseTriangle ( int n ) {

        for (int i=0 ; i<=n ; ++i){

            for ( int j =0 ; j <i ; j++) {
                System.out.print(" ");
            }

            for( int j =0 ; j<n-i;j++){
                
                if ( (j&1)==0) {
                    System.out.print("*");

                }
                else {
                    System.out.print("#");
                }
            }

            if (i==n){
                
                if((n&1)==0) {
                    System.out.println("*");

                }
                else {
                    System.out.println("#");
                }

            }

            for ( int j =i ; j<n; j++) {

                if ( (j&1)==0) {
                    System.out.print("*");

                }
                else {
                    System.out.print("#");
                }

            }
            System.out.println();

        }
    }

    public void mirrorTriangle (int n ) {

        int temp =0;

        for ( int i=1 ; i<=n ; i++) {

            temp+=i;
            int cnt = temp;

            for ( int j = 0 ; j<i ; j++){

                System.out.print(cnt-- +" ");

            }
            
        }
    }



    public static void main( String[] args) {

        task1 t = new task1();

        t.hallDiamond(10);
        


      
    }






    

    

}