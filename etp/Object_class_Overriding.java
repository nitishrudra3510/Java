package etp;

class Myclass{
    int x;
    String name;

    Myclass(int x, int y){
        this.x = x;
        this.name = name;
    }

    public String toString(){
        return "x: "+ x + ", name : "+name;
    }

    public boolean equals(Object obj){
        if(obj instanceof Myclass){
            Myclass other = (Myclass)obj;
            return this.x == other.x && this.name.equals(other.name);
        }

        return false;
    }
}


public class Object_class_Overriding {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass(10, "John", 0);
        Myclass obj2 = new Myclass(10, "John");

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1);
    }
}
