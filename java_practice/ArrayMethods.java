import java.util.Arrays;
import java.util.List;
public class ArrayMethods {

    public static void main ( String [] args)
    {
        int[] a = new int[10];
        
        for ( int i=0 ; i<10 ;++i) {
            a[i]=10-i;

        }
        Integer n;

        Arrays.fill(a,-1);

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        int index =Arrays.binarySearch(a, 5);

        System.out.println(index);

        int [] b ;
        b= Arrays.copyOf(a,a.length);

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(Arrays.equals(a,b));

        String k = "Hariharaprasad";
        System.out.println(k.toString());
        StringBuilder sb = new StringBuilder();
        for (char i :k.toCharArray())
        {
            System.out.println(i);
        }

        int[] arr = new int[10];
        Arrays.fill(arr,10);
        
        int [] ros = new int[10] ;

        System.out.println(Arrays.toString(ros));
        char[] av = {'a','b','v'};
        System.out.println();

        System.out.println('a'+'d');

        StringBuilder init7 = new StringBuilder().append("Chain").append(" Init");
        

       System.out.println(init7);

       init7.delete(0,3 );

       System.out.println(init7);

       init7.replace(0, 3,"IN"); // end is exclusive


       System.out.println(init7);

        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{")
                  .append("\"name\":\"John Doe\",")
                  .append("\"age\":30,")
                  .append("\"active\":true,")
                  .append("\"skills\":[\"Java\",\"Python\",\"JavaScript\"]")
                  .append("}");
        System.out.println("JSON-like string: " + jsonBuilder);



    }
    
}
