public class Array2{

    public static void main(String args[]){

        int arr[] = new int[5];

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        int i;

        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }

        for(int a:arr){
            System.out.println(a);
        }
    }
}