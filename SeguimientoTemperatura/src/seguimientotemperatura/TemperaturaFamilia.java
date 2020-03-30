package temperaturafamilia;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TemperaturaFamilia {

    public static void main(String[] args) {
        String c= "s" ;
        int opcion;
        Scanner Lectura = new Scanner(System.in);
        List<String> integrantesFamilia; 
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
                    break;
                case 3:
                    break;
            }
            
            
            
        } 
    }
    
}
