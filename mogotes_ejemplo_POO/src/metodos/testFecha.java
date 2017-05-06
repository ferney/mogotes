/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Admin
 */
public class  testFecha {
    public static void main(String[] args) {
        fecha f=new fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        
        System.out.println("Dia="+f.getDia());
         System.out.println("Mes="+f.getMes());
          System.out.println("Año="+f.getAnio());
           System.out.println(f);
        
        
    }
}
