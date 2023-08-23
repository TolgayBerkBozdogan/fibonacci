import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, a =0, b=1, total;
        System.out.print("Seri Sayısını giriniz: ");
        n = input.nextInt();
        System.out.print(n + " Sayısının Fibonaci Serisi ");
        for(int i =0; i<=n; i++){
            System.out.print(a +" ");
            total = a+b;
            a = b;
            b = total;


        }


    }
}
