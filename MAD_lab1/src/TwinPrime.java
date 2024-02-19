import java.util.Scanner;

public class TwinPrime {
    //EX3 toate<100
    public static  void main(String[] args){
        System.out.println("Perechile de numere prime pana la 100 sunt : ");
        for(int i=2; i<101; i++) {
            if (ePrim(i) && ePrim(i + 2)) {
                System.out.println("(" + i + "," + (i + 2) + ")");
            }
        }
    }

    public static boolean ePrim(int x) {
        if(x<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}