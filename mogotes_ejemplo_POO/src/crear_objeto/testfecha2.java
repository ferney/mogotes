/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crear_objeto;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testfecha2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ingrese  fecha1 (dia, mes, año): ");
        int dia=scan.nextInt();
        int mes=scan.nextInt();
        int anio=scan.nextInt();
        Fecha f1=new Fecha(dia,mes,anio);
        
        System.out.println("ingrese  fecha2 (dia, mes, año): ");
        dia=scan.nextInt();
        mes=scan.nextInt();
        anio=scan.nextInt();
        Fecha f2=new Fecha(dia,mes,anio); 
        
        System.out.println("fecha 1= "+ f1);
        System.out.println("fecha 2= "+ f2);
        if (f1.equals(f2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }
    }
}
