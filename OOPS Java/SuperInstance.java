class Hey {

  int a = 1000;
}

public class SuperInstance extends Hey {

  SuperInstance() {
    System.out.println(super.a);
  }

  public static void main(String args[]) {
    SuperInstance obj = new SuperInstance();
  }
}
