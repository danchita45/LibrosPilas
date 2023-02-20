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
public class menu {

    public void menu(Stack pila) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Libro l = new Libro();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opcion\n");
        System.out.println("1: Agregar Libro\n");
        System.out.println("2: ver y vaciar (pop)\n");
        System.out.println("3: ver ultimo Libro(peek)\n");
        System.out.println("4: ver y eliminar ultimo(pop)\n");
        String opc = teclado.nextLine();

        switch (opc) {

            case "1":
                Stack np = new Stack();
                np = l.insertPila(pila);
                menu(np);
                break;
            case "2":
                l.leerpila(pila);
                menu(pila);
            case "3":
                l.peekpila(pila);
                menu(pila);
            case "4":
                 l.sacarultimo(pila);
                menu(pila);
            case "0":
                System.exit(0);
            default:
                System.out.println("La opcion no existe");
                break;

        }
    }
}
