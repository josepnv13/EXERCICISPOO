import java.util.Scanner;

class Ex2 {
    boolean teUnaArroba(String t){
        if(t.contains("@")){
            return true;
        }
        return false;
    }



}


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();

        Ex2 ex2 = new Ex2();

        Boolean su =ex2.teUnaArroba(text);

        if (su){
            System.out.println("Si");
        }else {
            System.out.println("no");
        }




    }
}