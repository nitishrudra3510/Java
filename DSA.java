// time complexity;

public class DSA {
    public void func1(int array[], int length) 
    {
        int sum = 0;
        int product = 0;
        for(int i=0; i<length; i++){
            sum+=array[i];
        }

        for(int i=0; i<length; i++){
            product += array[i];
        }
        
    }


    public static void main(String[] args) {
        int arr[] = {2,3,66};
        func1(arr,3);
        
    }
}



