import java.util.Scanner;

class Ex7{
    int[] convertixASetmanes(int dies){
        int s = dies/7;
        int d = dies%7;

        return new int[]{s,d};





    }


}



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ex7 e7 = new Ex7();
        int dies = scanner.nextInt();
        int[] mbappe = e7.convertixASetmanes(dies);

        String resultat ="";
        resultat += "(";
        if (mbappe[0]>0){
            resultat += mbappe[0];
        } else if (mbappe[0]==0){
            resultat += 0;
        }
        resultat += ", ";
        if (mbappe[1]>0){
            resultat += mbappe[1];
        } else if (mbappe[1]==0) {
            resultat += 0;
        }
        resultat +=")";
        System.out.println(resultat);
    }
}