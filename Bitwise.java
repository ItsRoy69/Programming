public class Bitwise{

    public static void main (String args[]){

        // Binary digits
        //0 - 00
        //1 - 01
        //2 - 10
        //3 - 11

        int a=1;
        int b=2;

        int or= a|b; // 01 = 10 = 11
        System.out.println(or);

        int and= a&b; // 01 * 10 = 00
        System.out.println(and);

        int xor= a^b; // 01 * 10 = 00
        System.out.println(xor);

        int complement=~b;
        System.out.println(complement);

        int lshift=b<<2;        
        System.out.println(lshift);

        int rshift=10>>2;        
        System.out.println(rshift);

    }
}