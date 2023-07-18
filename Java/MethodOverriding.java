class A {

  void print() {
    System.out.println("MethodOverriding called");
  }
}

class B extends A {

  @Override //using annotation for showing that you've embedded something (not necessary)
  void print() {
    System.out.println("Overriding done");
  }
}

public class MethodOverriding {

  public static void main(String args[]) {
    B obj1 = new B();
    obj1.print();
  }
}
