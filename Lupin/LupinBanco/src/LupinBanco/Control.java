package LupinBanco;

import LupinBanco.AbstractFactory.Bueno;
import LupinBanco.AbstractFactory.Enemigo;
import LupinBanco.bueno.Ladron;
import LupinBanco.verificable.Validar;
import java.util.Scanner;

public class Control {          
    public static void main(String[] args) {
        int fils = 9;
        int cols = 20;
        Boveda boveda = new Boveda(fils, cols);
        Bueno ladron = boveda.getMiladron();
        Enemigo perro = boveda.getMiPerro();
        ladron.enlazarObservador(perro);        
        int opcion;
        Scanner in = new Scanner(System.in);
        do {
                System.out.print(boveda);
                System.out.print("Ladron: " + ladron.getEstado());
                System.out.println();
                System.out.println("Menu\n1:arriba\n2:abajo\n3:izquierda\n4:derecha");
                opcion = in.nextInt();
                    switch (opcion){
                        case 1:                                             
                            ladron.haciaArriba();
                            break;
                        case 2:
                            ladron.haciaAbajo(fils - 1);
                            break;
                        case 3:
                            ladron.haciaIzquierda();
                            break;
                        case 4:
                            ladron.haciaDerecha(cols - 1);
                            break;
                }                    
                ladron.setEstado(boveda.getChar());            
        } while (!(ladron.getI() == fils - 1 && ladron.getJ() == cols - 1)&&!(ladron.getI()==perro.getY() && ladron.getJ()==perro.getX()));
        System.out.println(boveda);
        if(ladron.getI() == fils - 1 && ladron.getJ() == cols - 1)
            System.out.println("salio " + ladron.getEstado());
        else if (ladron.getI()==perro.getY() && ladron.getJ()==perro.getX())
            System.out.println("perdio, el perro lo atrapo");
    }

}
