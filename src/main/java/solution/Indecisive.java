package solution;

public class Indecisive { 
    public static void main(String[] args) {
        System.out.println(decision());
        
        // what does it print?
        // a) true
        // BEFORE b) false
        // c) none of the above?
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
        
        // problem: tries to return true, but finally returns false
        // solution: do not use return/throw/etc. in finally!
    }
}
