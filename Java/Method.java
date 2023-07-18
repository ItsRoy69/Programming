 public class Method{

    void Method(int a){
        System.out.println("Method called with:"+a);
    }

    public static void main(String args[]){
        Method obj = new Method();
        obj.Method(100);

    }
 }