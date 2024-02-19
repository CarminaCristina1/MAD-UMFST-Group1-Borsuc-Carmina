import java.util.Scanner;

public class Positivity {
    //EX1 daca un nr e pozitiv sau negativ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul : ");
        int x = sc.nextInt();
        System.out.println("Numarul : " + x);
        if (x > 0)
            System.out.println("Este pozitiv.");
        else
            System.out.println("Este negativ.");
    }
}