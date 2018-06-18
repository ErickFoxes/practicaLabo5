/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import dao.FiltroDao;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Filtro;

/**
 *
 * @author UCA
 */
public class Inventario {
  /*  public static void main(String[] args) {
        FiltroDao fd = new FiltroDao();
        
        ArrayList<Filtro> todos = fd.readAll();
        
        for(Filtro f : todos)
        {
            System.out.println(f.toString());
        }
        
        
        Scanner M = new Scanner(System.in);
        System.out.println("Ingresa id");
        int R1 = M.nextInt();
        System.out.println("Ingresa cod");
        String R2 = M.next();
        System.out.println("Ingresa marca");
        String R3 = M.next();
        System.out.println("Ingresa stock");
        int R4 = M.nextInt();
        System.out.println("Ingresa existencia");
        boolean R5 =M.nextBoolean();
        
        Filtro fil = new Filtro(R1,R2,R3,R4,R5);
        fd.create(fil);
        
        System.out.println("Ingresa id");
        int R11 = M.nextInt();
        System.out.println("Ingresa cod");
        String R22 = M.next();
        System.out.println("Ingresa marca");
        String R33 = M.next();
        System.out.println("Ingresa stock");
        int R44 = M.nextInt();
        System.out.println("Ingresa existencia");
        boolean R55 =M.nextBoolean();
        
        Filtro fil2 = new Filtro(R11,R22,R33,R44,R55);
        fd.create(fil2);
        
        System.out.println("Ingresa id");
        int R111 = M.nextInt();
        System.out.println("Ingresa cod");
        String R222 = M.next();
        System.out.println("Ingresa marca");
        String R333 = M.next();
        System.out.println("Ingresa stock");
        int R444 = M.nextInt();
        System.out.println("Ingresa existencia");
        boolean R555 =M.nextBoolean();
        
        Filtro fil3 = new Filtro(R111,R222,R333,R444,R555);
        fd.create(fil3);
        
        System.out.println("¿Cual desea borrar?");
        int R6 = M.nextInt();
        fd.delete(R6);
        
    }*/
}
