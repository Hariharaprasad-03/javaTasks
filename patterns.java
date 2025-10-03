public class patterns {

    // creating non static methods to print patterns - call it ob ref with main function

    public void square(int n ) {

        for (int i=0 ; i<n ;++i) {
            for ( int j =0 ; j<n; ++j) {

                if (i==0 || j==0 || j==n-1||i==n-1)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }

    public void number_triangular(int n)
    {
        for ( int i=0; i<n;i++)
        {
            
            for (int j=0 ; j<n;++j)
            {
                if (j < n-i)
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print(i+" ");
                }
            }
            System.err.println();
        }
    }

    public void numIncreasingPramid(int n)
    {
        for (int i=0; i<n ;++i) {
            for (int j =0 ; j <i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void revIncPramid(int n){
        for (int i=n;i>=0;i--)
        {
            for ( int j=0 ; j<i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void numChangePramid(int n)
    {
        int temp =1;
        for (int i=0;i<n;++i)
        {
            for (int j =0 ; j <i;j++)
            {
                System.out.print(temp++ +" ");
            }
            System.out.println();
        }
    }
    public void ZeroOneTriangle(int n)
    {
        for (int i=0; i<n ; ++i){

            int temp = i&1;
            for(int j=0 ; j<i ; ++j){

                System.out.print(temp);
                temp = 1-temp;
            }
            System.out.println();

        }
    }
    public void RohmbusPattern(int n) {

        for ( int i=0 ; i<n;i++)
        {
            for (int j =0 ; j<i+n;++j)
            {
                if (j>i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
    public void palindrome_pramid(int n )
    {
        for( int i=0; i<n ; i++)
        {
            int temp =i;
            for ( int j=0 ; j <(n+i);j++)
            {
                if (j<n-i+1)
                {
                    System.out.print(" ");
                }
                else{

                    System.out.print(temp);
                    if (j<n)
                    {
                        temp--;
                    }
                    else 
                    {
                        temp++;
                    }
                }
            }
            System.out.println();
        }
    }
    public void pramid(int n)
    {
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
    }
    public void squarefill(int n ) {

        String stars ="*".repeat(n);
        for ( int i=0 ; i<n;i++) {
            System.out.println(stars);
        }
    }

    public void RightHalfPramid(int n )
    {
        for ( int i= 0 ; i<n; i++)
        {
            for ( int j=0 ; j<=i; ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void butterfly_pattern (int n)
    {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = n; i >= 1; i--) {
          
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void RevRightHalfpramid(int n )
    {
        for ( int i=n;i>0;i--)
        {
            for ( int j =0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void LeftHalfPramid(int n )
    {
        for ( int i=n ; i>0 ; i--)
        {
            for ( int j=1 ; j<=n ;j++)
            {
                if (i<=j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void RevLeftHalfPramid (int n )
    {
        for ( int i=1;i<=n;i++)
        {
            for ( int j=1 ; j<=n; ++j) {
                if ( i<=j){
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public void HalloTri(int n )
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < n * 2; j++)
            {
                if (i == n - 1 || i + j == n || j - i == n)
                {
                    System.out.print("*");
                } 

                else if (j > n - i && j < n + i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void left (int n)
    {
        for (int i=n; i>=1;--i)
        {
            for ( int j=n ; j>=1 ; --j) {

                if (j<=i)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }

    public void RightPascal(int n )
    {
        for ( int i=0; i<=2*n;i++) { 

            int range =0;

            if (i<=n) range =i;
            else range =(2*n)-i;
            
            for( int j=0; j<range;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        
         
    }

    public void RevNumberTriangle(int n ) {

        for ( int i=1 ; i<=n;i++)
        {
            for (int j =1;j<=n;++j) {

                if(j>=i) {
                    System.err.print(j+" ");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public void MirrorImageTriangle(int n) {
        for (int i=1;i<2*n;++i) {
            for(int j=1 ; j<=n;j++)
            {
                if (i<=n) {
                    if(j>=i) {
                    System.err.print(j+" ");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                else {

                    if (j>=2*n-i) {
                        System.out.print(j+" ");
                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
    
    public void kPattern(int n ) {

        for ( int i=0 ; i<2*n-1;i++)
        {
            int stars =0;
            if (i<n){
                stars =n-i;
            }
            else {
                stars = i-n+2;
            }

            for (int j=0; j<stars ;++j) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {

        System.out.println("printing patten");
        patterns p = new patterns();
        p.MirrorImageTriangle(5);

    }
}