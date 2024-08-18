package Oops;

class Ekclass {
    int a;

    Ekclass(int v){
        a = v;
    }
    public int getA(){
        return a;
    }

    public int returnONe(){
        return 1;

    }
}

public class super_this{
    public static void main(String args[]){
        Ekclass e = new Ekclass(5);
        e.getA();
    }
}
