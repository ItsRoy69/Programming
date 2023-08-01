import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter some input number: ");
    int rollno = sc.nextInt();
    System.out.println("Your roll number is " + rollno);

    System.out.print("Please enter some input text: ");
    String name = sc.next();
    System.out.println(name);

    System.out.print("Please enter some input float number: ");
    float marks = sc.nextFloat();
    System.out.println(marks);
  }
}
