import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Consultas{
     public void conversionDeMonedas(String base, String destino, double moneda){

             ConsumirAPI consulta = new ConsumirAPI();
             double tasa = consulta.obtenerTasa(base, destino);
             double cambioConvertido = moneda / tasa;
             DecimalFormat df = new DecimalFormat("#.00");
             System.out.println(moneda + destino + "--->" + base + " " + "Resultado: " + df.format(cambioConvertido) + base);
             System.out.println("Presione Enter para continuar...");
             new Scanner(System.in).nextLine();
    }
}
