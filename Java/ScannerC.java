import java.util.Scanner;

public class ScannerC {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int a;
    System.out.print("Enter Value of a : ");
    a = sc.nextInt();
    System.out.println("Value of a : " + a);

    double d;
    System.out.print("Enter Value of d : ");
    d = sc.nextDouble();
    System.out.println("Value of d : " + d);
  }
}
