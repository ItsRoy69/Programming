public class StaticVariable {

  static int a = 100;

  public static void main(String args[]) {
    System.out.println(a);
    System.out.println(StaticVariable.a);
    StaticVariable obj1 = new StaticVariable();
    StaticVariable obj2 = new StaticVariable();

    System.out.println(obj1.a);
    System.out.println(obj2.a);

    obj1.a = 900;
    System.out.println(obj1.a);
    System.out.println(obj2.a);
    System.out.println(a);
    System.out.println(StaticVariable.a);
  }
}
