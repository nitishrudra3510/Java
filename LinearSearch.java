public class LinearSearch {
    // Method to perform linear search
    public int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        // Parse command-line arguments into an integer array
        int[] arr = new int[args.length - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        // Parse the key
        int key = Integer.parseInt(args[args.length - 1]);

        // Create an instance of LinearSearch class
        LinearSearch searcher = new LinearSearch();

        // Perform linear search
        int position = searcher.linearSearch(arr, key);

        // Display the result
        if (position != -1) {
            System.out.println("Search element " + key + " is found at position : " + position);
        } else {
            System.out.println("Search element " + key + " is not found");
        }
    }
}

