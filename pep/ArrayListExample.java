// import java.util.ArrayList;
// public class ArrayListExample {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Cherry");

//         System.out.println("ArrayList: " + list);

//         list.remove("Banana");
//         System.out.println("After removing Banana: " + list);
//     }
    
// }

public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");

    System.out.println("ArrayList: " + list);

    list.addFirst("Mango");
    System.out.println("After adding Mango: " + list);

    list.addLast("Orange");
    System.out.println("After adding Orange: " + list);

    list.removeFirst();
    System.out.println("After removing first element: " + list);

    list.removeLast();
    System.out.println("After removing last element: " + list);
}
