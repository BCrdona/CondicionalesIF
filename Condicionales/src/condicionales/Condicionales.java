/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author anton
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        int[]a={0,1,0,1,0};
        int[]b={0,0,1,1,0};//para and or
        int []c={15,25,45,36,98};//para mayor y menor
        
        
        ClaseIf condicion=new ClaseIf();
        condicion.setAND(a, b);
        condicion.setCuadratica(15, 20, 5);
        condicion.setDiv(14, 2);
        condicion.setIgual(6, 10);
        condicion.setMaximo(c);
        condicion.setMayor(10, 5);
        condicion.setMenor(1, 14);
        condicion.setMinimo(c);
        condicion.setMul(16, 8);
        condicion.setNOT(a);
        condicion.setOR(a, b);
        condicion.setRaiz(8, 2);
        condicion.setResta(24, 3);
        condicion.setSuma(52, 8);
    }
    
}
