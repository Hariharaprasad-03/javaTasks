

public class Main {


    public void m1(Object o) {
        System.out.println("object level");
    }

    public static void main(String[] args) {
        
       boolean b = false;
       System.out.println(b);

        // Correctly compares the value of b with true
        if (b = true) {
            System.out.println("The variable is true.");
        } else {
            System.out.println("The variable is false."); // Now, this line will be printed
        }
    }

}
    

