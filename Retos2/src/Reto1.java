import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        int [] Numero;
        int numeros;
        double multiplo=0;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Cuantos Numeros quiere Ingresar");
        numeros=lectura.nextInt();
        Numero=new int[numeros];
        for (int i=0; i<Numero.length; i++) {
            System.out.println("Digite el Numero para La Posicion"+i);
            Numero[i]=lectura.nextInt();
            multiplo=Numero[i]/2; 
        }
        for (int i=0; i<Numero.length; i++){
            System.out.println("El Numero en la Posicion"+i+"Es Multiplo de 2 si Contiene a 2 Varias veces y su Division es Exacta, en este caso su Resultado Fue:"+multiplo);
        }
        lectura.close();
    }
}
