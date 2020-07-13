package LupinBanco.enemigo;

import LupinBanco.AbstractFactory.Bueno;
import LupinBanco.AbstractFactory.Enemigo;
import LupinBanco.verificable.Validar;
import java.util.Random;
public class Perro implements Enemigo{
    private int posY;
    private int posX;
    private boolean estado;

    public Perro(){
        this.posY=8;
        this.posX=3;
        this.estado=false;
    }

    @Override
    public int getY(){
        return posY;
    }

    @Override
    public int getX(){
        return posX;
    }

    @Override
    public void moverse(){
        Random r = new Random();        
        do{
            posY= r.nextInt(8)+1;
            posX= r.nextInt(19)+1;
            Validar.verificarMovimientoPerro(posY, posX);
        }while(Validar.verificarMovimientoPerro(posY, posX)==false);
        
        
        
        
    }       
    @Override
    public boolean getEstado(){
        return estado;
    }
       
}
