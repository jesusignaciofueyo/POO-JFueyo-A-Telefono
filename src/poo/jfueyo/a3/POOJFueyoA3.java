/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.a3;

/**
 *
 * @author jesus_ignacio_159
 */
public class POOJFueyoA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono starTac = new Telefono();
        starTac.EA.presionar();
        System.out.println("El starTac está " + starTac.EA.IO);
        
        starTac.setTeclado();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(starTac.Teclado[i][j].getDigito());
            }
        }
    }
    
}
