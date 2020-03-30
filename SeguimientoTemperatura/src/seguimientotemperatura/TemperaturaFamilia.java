package seguimientotemperatura;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TemperaturaFamilia {

    public static void main(String[] args) {
        String c= "s" ,nombre,parentesco;
        int opcion, edad;
        double temperatura;
        Scanner Lectura = new Scanner(System.in);
        List<Integrantes> integrantesFamilia; 
        integrantesFamilia = new ArrayList<>();
        while(c.equals("s") ||c.equals("S")){
            
            
            System.out.println("Opciones: ");
            System.out.println("| 1 | Mostrar integrantes de la familia");
            System.out.println("| 2 | Agregar Integrantes a la familia");
            System.out.println("| 3 | Retirar integrantes de la familia");
            System.out.print("\nIngrese la opcion a realizar: ");
            opcion = Lectura.nextInt();
            while(opcion<1||opcion>3){
                System.out.print("Opcion no valida, vuelva a ingresarla: ");
                opcion = Lectura.nextInt();
                System.out.println();
            }
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del nuevo integrante: ");
                    nombre = Lectura.next();
                    System.out.println("Ingrese el parentesco: ");
                    parentesco = Lectura.next();
                    System.out.println("Ingrese la edad del familiar: ");
                    edad = Lectura.nextInt();
                    System.out.println("Ingrese una temperatura de inicio en grados celcius: ");
                    temperatura = Lectura.nextDouble();
                    integrantesFamilia.add(new Integrantes(nombre,parentesco,edad));
                    break;
                case 3:
                    break;
            }
            
            
            
        } 
    }
    
}
