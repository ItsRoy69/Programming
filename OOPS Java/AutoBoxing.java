public class AutoBoxing {
    public static void main (String args[]){
        int a  =100;

        Integer i = Integer.valueOf(a);

        Integer j = a; 
        
        System.out.println(i);
        System.out.println(j);
    }
}