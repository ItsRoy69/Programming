public class Oops1{

    int ram; // instance variable
    int cam; // instance variable

    public static void main (String args[]){

        Oops1 iphone = new Oops1();
        Oops1 oneplus = new Oops1();

        iphone.ram=8; // we access every property in class using dot operator
        iphone.cam=13;

        oneplus.ram=16;
        oneplus.cam=48;

        System.out.println(iphone.ram);
        System.out.println(iphone.cam);
        System.out.println(oneplus.ram);
        System.out.println(oneplus.cam);
    }
}