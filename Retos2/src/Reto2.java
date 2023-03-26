import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        int[]Participantes;
        int cantidad;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite Cuantos Participantes van a Competir.");
        cantidad=lectura.nextInt();
        Participantes=new int[cantidad];
        for (int i=0; i<Participantes.length; i++) {
            System.out.println("Digite el Tiempo Total para el Participante en la Posicion"+i);
            Participantes[i]=lectura.nextInt();
        }
        for (int i=1; i<=3; i++) {
            System.out.println("Los Primeros 3 Lugares con mejor Tiempo Fueron:"+Participantes[i]); 
        }
        lectura.close();
    }
    
}
