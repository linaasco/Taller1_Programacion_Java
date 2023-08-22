import java.util.Scanner;
public class Edad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anno;
        int dia1;
        int mes1;
        int anno1;
        int resultado = 0;
        int casos = 0;
        System.out.println("Digite el dia de su cumpleaños");
        dia = sc.nextInt();

        System.out.println("Digite el mes de su cumpleaños");
        mes = sc.nextInt();

        System.out.println("Digite el anno de su cumpleaños");
        anno = sc.nextInt();

        System.out.println("Digite que dia es hoy");
        dia1 = sc.nextInt();

        System.out.println("Digite el mes de hoy");
        mes1 = sc.nextInt();

        System.out.println("Digite el anno en el que esta actualmente");
        anno1 = sc.nextInt();

        resultado = anno1 - anno;

        if (mes>mes1){
            casos= resultado-1;
            System.out.println("Usted tiene " + casos + " annos");
        }
        else {
            System.out.println("Usted tiene " + resultado + " annos");
        }
    }
}