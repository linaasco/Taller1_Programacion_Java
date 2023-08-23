import java.util.Scanner;
public class Caracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;

        System.out.println("Ingrese un numero o una letra puede ser en minuscula o mayuscula");
        a = sc.next().charAt(0);

        int representacion= (int)a;

        if (representacion >= 48 && representacion<58) {

            System.out.println("El carcater "+a+" es un numero");

        } else if (representacion >= 65 && representacion<91) {

            System.out.println("El caracter "+a+" es una letra mayuscuala");

        }else if (representacion >= 97 && representacion<123) {

            System.out.println("El caracter " + a + " es una letra minuscula");

        }else{
            System.out.println("El carcacter no es ni una letra y suma");
        }
    }
}
