//volume = 2 * raio * raio * altura

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09UN3 {
    /**
     * 
     */
    public Ex09UN3() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a altura da lata em cm? ");
        float altura = scan.nextFloat();

        System.out.print("Qual o raio da lata? ");
        float raio = scan.nextFloat();

        scan.close();

        float volume = 3.14f * raio * raio * altura;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.print("O volume da lata é = " + df.format(volume));

    }

    public static void main(String[] args) {
        new Ex09UN3();
    }
}
