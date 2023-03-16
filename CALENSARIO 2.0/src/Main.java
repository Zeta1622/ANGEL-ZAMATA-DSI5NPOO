
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
  //DIAS DEL MES
    public static int dMes(int nAño, int mes){
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==1 || mes==8 || mes==10 || mes==12 ){
            return 31;
        } else if (mes==2) {
            if (esBisiesto(nAño)){
                return 29;
            }else{
                return 28;
            }
        }else{
            return 30;
        }
    }
    //AÑO BISISESTO O NO
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
    public static int zeller(int nAño, int mes){
        int a=(14-mes)/12;
        int y= nAño - a;
        int m= mes + 12*a-2;
        int dia=1,d;
        d=(dia+y+y/4-y/100+y/400+(31+m)/12)%7;
        return (d);
    }
    public static void main(String[] args) {
        System.out.println("INGRESE UN AÑO: ");
        int nAño=new Scanner(System.in).nextInt();
        for (int i=1; i<=12; i++){
            System.out.println("\n");
            String numMes[]={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
            System.out.println(numMes[i-1]);
            System.out.println(" D  L  M  M  J  V  S");
            int dias=dMes (nAño, i);
            int ecZeller=zeller(nAño,i);
            int contador=0;
            for (int k=0;k<ecZeller;k++){
                System.out.print(" . ");
                contador++;
            }
            for (int j=1; j<=dias; j++){
                if (j<10){
                    System.out.print("0"+j+" ");
                }else {
                    System.out.print(j+" ");
                }
                contador++;
                if (contador==7){
                    System.out.println();
                    contador=0;
                }
            }
        }
    }
}