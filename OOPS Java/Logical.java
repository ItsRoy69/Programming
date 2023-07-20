public class Logical { 

    public static void main (String args[]){
        
        boolean a=true;
        boolean b= false;

        boolean and= (a&&b);        
        System.out.println(and);

        boolean or= (a||b);        
        System.out.println(or);

        boolean not= !(a||b);        
        System.out.println(not);
    }

}