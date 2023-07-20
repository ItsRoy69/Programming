
class A {

  int x = 100;
}

class B extends A { 

  int y = 200;
}

class C extends A { 

  int z = 300;
}




public class HierarchicalInheritence {

  public static void main(String args[]) {
    C obj = new C();
    System.out.println(obj.x);
    System.out.println(obj.z);

    B obj1 = new B();
    System.out.println(obj1.x);
    System.out.println(obj1.y);
  }
}
