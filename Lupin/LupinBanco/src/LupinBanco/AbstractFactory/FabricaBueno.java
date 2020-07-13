package LupinBanco.AbstractFactory;

import LupinBanco.bueno.Ladron;
import LupinBanco.enemigo.Perro;

public class FabricaBueno implements FabricaAbstracta{

    @Override
    public Bueno getActor(String bueno) {
        if (bueno.equalsIgnoreCase("ladron"))
            return new Ladron();        
        else
            return null;
    }

    @Override
    public Elemento getElemento(String elemento) {
        return null;        
    }

    @Override
    public Enemigo getEnemigo(String enemigo) {
        return null;
    }

}
