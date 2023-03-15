
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("INGRESE UN AÑO: ");
        int nAño=new Scanner(System.in).nextInt();
        for (int i=1; i<=12; i++){
            System.out.println();
            System.out.println("D L M M J V S");
            int dias=dMes (nAño, i);
            int contador=0;

            for (int j=1; j<=dias; j++);{
                System.out.println(j+"");
                contador++;
                if (contador==7){
                    System.out.println();
                    contador=0;
                }
            }
        }
    }
    public static int dMes(int año, int mes){
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==1 || mes==8 || mes==10 || mes==12 ){
            return 31;
        } else if (mes==2) {
            if (esBisiesto(año)){
                return 29;
            }else{
                return 28;
            }
        }else{
            return 30;
        }
    }
    public static boolean esBisiesto(int año){
        if (año%4==0){
            if (año%100==0){
                if (año%400==0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}