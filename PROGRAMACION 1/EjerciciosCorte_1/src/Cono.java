
public class Cono {
    private float radio;
    private float altura;
    private float volumen;
    
    public Cono(float rad, float altu){
        this.radio=rad;
        this.altura=altu;
    }
    
    public void volumen(){
        this.volumen= (float) ((Math.PI*Math.pow(radio, 2)*altura))/3;
    }
    
    
    public static void main(String[] args){
        float r1=(float) 2.3;
        float h1= 3, r2=3,h2=2;
        
        Cono c1 = new Cono(r1,h1);
        Cono c2 = new Cono(r2,h2);
        
//        if(c1.volumen > c2.)
    }
}
