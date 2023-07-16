public class StaticMethod {

  static void print() { // using static says sharing memory of method
    System.out.println("Static Method Called");
  }

  public static void main(String args[]) {
    StaticMethod obj1 = new StaticMethod();
    StaticMethod obj2 = new StaticMethod();

    print();
    StaticMethod.print();
    obj1.print();
    obj2.print();
  }
}
