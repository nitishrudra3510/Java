public class armstrong {
    
    public static boolean isArmstrong(int number) {
        int numDigits = String.valueOf(number).length();
        int sum = 0;
        int originalNumber = number;
        
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Armstrong <number>");
            return;
        }
        
        int num = Integer.parseInt(args[0]);
        System.out.println("Cmd Args: " + num);
        
        if (isArmstrong(num)) {in 
            System.out.println("The given number " + num + " is an Armstrong number");
        } else {
            System.out.println("The given number " + num + " is not an Armstrong number");
        }
    }
}
