public class NumberFormate_Exception {
    public static void main(String[] args) {
        String str = "Nitish";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException n){
            System.out.println("String "+str+ " can't be changed into integer");
        }

        System.out.println("Main method ended successfully");

    }
}
