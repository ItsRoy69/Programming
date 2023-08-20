public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

        System.out.println(name1 == name2); // Checks if name1 and name2 reference the same object

        System.out.println(name1.equals(name2)); // when you only need to check value in string

    }
}