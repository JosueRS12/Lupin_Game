package LupinBanco.AbstractFactory;

import LupinBanco.Elemento.Llave;

public class FabricaElemento implements FabricaAbstracta{

    @Override
    public Elemento getElemento(String elemento) {
            if(elemento.equalsIgnoreCase("llave"))
                    return new Llave();
            else
                    return null;
    }

    @Override
    public Bueno getActor(String elemento) {
                return null;
    }

    @Override
    public Enemigo getEnemigo(String enemigo) {
        return null;
    }
        

}
