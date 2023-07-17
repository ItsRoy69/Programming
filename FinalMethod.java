class Hey {

  final void method() {
    System.out.println("Final Method");
  }
}

public class FinalMethod extends Hey{

  public static void main(String args[]) {
    
    FinalMethod obj = new FinalMethod();
    obj.method();
  }
}
