/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nama;

/**
 *
 * @author asus
 */
public class O {
    public static void main(String[] args){
        int sp;
        for (sp = 0; sp < 1; sp++){
            System.out.println("");
        }
        for (int o = 0; o < 3; o++){
            System.out.print(" ");
        }
        for (int o = 0; o < 2; o++){
            System.out.print("*");
        }
        System.out.println("");//o awal
        System.out.print(" **");
        for (int o = 0; o < 2; o++){
            System.out.print(" ");
        }
         System.out.println("**");//baris 2
        System.out.print("**");
        for (int o = 0; o < 4; o++){
            System.out.print(" ");
        }
         System.out.println("**");//baris 3
        System.out.print(" **");
        for (int o = 0; o < 2; o++){
            System.out.print(" ");
        }
         System.out.println("**");//baris 4
        for (int o1 = 0; o1 < 3; o1++){
            System.out.print(" ");
        }
        for (int o = 0; o < 2; o++){
            System.out.print("*");
        }
        System.out.println("");//o akhir
    }
}
