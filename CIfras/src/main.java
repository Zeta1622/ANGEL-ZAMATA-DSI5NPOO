import java.util.Scanner;
public  class main {
    public static void nombreiii(int centi,int deci, int uni){

        String[] centii={"cien","ciento","Treinta","treintai","Cuarenta","cuarentai","cincuenta","Cincuentai","Sesenta","Sesentai","Ochenta","Ochentai","Noventa","Noventai",};
        switch (centi){
            case 0:
//                System.out.println("20-"+decii[0]);
                break;
            case 1:
                System.out.println(centii[1]);
                nombre(deci);
                nombre(uni);
                break;


        }

    }
    public static void nombreii(int dece,int uni){

        String[] decii={"Veinte","Veinti","Treinta","treintai","Cuarenta","cuarentai","cincuenta","Cincuentai","Sesenta","Sesentai","Ochenta","Ochentai","Noventa","Noventai",};
        switch (dece){
            case 0:
                System.out.println("20-"+decii[0]);
                break;
            case 1:

                System.out.println("20-"+decii[1]);
                nombre(uni);
                break;
            case 2:
                System.out.print(decii[1]);
                nombre(uni);
                break;
            case 3:
                System.out.println("20-"+decii[4]);
                break;

        }

    }
    public static void nombre(int uni){
        String[] unii={"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
        switch (uni){
            case 0:
                System.out.println("0-"+unii[0]);
                break;
            case 1:
                System.out.println(unii[1]);
                break;
            case 2:
                System.out.println("2-"+unii[2]);
                break;
            case 3:
                System.out.println("3-"+unii[3]);
                break;
            case 4:
                System.out.println("4-"+unii[4]);
                break;
            case 5:
                System.out.println("5-"+unii[5]);
                break;
            case 6:
                System.out.println("6-"+unii[6]);
                break;
            case 7:
                System.out.println("7-"+unii[7]);
                break;
            case 8:
                System.out.println("8-"+unii[8]);
                break;
            case 9:
                System.out.println("9-"+unii[9]);
                break;
        }

    }
    public static void Descomponer(int num)
    {
        int unidades = num % 10;
        int decenas = ( num / 10 ) % 10;
        int centenas = ( num/100 ) % 10;
        if (unidades <10) {
            System.out.print("UNIDADES:  " );
            nombre(unidades);
        }
        if ((decenas*10)<100) {
            System.out.print("DECENAS:   " );
            nombreii(decenas, unidades);
        }
        else{
            System.out.println("CENTENAS:  " );
            nombreiii(centenas,decenas,unidades);

        }
    }
    public static void main(String[] args) {
        System.out.print("Escriba un numero maximo de tres cifras :" );
        int numero = new Scanner(System.in).nextInt();
        Descomponer(numero);
    }
}