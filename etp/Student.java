package etp;

// class Students{
//     String name;

//     Students(String name){
//         this.name = name;
//     }
// }


// public class Student {
//     public static void main(String args[]){
//         Students s1 = new Students("John");
//         System.out.println(s1.name);
//     }    
// }


class Example{
    int x;

    // intialize block
    {
        x = 10;

    }
    Example(){
        System.out.println("Contrucor called");
    }
}

public class Student{
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println("value of x : "+obj.x);
    }
}