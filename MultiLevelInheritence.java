
class A {

  int x = 100;
}

class B extends A { 

  int y = 200;
}

class C extends B { 

  int z = 300;
}




public class MultiLevelInheritence {

  public static void main(String args[]) {
    C obj = new C();
    System.out.println(obj.x);
    System.out.println(obj.y);
    System.out.println(obj.z);
  }
}
