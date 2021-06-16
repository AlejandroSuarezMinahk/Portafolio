/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectopila;
import PilaDinamica.*;
import entradaSalida.consola;

/**
 *
 * @author Invitado
 */
public class AppPila {
  Pila P;
  
public AppPila(){
    P=new Pila();
}  

public void menuPrincipal() {
    
        int op;
        do {
             System.out.println("\n");
            System.out.println("Actualizacion de Pila");
            System.out.println("1. agregar elementos  a la Pila");
            System.out.println("2. eliminar elementos de la pila");
            System.out.println("3. Mostrar Pila");
            System.out.println("0. Salir");
            System.out.print("Ingrese opcion: ");
            op = consola.leerEntero();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println("Generar Pila");
                    insertar();
                    break;

                case 2:
                   System.out.println("eliminar elementos de la pila ");
                    EliminarElemento();
                    break;

                case 3:
                    System.out.println("mostrar elementos ");
                    mostrar();
                    break;
                 case 0:
                 break  ;
            }
        } while (op != 0);
    }


    private void insertar() {
                int num;
		String op = "s";
		while(!op.equalsIgnoreCase("n")){
			System.out.println("ingrese elemento: ");
			num = consola.leerEntero();
                        
			P.apilar(num);
			System.out.println("Continuar s/n");
			op = consola.leerString();	
		
                } 
                
         
    }

private void retornar( Pila A, Pila B){
    
    while (!B.pilaVacia()) {
            NodoP x=B.desapilar();  
            A.apilar(x.getDato());
        }
}

    private void mostrar() {
        Pila Aux= new Pila();
       if (!P.pilaVacia()){
      while (!P.pilaVacia()) {
            NodoP temp=P.desapilar();
            System.out.println(" ");
            consola.emitirMensaje(temp.getDato()+" ");
            Aux.apilar(temp.getDato());
          }}
     else
          System.out.println(" vacia");  
     
     retornar(P,Aux);
          }

    private void EliminarElemento() {
        // ingresa el elemento hasta que el operador lo decida
        String op = "s";
        while (!op.equalsIgnoreCase("n")) {
            System.out.println("ingrese el elemento a eliminar");
            int ele = consola.leerEntero();
            buscoyElimino(ele);
            System.out.println("continua(s/n)");
            op = consola.leerString();
        }
    }

    public void buscoyElimino(int ele) {
        int B=0;
        Pila A = new Pila();
        while (!P.pilaVacia()){
            NodoP x = P.desapilar();
            if (x.getDato()!=ele){
                A.apilar(x.getDato()); 
            }
            else{
                B=1;
            }
        }
        if (B==0){
            System.out.println("No existe el elemento.");
        }
        retornar (P, A);
    }
}


