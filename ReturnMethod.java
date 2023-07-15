 public class ReturnMethod{
 
    int ReturnMethod(){
        System.out.println("Return Type Method called with:");
        return 100;
    }

    public static void main(String args[]){
        ReturnMethod obj = new ReturnMethod();
        int a=obj.ReturnMethod();
        System.out.println(a);

    }
 }