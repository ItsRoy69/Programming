abstract class Crush {

  int age = 21;

  Crush() {
    System.out.println("I am crush");
  }

  void relationShipStatus() {
    System.out.println("Relationship Status is forever single ");
  }

  abstract void socialMedia(); // cannot write method body in abstract method
}

class Girl extends Crush {

    void iamAGirl(){
        System.out.println("I am Girl");
    }

  void socialMedia() {
    System.out.println("Insta");
  }
}

class Boy extends Crush {


    void iamABoy(){
        System.out.println("I am Boy");
    }


  void socialMedia() {
    System.out.println("FB");
  }
}

public class AbstractClass {

  public static void main(String tinder[]) { //we can write anything in place of args
    Girl simran = new Girl();
    Boy raj = new Boy();

    //calling the methods
    simran.relationShipStatus();
    raj.relationShipStatus();

    simran.iamAGirl();
    raj.iamABoy();

    simran.socialMedia();
    raj.socialMedia();
  }
}
