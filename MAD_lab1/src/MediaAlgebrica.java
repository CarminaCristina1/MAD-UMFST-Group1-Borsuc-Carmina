import java.util.Scanner;

public class MediaAlgebrica {
    //EX2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numerele : ");
        int x = sc.nextInt();
        int[] array = new int[x];
        float s = 0;
        for (int i = 0; i < x; i++)
        {
            array[i] = sc.nextInt();
            s = s + array[i];
        }
        float media = s/x;
        System.out.println("Media aritmetica este egala cu : " + media );
    }
}