import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int count = 0;
        for(int i=2; i<=number-1; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==number){
            System.out.println("prime number");
        }else{
            System.err.println("Not prime number");
        }
        scanner.close();
    }
}
