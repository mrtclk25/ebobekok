import java.util.Scanner;

public class ebobekok2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ebob = 1;
        int ekok = 1;
        System.out.print("Birinci sayiyi giriniz: ");
        int n1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        int n2 = scan.nextInt();
        int i = 1, k = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {

                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB:" + ebob);

        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("EKOK: " + ekok);


    }
}