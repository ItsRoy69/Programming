public class ConstructorOverloading{

    ConstructorOverloading(){
        System.out.println("Called Constructor Overloading");
    }

    ConstructorOverloading(int a){
        System.out.println("int a called as: " +a);
    }

     ConstructorOverloading(int a, double b){
        System.out.println("int a called as: " +a);
        System.out.println("double b called as: " +b);
    }

    public static void main(String args[]){

        ConstructorOverloading iphone = new ConstructorOverloading();
        ConstructorOverloading oneplus = new ConstructorOverloading(4);
        ConstructorOverloading s4 = new ConstructorOverloading(11, 22.33);
    }
}