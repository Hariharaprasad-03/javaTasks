

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;



public class stack {

    public static void main(String [] args ) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(2);
        st.push(1);
        st.push(1);


        System.out.println(st.toString());

        System.out.println(st.isEmpty());

        int top = st.pop();
        System.out.println(top);

        int ntop = st.peek();
        System.out.println(ntop);


        int idx = st.indexOf(1);
        int lidx = st.lastIndexOf(1);

        System.out.println(idx+" " +lidx);

        System.out.println(st.contains(3));

        st.pop();

        System.out.println(st.toString());


        // ARRAY DEQUEUE AS A STACK


        Deque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<String> stringStack = new ArrayDeque<>();


        Deque<Integer> stack2 = new ArrayDeque<>(16);

        System.out.println(stack2);

        stack.push(5);           // Add to top
        stack.pop();                   // Remove from top
        stack.peek();                  // View top element
        stack.isEmpty();               // Check if empty
        stack.size();      


        // LL AS STACK

        Deque<Integer> stk = new LinkedList<>();

        stk.add(1);
        int up = stk.peek();
        System.out.println(up);


    }
    
}
