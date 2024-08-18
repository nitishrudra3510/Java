// public class SequenceCount {
//     public int sequenceCount(int[] arr) {
//         int count = 0;
//         for (int i = 0; i < arr.length - 2; i++) {
//             if (arr[i] * 2 == arr[i + 1] && arr[i] * 3 == arr[i + 2]) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         // Example usage
//         SequenceCount sequenceCounter = new SequenceCount();
//         int[] arr = {2,6,8,2,1};
//         int sequences = sequenceCounter.sequenceCount(arr);
//         System.out.println("Number of sequences: " + sequences);
//     }
// }



public class SequenceCount {

    public int sequenceCount(int[] arr) {
        int count = 0;
        int prev = -1; // Initialize prev to -1 to avoid considering first element as part of a sequence

        for (int num : arr) {
            // Check if current element is part of a sequence
            if (num % 3 == 0 && num / 3 == prev + 1) {
                count++;
            }
            prev = num % 3; // Update prev for next iteration
        }

        return count;
    }
}
