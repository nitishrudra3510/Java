public class try_throw_catch {
    public static void main(int a, int b){
        
    }
        
    
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Cannot divide by zero");
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }catch(NullPointerException ex){
            
        }
    }
}
