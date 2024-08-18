public class linked_list {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");
        list.addLast("Pineapple");

        // Display the LinkedList
        System.out.println("LinkedList: " + list);

        // Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove(1); // Remove element at index 1

        // Display the LinkedList after removals
        System.out.println("LinkedList after removals: " + list);

        // Iterate through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
