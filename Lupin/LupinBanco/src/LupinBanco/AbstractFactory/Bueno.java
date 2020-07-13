package LupinBanco.AbstractFactory;

public interface Bueno {                  
    String getEstado();
    int getI();
    int getJ();
    void setEstado(char c);
    void haciaArriba();
    void haciaAbajo(int filasMax);
    void haciaIzquierda();
    void haciaDerecha(int colMax);
    public void notificar(); 
    public void enlazarObservador(Enemigo o);
}
