public class ques {
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Method to set data for employee
    public void setData(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    // Method to display employee data
    public void displayData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        // Creating an object of Employee
        Employee emp = new Employee();

        // Checking if command line arguments are provided
        if (args.length == 4) {
            // Parsing command line arguments
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            String designation = args[2];
            double salary = Double.parseDouble(args[3]);

            // Setting data for employee
            emp.setData(name, age, designation, salary);

            // Displaying employee data
            emp.displayData();
        } else {
            System.out.println("Invalid number of arguments. Please provide name, age, designation, and salary.");
        }
    }
}
