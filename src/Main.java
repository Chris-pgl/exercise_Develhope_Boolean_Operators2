public class Main {
    public static void main(String[] args) {

        //A
        int x = 55;
        boolean result = ( x != x) && (false ^ true);
        System.out.println("A: "+ result);

        //B
        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = 2;
        boolean result2 = (!a || !b) || c == d;
        System.out.println("B: "+result2);

        //C
        boolean result3= false && true || false && !false;
        System.out.println("C: "+result3);

        //D
        boolean result4 = (false && true) || ( false || true);
        System.out.println("D: "+result4);
    }
}