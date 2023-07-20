public class TypeCasting{

    public static void main(String args[]){

        int a = 100;
        double d=a; // widening casting (automatic casting)
        long l=100; 
        int i=(int) l; // narrowing casting(manual casting) thus i have to use int in bracket

        System.out.println(d);
        System.out.println(i);
 
    }

}