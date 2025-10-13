
    
// Day-1 Java Assignment Questions: 
//     1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?                                                                                                                                                                          
//     2. Write a program in which, declare all data types like integer, double, float, long integer, character, byte data, and print them.                                                                                                                    
//     3. Write a program to find the maximum of two numbers using the ternary operator.                                                                                                     
//     4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?                                                                                                                                                      
//     5. Write a program that illustrate the execution order of static block and initializer block?                                                                                                                                                                                          
//     6. Write a program that illustrates the Explicit type casting for all data types?                                      
//     7. Write a program to check if a number is a power of 2 using bitwise operator?                                        
//      8. Write a program to find the first set bit of a number?

//     9. Write a class Employee with attributes empId, name, department and salary and define 
//          a parameterized constructor Employee(int empId, String name, String department, double salary) and assign these variables 
//          to instance variables accordingly and display them? Learn variable shadowing.  

//     10. Write a program to check whether the object is an instance of a particular class?

public class Day1 {

    // Static variable
    static int staticVar = 10;

    // Instance variable
    int instanceVar = 20;

    // Final variable
    final int finalVar = 30;

    public void variableScope() {
        // Local variable
        int localVar = 40;

        // Block variable
        {
            int blockVar = 50;
            System.out.println("Block Variable: " + blockVar);
        }

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Final Variable: " + finalVar);
    }

    public static void dataTypes(){
        int intVar = 100;
        double doubleVar = 100.5;
        float floatVar = 100.5f;
        long longVar = 100000L;
        char charVar = 'A';
        byte byteVar = 10;

        System.out.println("Integer: " + intVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Long: " + longVar);
        System.out.println("Character: " + charVar);
        System.out.println("Byte: " + byteVar);
    }

    public static void ternaryOperator(int a, int b){
        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);
    }

    public static boolean checkEqual(int a, int b){
        return (a ^ b) == 0;
    }

    public static void powerOfTwo(int n){
        if(n > 0 && (n & (n - 1)) == 0){
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }
    }

    public static void firstSetBit(int n){
        int position = 1;
        while((n & 1) == 0 && n > 0){
            n = n >> 1;
            position++;
        }
        if(n > 0){
            System.out.println("First set bit is at position: " + position);
        } else {
            System.out.println("No set bits found");
        }
    }

    public static void explicitTypeCasting(){
        double doubleVar = 100.5;
        float floatVar = (float) doubleVar;
        long longVar = (long) floatVar;
        int intVar = (int) longVar;
        char charVar = (char) intVar;
        byte byteVar = (byte) charVar;

        float f = 65.5f;
        double d = (double) f; // Explicit type casting from float to double
        System.out.println("Double: " + d);

        long var =Long.MAX_VALUE;
        System.out.println("Long: " + var);
        int n = (int) var; // Explicit type casting from long to int
        System.out.println("Int: " + n  );

        long long1 = (long) Integer.MAX_VALUE + 1;
        System.out.println("Long1: " + long1);
        int n1 = (int) long1; // Explicit type casting from long to int
        System.out.println("Int1: " + n1  );

        int char1 =(int) Character.MAX_VALUE + 1;
        System.out.println("Char1: " + char1);

        System.out.println("Double: " + doubleVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Long: " + longVar);
        System.out.println("Integer: " + intVar);
        System.out.println("Character: " + charVar);
        System.out.println("Byte: " + byteVar);

    }
    public static void main(String[] args) {
        
        explicitTypeCasting();

        Employee emp = new Employee(1, "sandeep vasan", "java dev", 175000);
        emp.display();

        System.out.println("Is emp an instance of Employee class?"+ (emp instanceof Employee));


}
}

class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}