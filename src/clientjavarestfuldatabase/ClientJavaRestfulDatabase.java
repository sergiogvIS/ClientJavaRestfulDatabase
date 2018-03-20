/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavarestfuldatabase;

/**
 *
 * @author entrar
 */
public class ClientJavaRestfulDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientRestfulDatabase client = new ClientRestfulDatabase();
        System.out.println(client.findAll_XML(String.class));
        System.out.println(client.find_XML(String.class,"3"));
    }
    
}
