package LupinBanco.bueno;

import LupinBanco.AbstractFactory.Bueno;
import LupinBanco.AbstractFactory.Enemigo;
import LupinBanco.verificable.Validar;
import java.util.ArrayList;

public class Ladron implements Bueno {

    private int i; 
    private int j; 
    private String estado;
    private ArrayList<Enemigo> observadores;

    public Ladron(){
        i=1;
        j=1;
        estado = "Feliz";
        observadores = new ArrayList<Enemigo>();
    }

    @Override
    public String getEstado() {
        return estado;        
    }

    @Override
    public int getI() {        
        return i;
    }

    @Override
    public int getJ() {
        return j;
    }


    /**
     * setEstado
     * A: Alarma-> Triste
     * S: switch-> Feliz
     * N: Vacio-> Normal
     * @param c
     */
    @Override
    public void setEstado(char c){
        if(c=='A'){
            estado = "Triste";
        }else if(c=='S'){
            estado = "Feliz";
        }
    }        

    @Override
    public void haciaArriba(){
        if(i>1 && Validar.verificarMovimientoArriba(i, j)==true){
            notificar();
            i--;
        }      
    }

    @Override
    public void haciaAbajo(int filasMax){
        if(i<filasMax && Validar.verificarMovimientoAbajo(i, j)==true){
            notificar();
            i++;
        }       
    }

    @Override
    public void haciaIzquierda(){
        if(j>1 && Validar.verificarMovimientoIzquierda(i, j)==true){
            notificar();
            j--;
        }
    }

    @Override
    public void haciaDerecha(int colMax){
        if(j<colMax && Validar.verificarMovimientoDerecha(i, j)==true){
            notificar();
            j++;
        }
    }

    @Override
    public void enlazarObservador(Enemigo o){
        observadores.add(o);
    }
    
    @Override
    public void notificar() {
       for(Enemigo o:observadores){
           o.moverse();
       }
    }
}
