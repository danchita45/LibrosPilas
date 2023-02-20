/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Danchita45
 */
public class Libro {
    
    
    String Titulo;
    String Autor;

    public Libro() {
    }

    public Libro(int LibroId, String Titulo, String Autor) {
        
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Autor=" + Autor + '}';
    }

   
    
    
    
    public Stack insertPila(Stack pila){
    Scanner s = new Scanner(System.in);
    
        Libro l = new Libro();
        System.out.println("Ingrese Titulo");
        l.Titulo = s.nextLine();
        System.out.println("Ingrese Autor");
        l.Autor = s.nextLine();
        pila.add(l);
        return pila;
    }
    
    public void leerpila(Stack pila){
        for (int i = 0; i < pila.capacity(); i++) {
            if (!pila.isEmpty()) {
                System.out.println("ultimo de la pila" + pila.pop());
                System.out.println("Se ha eliminado el libro");
            }else{
                System.out.println("la pila está vacia");
                break;
            }

        }
    }
     public void sacarultimo(Stack pila){
        for (int i = 0; i < pila.capacity(); i++) {
            if (!pila.isEmpty()) {
                System.out.println("ultimo de la pila" + pila.pop());
                System.out.println("Se ha eliminado el libro");
                break;
            }else{
                System.out.println("la pila está vacia");
                break;
            }

        }
    }
     public void peekpila(Stack pila){
       
            if (!pila.isEmpty()) {
                System.out.println("ultimo de la pila" + pila.peek());
                
            }else{
                System.out.println("la pila está vacia");
               
            }

        
    }
    
}
