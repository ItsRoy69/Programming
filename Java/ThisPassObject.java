public class ThisPassObject {

  int a = 1000;

  void javaIsTheBest(ThisPassObject obj) {
    System.out.println("Java is the best method called");
    System.out.println("a :" + obj.a);
  }

  void Hey() {
    System.out.println("Calling hey method");
    this.javaIsTheBest(this);
  }

  public static void main(String args[]) {
    ThisPassObject obj = new ThisPassObject();

    obj.Hey();
  }
}
