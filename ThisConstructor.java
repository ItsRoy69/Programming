public class ThisConstructor{
    ThisConstructor(int a){
        System.out.println("Value of a is : "+a);
    }

    ThisConstructor(){
        this(100);
    }

    public static void main (String args []){
        ThisConstructor obj = new ThisConstructor();
    }
}