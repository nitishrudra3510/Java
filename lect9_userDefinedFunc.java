//function overloading
public class lect9_userDefinedFunc {
    // void getvalues(int a){
    //     System.out.println(a);
    // }
    void getvalues(String b, int... a){
        System.out.println(b);
        // for(int i:a){
        //     System.out.println(i);
        // }
        System.out.println(a[0]);
    }
    void getvalues(int... a){
        for(int i:a){
            System.out.println(i);
        }
    }
// add
    void getvalues(int a, String b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        lect9_userDefinedFunc obj = new lect9_userDefinedFunc();
        obj.getvalues("nitish", 45);
        obj.getvalues(34, " NItish");

    }
}
