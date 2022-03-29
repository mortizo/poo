/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.poo;

import ups.edu.ec.poo.unidad01.semana1.Perro;
import ups.edu.ec.poo.unidad01.semana1.Persona;

/**
 *
 * @author mortizo
 */
public class Poo {

    public static void main(String[] args) {
        
        
        
        
        System.out.println("Hola Mundo");
        int a=50;
        int b=11;
        int c=10;
        
        String mensaje = (a>b)?(a>c)?"A es mayor":"C es mayor":(b>c)?"B es mayor":"C es mayor";
        
        System.out.println(mensaje);
        
        var perrito = new Perro();
        perrito.nombre="Lassie";
        
        System.out.println("El perrito se llama: "+perrito.nombre);
        
        var personita = new Persona();
        System.out.print(personita.toString());
        personita.inicializarVariables();
    }
    
    
        void metodo()
        {
            var a=7;
            var b=5;
            var c=a+b;
            System.out.print(c);
        }
    
}
