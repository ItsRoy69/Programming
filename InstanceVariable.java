public class InstanceVariable {

  int a;

  public static void main(String args[]) {
    InstanceVariable obj = new InstanceVariable();
    obj.a = 100;

    System.out.println(obj.a);

    InstanceVariable obj1 = new InstanceVariable();
    obj1.a = 200;

    System.out.println(obj1.a);
  }
}
