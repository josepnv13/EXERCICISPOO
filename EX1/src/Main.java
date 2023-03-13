import java.util.Scanner;

class Ex1 {
    int dimeSigne(int a){

        if (a<0){
            return -1;
        } else if (a==0) {
            return 0;
        }
        return 1;

    }



}


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int  a = scanner.nextInt();
        Ex1 ex1= new Ex1();
        int su= ex1.dimeSigne(a);
        if (su==0){
            System.out.println("es 0");
        }else if(su<0){
            System.out.println("es negatiu");
        }else {
            System.out.println("Es positiu");
        }





    }
}