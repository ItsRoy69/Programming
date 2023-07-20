public class ThisKeyword {

  int a;

  ThisKeyword(int a) {
    this.a = a;
  }

  public static void main(String args[]) {
    ThisKeyword obj = new ThisKeyword(100);
    System.out.println(obj.a);
  }
}
