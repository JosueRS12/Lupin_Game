package LupinBanco.verificable;

public class Validar {    
    public static boolean verificarMovimientoDerecha(int posI, int posJ){
        boolean cont=true;
        switch (posI){
            case 1:
                if(posJ==8)
                    cont=false;               
                break;
            case 2:
                if(posJ==8)
                    cont=false;               
                break;
            case 3:
                if(posJ==8)
                    cont=false;               
                break;
            case 4:
                if(posJ==8)
                    cont=false;               
                break;
            case 6:
                if(posJ==1)
                    cont=false;
                if(posJ==8)
                    cont=false;
            case 7:
                if(posJ==8)
                    cont=false;               
                break;
            case 8:
                if(posJ==8)
                    cont=false;               
                break;         
        }               
        if(posI==5){
            return true;
        }
        else
            return cont;     
    }        
    
    public static boolean verificarMovimientoIzquierda(int posI, int posJ){
        boolean cont=true;
        switch (posI){
            case 1:
                if(posJ==12)
                    cont=false;               
                break;
            case 2:
                if(posJ==12)
                    cont=false;                
                break;
            case 3:
                if(posJ==12)
                   cont=false;                
                break;
            case 4:
                if(posJ==12)
                    cont=false;                
                break;
            case 6:
                if(posJ==8)
                    cont=false;
            case 7:
               if(posJ==12)
                   cont=false;               
                break;
            case 8:
                if(posJ==12)
                   cont=false;                 
                break;          
        }
        return cont;                                         
    } 
        
    public static boolean verificarMovimientoArriba(int posI, int posJ){        
        boolean cont=true;
        switch (posI){
            case 7:
                if(posJ>1 && posJ<8)
                    cont=false;
                break;            
        }
       return cont;        
    }
    
    public static boolean verificarMovimientoAbajo(int posI, int posJ){
        boolean cont = true;
        switch (posI){
            case 5:
                if(posJ>1 && posJ<8)
                    cont=false;
                break;            
        }
        return cont;       
    }
    
    public static boolean verificarMovimientoPerro(int posI, int posJ){
        boolean cont=true;
        switch(posI){
            case 1:
                if(posJ==9 || posJ==10 || posJ==11)
                    cont=false;
                break;
            case 2:
                if(posJ==9 || posJ==10 || posJ==11)
                    cont=false;
               break;
            case 3:
                if(posJ==9 || posJ==10 || posJ==11)
                    cont=false;
                break;
            case 4:if(posJ==9 || posJ==10 || posJ==11)
                    cont=false;
                break;
            case 6:if(posJ==9 || posJ==10 || posJ==11 || posJ==5 || posJ==6 || posJ==7 || posJ==2 || posJ==3 || posJ==4)
                    cont=false;
                break;
            case 7:if(posJ==9 || posJ==10 || posJ==11)
                    cont=false;
                break;
            case 8:if(posJ==9 || posJ==10 || posJ==11)                
                    cont=false;
                break;            
        }        
        return cont;
    }



}
