/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.marcos.app.bean.Message;

/**
 *
 * @author trabalho
 */
public class Servidor {

    private Painel painel = new Painel();

    ObjectInputStream input = null;
    ObjectOutputStream output = null;
    Socket socket;
    ServerSocket serverSocket;

    public void startServer() throws IOException, ClassNotFoundException {

        painel.setVisible(true);

        //Este é um exemplo de cliente síncrono de uma única thread. Ou seja, as mensagens trocadas são sincronizadas: 
        System.out.println("Painel Iniciado...");
        ServerSocket serverSocket = new ServerSocket(5557); //PORTA

        //System.out.println("Aguardando Cliente Se conectar...");
        socket = serverSocket.accept(); //Socket associado ao cliente.
        //Por meio desse objeto socket podemos enviar e receber dados do cliente, trabalhando com 
        //objetos de entrada e saída de dados associados a conexão.

        //System.out.println("Conexão Estabelecida!");

        try {
            input = new ObjectInputStream(socket.getInputStream());
            output = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

        Message mensagem = new Message();
        while ((mensagem = (Message) input.readObject()) != null) {

            Message.Action action = mensagem.getAction();
            switch (action) {
                case STATECOMPONENT:
                    //mensagem.setResposta("OK");
                    //output.writeObject(mensagem);
                    getEstadoComponente(mensagem);
                    break;

                case DISCONNECT:
                    encerrarServidor();
                    return;

                case CHANGESTATECOMPONENT:
                    alterarEstadoComponente(mensagem);
                    break;
                    
                case ESCREVER:
                    escreverEmComponente(mensagem);
                    break;
            }
        }

    }

    public void encerrarServidor() {
        try {
            //Encerrando o servidor!
            socket.close();
            input.close();
            output.close();

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getEstadoComponente(Message mensagem) throws IOException {

        if (mensagem.getIdentificador().equals("S1") || mensagem.getIdentificador().equals("S2")) {
            double estado = painel.getValorSensor(mensagem.getIdentificador());
            mensagem.setResposta(""+estado);
        } else {
            boolean estado = painel.getEstadoComponente(mensagem.getIdentificador());

            if (estado) {
                mensagem.setResposta("1");
            } else {
                mensagem.setResposta("0");
            }
        }

        output.writeObject(mensagem);

    }

    public void alterarEstadoComponente(Message mensagem) {
        painel.alterarEstadoComponente(mensagem.getIdentificador(), mensagem.getEstado());
    }
    
    public void escreverEmComponente(Message mensagem) {
        painel.escreverEmComponente(mensagem.getIdentificador(), mensagem.getEscrita());
    }
    public double getValorComponete(String componente) {
        return 0;
    }
}
