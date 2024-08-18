package etp;

class EMployee {
    String name;
    int age;

    EMployee(String Empname, int Empage){
        name = Empname;
        age = Empage;
    }


    void displayDetails()

    {
        System.out.println("Name: "+name);
        System.out.println("Age : "+age);
    }
}


public class EMployee_cons{
    public static void main(String[] args){
        EMployee emp = new EMployee("John", 20);
        emp.displayDetails();
    }
}
