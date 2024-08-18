
public class bubbleSorting {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swapping elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 15, 12, 10};

        // Sorting the array using bubble sort
        bubbleSort(array);

        // Printing the sorted array
        for (int num : array) {
            System.out.println(num);
        }
    }
}
 