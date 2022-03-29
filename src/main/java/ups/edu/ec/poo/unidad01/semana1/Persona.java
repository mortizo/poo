/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.poo.unidad01.semana1;

/**
 *
 * @author Mauricio Ortiz
 */

public class Persona {
    String nombre;
    short edad;
    float peso;
 
    String saludar(){
        return "Hola Mundo";
    }
    
    public void inicializarVariables(){
        
        int variableEntera;
        variableEntera=0;
        
        String variableTexto;
        variableTexto = "POO";
        
        float variableDecimal;
        variableDecimal = 8.5f;
        
        boolean variableBooleana;
        variableBooleana=false;
        
        var variableEntera1 =0;
        var variableTexto1 = "POO";
        var variableDecimal1 = 8.5f;
        var variableDecimal2 = 8.5d;
        var variableBooleana1 =false;
        
        int x;
        
        
        System.out.println(variableTexto);
        System.out.println(variableDecimal);
        System.out.println(variableEntera);
        System.out.println(variableBooleana);
        System.out.println(variableTexto1);
        System.out.println(variableDecimal1+variableDecimal2+variableTexto1 );
        System.out.println(variableDecimal2);
        System.out.println(variableEntera1);
        System.out.println(variableBooleana1);
        
        
        
     
        
    }
    
}




