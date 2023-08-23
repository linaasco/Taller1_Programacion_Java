import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;


        System.out.println("Ingrese el primer numero");
        numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        numero2 = sc.nextInt();

        int cociente =numero1/numero2;

        int residuo = numero1 % numero2;

        if (residuo == 0) {

            System.out.println("La division de los numeros " + numero1 + " y el " + numero2 + " es exacta y su cociente es "+cociente+" y su residuo es "+residuo);
        } else {
            System.out.println("La division de los numeros " + numero1 + " y el " + numero2 + " no es exacta y su cociente es "+cociente+" y su residuo es "+residuo);
        }
    }

}
