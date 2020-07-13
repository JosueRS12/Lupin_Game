package LupinBanco;

import LupinBanco.bueno.Ladron;
import LupinBanco.enemigo.Perro;
import LupinBanco.AbstractFactory.FabricaAbstracta;
import LupinBanco.AbstractFactory.Fabricar;
import java.util.Random;
import LupinBanco.AbstractFactory.Bueno;
import LupinBanco.AbstractFactory.Elemento;
import LupinBanco.AbstractFactory.Enemigo;
import LupinBanco.Elemento.Llave;

public class Boveda {
    //private Bueno miladron;    
    private Bueno miladron;
    private Enemigo perrito;
    private Elemento llavesita;
    private char[][] miboveda;

    public Boveda(int fils, int cols){
        //miladron = new Ladron();
        FabricaAbstracta fb = Fabricar.getFabrica("bueno");
        FabricaAbstracta fb2 = Fabricar.getFabrica("enemigo");
        FabricaAbstracta fb3 = Fabricar.getFabrica("elemento");
        miladron  = fb.getActor("ladron");  
        perrito = fb2.getEnemigo("perro");
        llavesita = fb3.getElemento("llave");
        
        miboveda = new char[fils][cols];
        for(int i=0; i<fils; i++){
            for(int j=0; j<cols; j++){
                miboveda[i][j] = ' ';
            }
        }
        Random r = new Random();
        //Generamos las alarmas al azar
        for(int k=0; k<fils*cols/4; k++){
            int i, j;
            do{
                i = r.nextInt(fils-1);
                j = r.nextInt(cols-1);
            }while(miboveda[i][j]!=' ');
            miboveda[i][j]='A';
        }
        //Generamos los switch al azar
        for(int k=0; k<fils*cols/4; k++){
            int i, j;
            do{
                i = r.nextInt(fils-1);
                j = r.nextInt(cols-1);
            }while(miboveda[i][j]!=' ');
            miboveda[i][j]='S';
        }
    }

    public char getChar(){
        return miboveda[miladron.getI()][miladron.getJ()];
    }
    
    public Bueno getMiladron(){
        return miladron;
    }
    
    public Enemigo getMiPerro(){
        return perrito;
    }
    
    public String toString(){
        String out = "";
        int fils = miboveda.length;
        int cols = miboveda[0].length;        
        for(int i=0; i<=fils; i++){
            for(int j=0; j<=cols; j++){
                    if(i==0||i==fils||j==0||j==cols)                    
                        out+= "*";
                    else if (i==6&&j==2){ //||i==6 && j==1||i==6 && j==8                    
                        //if(j==1||j==8)
                        //      out+="-";                                                       
                        out+= "******";                                                                        
                        j= 7;
                    }
                    else if (i==1 && j==9||i==2 && j==9||i==3 && j==9||i==4 && j==9||i==8 && j==9||i==7 && j==9||i==6 && j==9){//||i==5 && j==9
                            //if(i==5){
                              //  out+= "///";
                                //j=11;
                            //}                            
                                    out+= "***";                                                       
                                j=11;
                            
                    }                                    
                    else if(i==miladron.getI() && j==miladron.getJ())
                        out+= "l";
                    else if(i==perrito.getY() && j==perrito.getX())
                        out+= "g";
                    else if(i==llavesita.getY() && j==llavesita.getX())
                        out+= "k";
                    else
                        out+= " ";
            }            
            out += "\n";
        }
        return out;
    }

}
