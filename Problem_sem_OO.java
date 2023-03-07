import java.util.Locale;
import java.util.Scanner;

public class Problem_sem_OO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite o valor de xA: ");
        xA = sc.nextDouble();

        System.out.println("Digite o valor de xB: ");
        xB = sc.nextDouble();

        System.out.println("Digite o valor de xC: ");
        xC = sc.nextDouble();


        System.out.println("Digite o valor de yA: ");
        yA = sc.nextDouble();

        System.out.println("Digite o valor de yB: ");
        yB = sc.nextDouble();

        System.out.println("Digite o valor de yC: ");
        yC = sc.nextDouble();

        double areaX, areaY, pX, pY;

        pX = (xA + xB + xC) / 2;

        pY = (yA + yB + yC) / 2;


        areaX = Math.sqrt(pX *(pX - xA) * (pX - xB) * (pX - xC));

        areaY = Math.sqrt(pY *(pY - yA) * (pY - yB) * (pY - yC));

        System.out.println("Area do triangulo X : " + areaX);

        System.out.println("Area do triangulo Y : " +areaY);

        if (areaX > areaY) {

            System.out.println("Maior area = X");

        }

        else {

            System.out.println("Maior area = Y");

        }

        sc.close();
    }
}
