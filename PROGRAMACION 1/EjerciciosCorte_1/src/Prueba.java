
public class Prueba {
    int valorUnidad;
    String nombre;
    
    public Prueba(int valorU, String nomb){
        this.valorUnidad = valorU;
        this.nombre = nomb;
    }
    
    public int valorTotal(int num){
        int valorTotal= valorUnidad * num;
        return valorTotal;
    }
    
    public void cambiarNombre(String nombNew){
        this.nombre = nombNew;
    }
}
