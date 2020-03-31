package seguimientotemperatura;

public class ActualizacionTemperaturas {
    public nodo ultimoValor;
        int tamano=0;
        String lista="";
    public ActualizacionTemperaturas(){
        ultimoValor= null;
        tamano=0;
    }
    //agregar nodo
    public void InsertarNodo(double nodo){
        nodo nuevo_nocdo = new nodo(nodo);
        nuevo_nocdo.siguiente = ultimoValor;
        ultimoValor = nuevo_nocdo;
        tamano++;
    }
    //mostrar ultimo dato
    public double MostrarUltimoValor(){
        return ultimoValor.informacion;
    }
    //mostrar contenido
    public void MostrarValores(){
        nodo recorrido = ultimoValor;
        while(recorrido!=null){
        lista += recorrido.informacion + "\n";
        recorrido = recorrido.siguiente;
        }
    }
}
