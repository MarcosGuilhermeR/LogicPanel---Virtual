/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painel;

import java.io.IOException;

/**
 *
 * @author trabalho
 */
public class PainelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO code application logic here
        Servidor servidor = new Servidor();
        servidor.startServer();
    }
    
}
