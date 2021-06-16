package PilaDinamica;


public class Pila {
    NodoP tope;

    public Pila() {
        this.tope = null;
    }
    
   public void apilar( int ele){ 
       NodoP nuevo=new NodoP(ele);
       if(pilaVacia()){
           tope=nuevo;
       } else  {
                    nuevo.setPs(tope);
                    tope=nuevo;
                    }
       }
   
   public NodoP desapilar(){
       NodoP nuevo=null;
       if(pilaVacia()){
           System.out.println("pila vacia");
            }
       else
       {
         nuevo=tope;
         tope=tope.getPs();
       }
       return nuevo;
        }

   public boolean pilaVacia(){
       if(tope==null)
           return true;
       else 
           return false;
   }

   


}
