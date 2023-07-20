public class Unboxing {
    public static void main (String args[]){
        int a  =100;

        Integer i = Integer.valueOf(a);

        int x = i.intValue();
        
        int y = i;
        System.out.println(x);
        System.out.println(y);
    }
}