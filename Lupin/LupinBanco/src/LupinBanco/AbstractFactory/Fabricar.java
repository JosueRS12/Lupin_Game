package LupinBanco.AbstractFactory;

public class Fabricar {

    public static FabricaAbstracta getFabrica(String fabrica){
        if (fabrica.equalsIgnoreCase("bueno"))
            return new FabricaBueno();
        else if (fabrica.equalsIgnoreCase("elemento"))
            return new FabricaElemento();
        else if (fabrica.equalsIgnoreCase("enemigo"))
            return new FabricaEnemigo();
        else
            return null;                                
    }

}