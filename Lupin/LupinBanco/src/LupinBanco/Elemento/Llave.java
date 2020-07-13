package LupinBanco.Elemento;

import LupinBanco.AbstractFactory.Elemento;

public class Llave implements Elemento{
    
    private int posY;
    private int posX;
    private boolean estado;
    
    public Llave(){
            this.posY=8;
            this.posX=4;
            this.estado=false;
    }

    public String getLlave(){ //metodo de prueba o verificacion
            return "llave creada";
    }
        
    @Override
    public boolean verificarEstado(){
        return false;
    }

    @Override
    public int getX() {
        return posX;
    }

    @Override
    public int getY() {
        return posY;
    }

    @Override
    public boolean getEstado() {
        return estado;
    }
}
