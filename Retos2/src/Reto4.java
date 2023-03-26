import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        String[][]Maquina;
        Scanner lectura=new Scanner(System.in);
        Maquina=new String[16][2];
        for (int i=0;i<16; i++){
            for (int j=0;j<2; j++){
                System.out.println("Digite un Producto y Precio para la Posicion"+i+j);
                Maquina[i][j]=lectura.next();
                
            }
            
        }
        for (int i=0; i<16; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(Maquina[i][j]+"\t");
                
            }
            System.out.println();
        }
        lectura.close();
    }
}
