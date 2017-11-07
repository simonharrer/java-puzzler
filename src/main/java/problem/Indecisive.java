package problem;

public class Indecisive { 
    public static void main(String[] args) {
        System.out.println(decision());
        
        // what does it print?
        // a) true
        // b) false
        // c) none of the above?
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    } 
}
