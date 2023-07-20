public class Constructor {

  Constructor(int a) { // passing a parameter 'int a'
     System.out.println("Constructor Declared with Ram:"+a);
  }

  public static void main(String args[]) {
    Constructor oneplus = new Constructor(8); // 8 is passed
  }
}
