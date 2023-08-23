import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;

        System.out.println("Ingrese el valor del lado 1");
        lado1 = sc.nextInt();

        System.out.println("Ingrese el valor del lado 2");
        lado2= sc.nextInt();

        System.out.println("Ingrese el valor del lado 3");
        lado3 = sc.nextInt();

        if (lado1==lado2 && lado2==lado3 && lado1 == lado3){

            System.out.println("Es un triangulo equilatero");

        } else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {

            System.out.println("Es un triangulo isosceles");

        } else if (lado1 != lado2 && lado2 !=lado3 && lado1 != lado3 ) {

            System.out.println("Es un triangulo escaleno");

        }else {
            System.out.println("El triangulo es invalido");
        }
    }

}
