
import java.util.Scanner;
public class Main {
    //DETERMINAR DÍAS DEL LOS MESES
    public static int DiasMes(int año, String mes){
        if (mes=="ENERO" || mes=="MARZO" || mes=="MAYO" || mes=="JULIO" || mes=="AGOSTO" || mes=="OCTUBRE" || mes=="DICIEMBRE"){
            return 31;
        }else if (mes=="FEBRERO"){
            if (AñoBisiesto(año)){
                return 29;
            }else {
                return 28;
            }
        }else {
            return 30;
        }
    }
    //DETERMINAR SI EL AÑO ES BISIESTO
    public static boolean AñoBisiesto(int año){
        if (año % 4==0){
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
    public static void Calendario(int año){
        String[]Nmeses={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO", "AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        for (int i=0; i<=11; i++ ){
            System.out.println(Nmeses[i]);
            System.out.println("D L M M J V S ");
            int dias=DiasMes(año,i);
            for (int j=0; j>=dias; j++){
                System.out.println(j+ " ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("INGRESE UN AÑO: ");
        int año=new Scanner(System.in).nextInt();
        Calendario(año);
    }
}