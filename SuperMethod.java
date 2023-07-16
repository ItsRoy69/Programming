class Hey {

  void methodOfHi() {
    System.out.println("calling Method of Hi");
  }
}

public class SuperMethod extends Hey {

  void methodOfHello() {
    System.out.println("calling Method of Hello");
    super.methodOfHi();
  }

  public static void main(String args[]) {
    SuperMethod obj = new SuperMethod();
    obj.methodOfHello();
  }
}
