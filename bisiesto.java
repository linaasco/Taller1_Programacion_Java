import java.util.Scanner;
public class bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anno;

        System.out.println("Ingrese el anno");
        anno = sc.nextInt();



        int division= anno % 400;
        int division1 = anno % 100;
        int division2 =anno %4;

        if (division ==0){
            System.out.println("El anno "+anno+" un año bisiesto");
        }
        else if (division1==0) {
            System.out.println("El anno "+anno+" no es un anno bisiesto");
        } else if(division2==0){
            System.out.println("El anno "+anno+" un año bisiesto");
        }else{
            System.out.println("El anno "+anno+" no es un anno bisiesto");
        }

    }
}
