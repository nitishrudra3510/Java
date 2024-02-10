// class Welcome{
//     public static void main(String args[])  // 
//     {
//         System.out.println("Welcome " + args[0] + " " + args[1]);

//     }
// }



// create a Student class
// pass and line args as first name and last name.


// class Students{
//     public static void main(String args[])  // 
//     {
//         int a = 20;
//         int b = 10;

//         int sum = a+b;

//         System.out.println("Sum is "+sum);

//     }
// }

import java.util.Scanner;

public class lec1{
 boolean isPrime(int n)
	
	{
		
		// Corner cases
		
		if (n <= 1)
		
		return false;
		
		if (n <= 3)
		
		return true;
		
		if (n % 2 == 0 || n % 3 == 0)
		
		return false;

		for (int i = 5; i * i <= n; i = i + 6)
		
		if (n % i == 0 || n % (i + 2) == 0)
		
		return false;
		
		
		
		return true;
		
	}
	
	
	public void checkPrimeOrNot(int n){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
		if(isPrime(n)){
			System.out.println(n+" is a prime number");
		}else{
			System.out.println(n + " is not a prime number");
		}
	}
}