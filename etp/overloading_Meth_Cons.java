package etp;

class Calculator{
    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a+b;
    }

    Calculator()
    {
        // default constructor;
    }

    Calculator(int a, int b){
        // Constructor with parameters
    }
    
}
public class overloading_Meth_Cons {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum1 = calc.add(11, 12);
        double sum2 = calc.add(3.5, 2.5);
    }
}
