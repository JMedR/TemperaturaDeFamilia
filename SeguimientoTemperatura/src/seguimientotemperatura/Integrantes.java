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
    public Integrantes(){
        pila.InsertarNodo(temperatura);
    }
    public void mostrarTemperaturas(){
        pila.MostrarValores(); 
    }
    public double mostrarUltimaTemp(){
        double temp = pila.MostrarUltimoValor();
        System.out.println("La ultima temperatura es: "+ temp);
        return temp;
    }
    public String soloNombres(){
        return nombre;
    }
    public String retornoDatos(){
        return "Nombre: " + nombre + "\nParentesco: " + parentesco + "\nEdad: "+edad;
    }   
}
