package seguimientotemperatura;

public class Integrantes {
    public String nombre, parentesco;
    public int edad;
    double temperatura;
    ActualizacionTemperaturas pila = new ActualizacionTemperaturas();
    public Integrantes(String nombre, String parentesco, int edad,double temperatura) {
        this.nombre = nombre;
        this.parentesco = parentesco;
        this.edad = edad;
        this.temperatura = temperatura;
        pila.InsertarNodo(temperatura);
    }  

    /*public void setPila(ActualizacionTemperaturas pila) {
        this.pila = pila;
    }

    /*public Integrantes(double temperatura){
        this.temperatura = temperatura;
        pila.InsertarNodo(temperatura);
    }*/
    public void mostrarTemperaturas(){
        pila.MostrarValores(); 
    }
    public double mostrarUltimaTemp(){
        double temp = pila.MostrarUltimoValor();
        System.out.print("La ultima temperatura es: ");
        return 0;
        
    }
    public String soloNombres(){
        return nombre;
    }
    public String retornoDatos(){
        return "Nombre: " + nombre + "\nParentesco: " + parentesco + "\nEdad: "+edad;
    }   
}
