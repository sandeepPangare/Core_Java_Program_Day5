public class Swap_Two_Number {

    public static void main(String[] args) {
        int a = 10, b = 20; // int temp;
        a = a + b;
        b = a - b;
        a = a - b;

       /* temp = a;
        a = b;
        b = t; */

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
