
package LupinBanco.AbstractFactory;

import LupinBanco.enemigo.Perro;

public class FabricaEnemigo implements FabricaAbstracta{

    @Override
    public Bueno getActor(String actor) {
        return null;
    }

    @Override
    public Elemento getElemento(String elemento) {
        return null;
    }

    @Override
    public Enemigo getEnemigo(String enemigo) {
        if(enemigo.equalsIgnoreCase("perro"))
            return new Perro();
        else
            return null;
    }
    
}
