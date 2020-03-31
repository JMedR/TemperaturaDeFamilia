
package seguimientotemperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaFamilia {
    public static void main(String[]args){
        String c= "s" ,nombre,parentesco;
        int opcion, edad, contador, pregunta;
        double temperatura;
        Scanner Lectura = new Scanner(System.in);
        List<Integrantes> integrantesFamilia; 
        integrantesFamilia = new ArrayList<>();
        while(c.equals("s") ||c.equals("S")){
            
            
            System.out.println("Opciones: ");
            System.out.println("| 1 | Mostrar integrantes de la familia");
            System.out.println("| 2 | Agregar Integrantes a la familia");
            System.out.println("| 3 | Retirar integrantes de la familia");
            System.out.println("| 4 | Actualizar temperatura");
            System.out.print("\nIngrese la opcion a realizar: ");
            opcion = Lectura.nextInt();
            while(opcion<1||opcion>3){
                System.out.print("Opcion no valida, vuelva a ingresarla: ");
                opcion = Lectura.nextInt();
                System.out.println();
            }
            contador=0;
            switch(opcion){
                case 1:
                    System.out.println("Los integrantes son:\n");
                    for(Integrantes e : integrantesFamilia){
                        contador++;
                        System.out.println("Integrante numero:" + contador);
                        System.out.println(e.retornoDatos());
                        System.out.println("");
                    }
                    System.out.println("Presiona una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    
                    System.out.println("\n");
                    System.out.print("Ingrese el nombre del nuevo integrante: ");
                    nombre = Lectura.next();
                    System.out.print("Ingrese el parentesco: ");
                    parentesco = Lectura.next();
                    System.out.print("Ingrese la edad del familiar: ");
                    edad = Lectura.nextInt();
                    System.out.print("Ingrese una temperatura de inicio en grados celcius: ");
                    temperatura = Lectura.nextDouble();
                    integrantesFamilia.add(new Integrantes(nombre,parentesco,edad,temperatura));
                    System.out.println("Presiona una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                    
                case 3:
                    System.out.println("Eliminar integrante de la familia\n");
                    System.out.println("0 | Cancelar eliminacion de integrante");
                    for(Integrantes e : integrantesFamilia){
                        contador++;
                        System.out.println(contador+ " | "+ e.soloNombres());
                    }
                    System.out.println("Cual es el numero del integrante que se va a eliminar: ");
                    pregunta = Lectura.nextInt();
                    while(pregunta<0||pregunta>integrantesFamilia.size()){
                        System.out.print("Dato errado, ingreselo nuevamente ");
                        pregunta = Lectura.nextInt();
                    }
                    if(pregunta==0){
                        System.out.println("Cancelacion de eliminacion de integrante completada con exito.");
                    }else{
                        integrantesFamilia.remove(pregunta-1);
                        System.out.println("Eliminacion de integrante completada con exito");
                    }
                    System.out.println("Presiona una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    
                    break;
            }
            System.out.println("Desea volver al menu de inicio? S o N");
            c = Lectura.next();
        }
    }
}
