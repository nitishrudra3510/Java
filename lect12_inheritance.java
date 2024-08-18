class Bank{
    int rateofint;
    void getRateofint(){
        System.out.println("rate of INT: "+rateofint);
    }

    Bank(int a){
        System.out.println("from class bank");
    }
}
class SBI extends Bank{
    void checkbalance(){
        System.out.println("class from SBI");
    }
}

// for singal inheritance class;

// public class lect12_inheritance extends Bank{
//     public static void main(String[] args) {
//         lect12_inheritance obj = new lect12_inheritance();
//         obj.getRateofint();
//     }
// }


// multiple inheritance class;
public class lect12_inheritance extends SBI{
    public static void main(String[] args) {
        lect12_inheritance obj = new lect12_inheritance();
        obj.getRateofint();
        obj.checkbalance();
        
    }
}
