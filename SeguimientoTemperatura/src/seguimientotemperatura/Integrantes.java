package seguimientotemperatura;

import java.util.List;

public class Integrantes {
    public String nombre, parentesco;
    public int edad;
    
    public Integrantes(String nombre, String parentesco, int edad) {
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.edad = edad;
    }
    public String retornoDatos(){
        return "El nombnre del integrante de la familia es: " + nombre + "\nEl parentesco que tiene con usted es: " + parentesco + "\nLa edad que esta persona tiene es: "+edad;
    }
   
    
}
