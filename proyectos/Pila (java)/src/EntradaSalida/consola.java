/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entradaSalida;

/**
 *
 * @author Kelly Zarco
 */
public class consola {

    public static String leerString() {
        int ch;
        String r = "";
        boolean done = false;
        while (!done) {
            try {
                ch = System.in.read();
                if (ch < 0 || (char) ch == '\n') {
                    done = true;
                } else {
                    if ((char) ch != '\r') {
                        r = r + (char) ch;
                    }
                }
            } catch (java.io.IOException e) {
                done = true;
            }
        }
        return r;
    }
    
    
    public static int leerEntero() {
            while (true) {
            try {
                return Integer.parseInt(leerString().trim());
            } catch (NumberFormatException e) {
                System.out.println("No es un integer. Por favor, pruebe otra vez!");
            }
            }
    }
            
public static void emitirMensaje(String mensaje){
                System.out.print(" "+mensaje);
            }
}
