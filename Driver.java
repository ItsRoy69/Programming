class A {

  int x = 100;
}

class B extends A { // extending class A for inheriting the properties of class A

  int y = 200;
}

public class Driver {

  public static void main(String args[]) {
    B obj = new B();
    System.out.println(obj.y);
    System.out.println(obj.x);
  }
}
