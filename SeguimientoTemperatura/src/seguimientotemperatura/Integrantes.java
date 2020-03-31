package seguimientotemperatura;

public class Integrantes {
    public String nombre, parentesco;
    public int edad;
    double temperatura;

    public Integrantes(String nombre, String parentesco, int edad,double temperatura) {
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.edad = edad;
        this.temperatura = temperatura;
    }
    public Integrantes(double temperatura){
        this.temperatura = temperatura;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }    
    
    public String soloNombres(){
        return nombre;
    }
    
    public String retornoDatos(){
        return "Nombre: " + nombre + "\nParentesco: " + parentesco + "\nEdad: "+edad+"\nUltima temperatura: "+temperatura;
    }   
}
