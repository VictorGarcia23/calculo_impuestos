import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sueldo;
        System.out.println("¿Cual es tu sueldo brutto?: ");
        sueldo = input.nextInt();

        if (sueldo < 20000) {
            System.out.println("usted es afortunado y no debe pagar impuestos");

        }
        if (sueldo > 20000 && sueldo < 40000) {
            int tramo = (sueldo - 20000);
            double impuesto1 = (tramo * 1.10) - tramo;
            double porcentaje = (impuesto1 / sueldo) * 100;

            System.out.println("usted debe pagar: "  + impuesto1 + " con lo que en nómina le quitaremos el " + porcentaje + "% , de su sueldo brutto");
        }

        if (sueldo > 40000 && sueldo < 60000) {
            int tramo = (sueldo - 40000);
            double impuesto1 = (tramo + 1.10) - tramo;
            double porcentaje = (impuesto1 / sueldo) * 100;
            System.out.println("usted debe pagar: "  + impuesto1 + " con lo que en nómina le quitaremos el " + porcentaje + "% , de su sueldo brutto");
        }
        if (sueldo > 60000) {
            double impuesto1 = sueldo - (sueldo * 0.70);
            double porcentaje = (impuesto1 / sueldo) * 100;
            System.out.println("usted debe pagar: "  + impuesto1 + " con lo que en nómina le quitaremos el " + porcentaje + "% , de su sueldo brutto");
        }

    }
}
