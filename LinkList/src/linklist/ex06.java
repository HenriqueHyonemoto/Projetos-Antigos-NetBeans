/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.util.LinkedList;

/**
 *
 * @author Rick
 */
public class ex06 {
    public static void main(String[] args) {
    LinkedList<String> hades = new LinkedList<String>();
    hades.add("Zagreus");
    hades.add("Hades");
    hades.add("Nix");
    hades.add("Artemis");
   
    hades.addFirst("Hermes");
    hades.addLast("Afrodite");
    

    //System.out.println("Primeiro: " + hades.getFirst());
    //System.out.println("Ultimo: " + hades.getLast());
    
    hades.removeFirst();
    hades.removeLast();
    
    System.out.println("Primeiro: " + hades.getFirst());
    System.out.println("Ultimo: " + hades.getLast());
    
    System.out.println(hades);
  }
}

