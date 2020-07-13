package LupinBanco.AbstractFactory;

public interface FabricaAbstracta {
    
        Bueno getActor(String actor);
        Elemento getElemento(String elemento);
        Enemigo getEnemigo(String enemigo);
}
