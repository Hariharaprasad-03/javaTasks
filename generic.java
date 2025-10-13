import java.util.Scanner;

public class generic<T> {
    private Object[] items;
    private int size;

    public generic() {
        items = new Object[10]; // default capacity
        size = 0;
    }

    public void add(T item) {
        if (size == items.length) {
            Object[] newItems = new Object[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[size++] = item;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) items[index];
    }

    public int size() {
        return size;
    }

    // Function to take input from user
    public void inputItems(int count, Scanner sc, Class<T> clazz) {
        for (int i = 0; i < count; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String input = sc.nextLine();
            T item = null;
            if (clazz == Integer.class) {
                item = clazz.cast(Integer.parseInt(input));
            } else if (clazz == Double.class) {
                item = clazz.cast(Double.parseDouble(input));
            } else if (clazz == String.class) {
                item = clazz.cast(input);
            }
        }
    }

    // Function to print all items
    public void printItems() {
        for (int i = 0; i < size; i++) {
            System.out.println(get(i));
        }
    }
}


