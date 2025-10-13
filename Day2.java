

// 5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5,...n using the continue statement.
// 6. Define a method to convert the decimal number to a binary number?
// 7. Use if and switch case statements to find the grade of a student.
// Percent>=85 && Percent<=100 Grade ‘A’
// Percent>=70 Grade ‘B’
// Percent>=50 Grade ‘C’


// 1. Write a program that creates an integer array of 10 elements, accepts values of arrays, and find the sum of all odd numbers.
// 2. Write a program to take in 10 values and print only those numbers which are prime.
// 3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
// 4. Design a function void print( ) with a single dimensional array x[] and n (as size of the array) as function arguments. The function calculates the sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
// 5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
// X[] =('m', 'n', 'o', 'p'} and
// Y[] =('m', 'n', 'o', 'p' }
// 6. Write a program to accept the year of graduation from school as an integer value from the users. Using the Binary search technique on the sorted array of integers given below. Output the message “record exists" if the value input is located in the array, and if not output the message record does not exits”.
// {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
// 7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
// 8. Write a program which takes in 10 people’s age and gives the number of people who are <18, 18-60, or >60.
// 9. Write an array which takes in roll no and marks in three subjects for 10 students. Format and Print the roll no, total marks, and average for all students in a table form.
// 10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
//  1 To input elements into a matrix of size m x n
//  2 To display elements of a matrix of size m x n
//  3 Sum of all elements of a matrix of size m x n
//  4 To display the row-wise sum of the matrix of size m x n
//  5 To display the column-wise sum of the matrix of size m x n
//  6 To create a transpose of the matrix of size n x m
public class Day2 {
    public static void pattern1( int n ){

        for ( int i=0 ; i<n ; i++ ){
            for ( int j=0 ; j<n ; j++ ){
                
                if (i==j || i+j == n-1 )
                    System.out.print(1);
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void evenSum( int n ){
        int sum = 0;
        for ( int i=1 ; i<=n ; i++ ){
            if ( i%2 != 0 )
                continue;
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to "+n+" is: "+sum);
    }
    public static void grade( int percent ){
        if ( percent >= 85 && percent <= 100 )
            System.out.println("Grade A");
        else if ( percent >= 70 )
            System.out.println("Grade B");
        else if ( percent >= 50 )
            System.out.println("Grade C");
        else
            System.out.println("Grade F");
    }

    public void decimalToBinary( int n ){
        StringBuilder binary = new StringBuilder();
        while ( n > 0 ){
            int rem = n % 2;
            binary.insert(0, rem);
            n = n / 2;
        }
        System.out.println("Binary representation: "+binary.toString());
    }

    
        

    

    public static void main(String[] args) {//////
        
    }

    // helper to read n ints with prompt
    public static int[] readNInts(java.util.Scanner sc, int n, String prompt) {
        int[] a = new int[n];
        System.out.println(prompt);
        for (int i = 0; i < n; ) {
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                a[i] = Integer.parseInt(line);
                i++;
            } catch (Exception e) {
                System.out.println("Invalid input, try again:");
            }
        }
        return a;
    }

    public static double[] readNDoubles(java.util.Scanner sc, int n, String prompt) {
        double[] a = new double[n];
        System.out.println(prompt);
        for (int i = 0; i < n; ) {
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                a[i] = Double.parseDouble(line);
                i++;
            } catch (Exception e) {
                System.out.println("Invalid input, try again:");
            }
        }
        return a;
    }

    // 2. print primes
    public static void printPrimes(int[] a) {
        System.out.println("Prime numbers:");
        for (int v : a) {
            if (isPrime(v)) System.out.print(v + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0) return false;
        int r = (int) Math.sqrt(x);
        for (int i = 3; i <= r; i += 2) if (x % i == 0) return false;
        return true;
    }

    // 3. fibonacci
    public static int[] generateFibonacci(int n) {
        int[] f = new int[n];
        if (n > 0) f[0] = 0;
        if (n > 1) f[1] = 1;
        for (int i = 2; i < n; i++) 
            f[i] = f[i-1] + f[i-2];
        return f;
    }

    // 4. sum single and double digit
    public static void printSingleAndDoubleDigitSums(int[] x, int n) {
        int single = 0, doub = 0;
        for (int i = 0; i < n; i++) {
            int v = Math.abs(x[i]);
            if (v <= 9) single += x[i];
            else if (v <= 99) doub += x[i];
        }
        System.out.println("Sum of single-digit elements: " + single);
        System.out.println("Sum of double-digit elements: " + doub);
    }

    // 7. selection sort descending for doubles
    public static void selectionSortDescending(double[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int maxIdx = i;
            for (int j = i+1; j < n; j++) 
                if (a[j] > a[maxIdx]) 
                maxIdx = j;
            double tmp = a[i]; 
            a[i] = a[maxIdx]; 
            a[maxIdx] = tmp;
        }
    }

    // 8. age categories
    public static int[] ageCategories(int[] ages) {
        int[] counts = new int[3];
        for (int a : ages) {
            if (a < 18) counts[0]++;
            else if (a <= 60) counts[1]++;
            else counts[2]++;
        }
        return counts;
    }

    // 9. student marks table for 10 students
    public static void studentMarksTable(java.util.Scanner sc) {
        final int STUD = 10;
        System.out.println("Enter roll no and marks for 3 subjects for " + STUD + " students (separated by spaces):");
        System.out.println("Format: roll marks1 marks2 marks3");
        System.out.printf("%-8s %-10s %-10s\n", "Roll", "Total", "Average");
        for (int i = 0; i < STUD; ) {
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split("\\s+");
                if (parts.length < 4) { System.out.println("Need 4 values"); continue; }
                int roll = Integer.parseInt(parts[0]);
                int m1 = Integer.parseInt(parts[1]);
                int m2 = Integer.parseInt(parts[2]);
                int m3 = Integer.parseInt(parts[3]);
                int total = m1+m2+m3;
                double avg = total/3.0;
                System.out.printf("%-8d %-10d %-10.2f\n", roll, total, avg);
                i++;
            } catch (Exception e) { System.out.println("Bad input, retry line"); }
        }
    }

    // 10. matrix menu and helpers
    public static void matrixMenu(java.util.Scanner sc) {
        System.out.print("Enter rows m: ");
        int m = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter cols n: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] A = new int[m][n];
        while (true) {
            System.out.println("Matrix options: 1-input 2-display 3-sum 4-rowSum 5-colSum 6-transpose 0-exit");
            System.out.print("Choice: ");
            String c = sc.nextLine().trim();
            if (c.equals("0")) break;
            switch (c) {
                case "1":
                    System.out.println("Enter elements row by row:");
                    for (int i = 0; i < m; i++) 
                        for (int j = 0; j < n; j++) 
                            A[i][j] = Integer.parseInt(sc.nextLine().trim());
                    break;
                case "2":
                    displayMatrix(A);
                    break;
                case "3":
                    System.out.println("Sum of all elements: " + sumMatrix(A));
                    break;
                case "4":
                    int[] rs = rowWiseSum(A); 
                    for (int i = 0; i < rs.length; i++) 
                        System.out.println("Row " + i + " sum: " + rs[i]);
                    break;
                case "5":
                    int[] cs = colWiseSum(A); 
                    for (int j = 0; j < cs.length; j++) 
                        System.out.println("Col " + j + " sum: " + cs[j]);
                    break;
                case "6":
                    int[][] t = transpose(A); 
                        displayMatrix(t); break;
                default: System.out.println("Invalid");
            }
        }
    }

    public static void displayMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                 System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    public static int sumMatrix(int[][] A) { 
        int s=0; for (int i=0;i<A.length;i++) 
        for (int j=0;j<A[0].length;j++) 
            s+=A[i][j]; return s; 
    }
    public static int[] rowWiseSum(int[][] A) { 
        int[] r=new int[A.length]; 

        for (int i=0;i<A.length;i++) 
            for (int j=0;j<A[0].length;j++) 
                r[i]+=A[i][j]; return r; 
    }
    public static int[] colWiseSum(int[][] A) { 
        int[] c=new int[A[0].length];

        for (int i=0;i<A.length;i++) 
            for (int j=0;j<A[0].length;j++) 
                c[j]+=A[i][j]; return c; 
    }

    public static int[][] transpose(int[][] A) { 
        int m=A.length,n=A[0].length; 
        int[][] t=new int[n][m]; 

        for (int i=0;i<m;i++) 
            for (int j=0;j<n;j++) 
                t[j][i]=A[i][j]; return t; }

    // 1. Sum of odd numbers in a 10-element integer array
    public static int sumOddArray(int[] a) {
        if (a == null) return 0;
        int sum = 0;
        int count = Math.min(a.length, 10); // only consider up to 10 elements
        
        for (int i = 0; i < count; i++) {
            if (a[i] % 2 != 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}