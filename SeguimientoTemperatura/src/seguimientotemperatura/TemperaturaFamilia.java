
package seguimientotemperatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaFamilia {
    public static void main(String[]args){
        String c= "s" ,nombre,parentesco;
        int opcion, edad, contador, pregunta;
        double temperatura,compa;
        Scanner Lectura = new Scanner(System.in);
        List<Integrantes> integrantesFamilia; 
        integrantesFamilia = new ArrayList<>();
        while(c.equals("s") ||c.equals("S")){
            
            
            System.out.println("Opciones: ");
            System.out.println("| 1 | Mostrar integrantes de la familia y datos actuales");
            System.out.println("| 2 | Agregar Integrantes a la familia");
            System.out.println("| 3 | Retirar integrantes de la familia");
            System.out.println("| 4 | Actualizar temperatura");
            System.out.println("| 5 | Ver historial de temperaturas");
            System.out.print("\nIngrese la opcion a realizar: ");
            opcion = Lectura.nextInt();
            while(opcion<1||opcion>5){
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
                        System.out.println(e.mostrarUltimaTemp()+"°C");
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
                    System.out.print("Ingrese una temperatura de inicio en\n\tgrados celcius separado por coma decimal: ");
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
                    System.out.println("Actualizar temperatura\n");
                    System.out.println("0 | Cancelar actualizacion de temperatura");
                    for(Integrantes e : integrantesFamilia){
                        contador++;
                        System.out.println(contador+ " | "+ e.soloNombres());
                    }
                    System.out.println("Cual es el numero del integrante que se va a actualizar: ");
                    pregunta = Lectura.nextInt();
                    while(pregunta<0||pregunta>integrantesFamilia.size()){
                        System.out.print("Dato errado, ingreselo nuevamente ");
                        pregunta = Lectura.nextInt();
                    }
                    if(pregunta==0){
                        System.out.println("Cancelacion de actualizacion de integrante completada con exito.");
                    }else{
                        System.out.print("Ingrese la nueva temperatura separada por coma decimal: ");
                        temperatura = Lectura.nextDouble(); 
                        contador=0;
                        for(Integrantes e : integrantesFamilia){
                        contador++;
                            if (contador==pregunta) {
                                e.pila.InsertarNodo(temperatura);
                            }
                        }
                        System.out.println("Actualizacion de integrante completada con exito");
                    }
                    System.out.println("Presiona una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 5:
                    System.out.println("Historial de temperaturas\n");
                    System.out.println("0 | Cancelar visualizacion de historial de temperaturas");
                    for(Integrantes e : integrantesFamilia){
                        contador++;
                        System.out.println(contador+ " | "+ e.soloNombres());
                    }
                    System.out.print("Cual es el numero del integrante del cual va a visualizar el historial: ");
                    pregunta = Lectura.nextInt();
                    while(pregunta<0||pregunta>integrantesFamilia.size()){
                        System.out.print("Dato errado, ingreselo nuevamente ");
                        pregunta = Lectura.nextInt();
                    }
                    if(pregunta==0){
                        System.out.println("Cancelacion de visualizaciuon de histoirial completada con exito.");
                    }else{
                        contador=0;
                        System.out.println("\n\nUltimos datos ingresados en la parte superior.");
                        for(Integrantes e : integrantesFamilia){
                        contador++;
                            if (contador==pregunta) {
                                e.mostrarTemperaturas();
                            }
                        }
                    }
                    System.out.println("Presiona una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
            }
            System.out.print("Desea volver al menu de inicio? S o N: ");
            c = Lectura.next();
            System.out.println("");
        }
    }
}
