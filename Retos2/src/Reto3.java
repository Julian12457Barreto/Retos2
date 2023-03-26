import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        String[][]Palabras;
        int Filas;
        int Columnas;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite Cuantas Filas desea que Tenga la Matriz");
        Filas=lectura.nextInt();
        System.out.println("Digite Cuantas Columnas desea que tenga la Matriz");
        Columnas=lectura.nextInt();
        Palabras=new String[Filas][Columnas];
        for (int i=0; i<Filas; i++) {
            for (int j=0; j<Columnas; j++) {
                System.out.println("Digite Un Animal para la Posicion"+i+j);
                Palabras[i][j]=lectura.next();
            }
            
        }
        for (int i=0;i<Filas; i++) {
            for (int j=0; j<Columnas; j++) {
                System.out.print(Palabras[i][j]+"\t");
            }
            System.out.println();
            
        }
        lectura.close();

    }
}
