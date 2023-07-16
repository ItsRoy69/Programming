class Hey {

  Hey(ThisInstance obj) {
    System.out.println(obj.a);
  }
}

public class ThisInstance {

  int a = 100;

  ThisInstance() {
    Hey obj = new Hey(this);
  }

  public static void main(String args[]) {
    ThisInstance obj = new ThisInstance();
  }
}
