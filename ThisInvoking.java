public class ThisInvoking {

  void javaIsTheBest() {
    System.out.println("Java is the best method called");
  }

  void Hey() {
    System.out.println("Calling hey method");
    this.javaIsTheBest();
  }

  public static void main(String args[]) {
    ThisInvoking obj = new ThisInvoking();

    obj.Hey();
  }
}
