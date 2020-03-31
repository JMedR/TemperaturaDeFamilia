package seguimientotemperatura;

public class ActualizacionTemperaturas {
    public float temperatura;
    public ActualizacionTemperaturas(float temperatura) {
        this.temperatura = temperatura;
    }
    public float retornoTemperaturas(){
        return (float) temperatura;
    }    
}
