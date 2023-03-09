import java.util.Calendar;
import java.util.Scanner;

public class main {
    public static void mostrarCalendario(int dias, int inicio){
        for (int i = 1; i <= inicio; i++) {
            System.out.print(" .  ");
        }
        int cont=inicio;
        for (int i = 1; i <= dias; i++) {
            cont++;
            if (i < 10){
                System.out.print(" 0"+i+" ");
            }else{
                System.out.print(" "+i+" ");
            }
            if (cont % 7==0){
                System.out.println();
                cont=0;
            }
        }
        System.out.println("\n");
        System.out.println("Digite cero para salir");
        System.out.println("\n");
    }
    public static void diasSemana(){
        System.out.println(" D   L   M   M   J   V   S");
    }
    public static void calendario(int mes){
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] inicioMes = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
        switch (mes){
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
            case 1:
                System.out.println("=========== ENERO =========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1], inicioMes[mes-1]);
                break;
            case 2:
                System.out.println("=========== FEBRERO ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 3:
                System.out.println("=========== MARZO ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 4:
                System.out.println("=========== ABRIL ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 5:
                System.out.println("=========== MAYO ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 6:
                System.out.println("=========== JUNIO ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 7:
                System.out.println("=========== JULIO ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 8:
                System.out.println("=========== AGOSTO ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 9:
                System.out.println("=========== SEPTIEMBRE ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 10:
                System.out.println("=========== OCTUBRE ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 11:
                System.out.println("=========== NOVIEMBRE ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            case 12:
                System.out.println("=========== DICIEMBRE ===========");
                diasSemana();
                mostrarCalendario(diasMes[mes-1],inicioMes[mes-1]);
                break;
            default:
                System.out.println("ESTE MES NO EXISTE...");
                break;
        }
    }

    public static void main(String[] args) {
        int nMes = 0;
        do {
            System.out.print("INGRESE UN NÚEMERO DE MES: ");
            nMes= new Scanner(System.in).nextInt();
            calendario(nMes);
        }while (nMes!=0);

    }
}