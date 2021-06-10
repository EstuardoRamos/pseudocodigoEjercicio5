
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        int edad, num;
        int hombres = 0, mujeres = 0;
        String sexo;
        String mujer = "F";
        String hombre = "M";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba la cantidad de edades que desea ingresar: ");
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(" Ingrese una edad: ");
            edad = scanner.nextInt();
            System.out.print("Ingrese F si es mujer y M si es hombre: ");
            sexo = scanner.next();
            if (edad >= 18 && sexo.equals(mujer)) {
                mujeres += 1;
            } else if (edad < 18 && sexo.equals(hombre)) {
                hombres += 1;
            }

        }
        System.out.println("La cantidad dee mujeres mayores de edad es " + mujeres);
        System.out.println("La cantidad dee hombres menores de edad es " + hombres);
    }

}
