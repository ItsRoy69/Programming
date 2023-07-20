public class MethodOverloading {

  void hello() {
    System.out.println("void hello()");
  }

  void hello(int a) {
    System.out.println("Value of a :"+a);
  }

  void hello(double a) {
    System.out.println("Value of a :"+a);
  }

  public static void main(String args[]) {
    MethodOverloading obj = new MethodOverloading();

    obj.hello();
    obj.hello(100);
    obj.hello(100.33);
  }
}
