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
public class T {
    public static void main(String[] args){
        int sp;
        for (sp = 0; sp < 2; sp++){
            System.out.println("");
        }
        for (int t = 0; t < 8; t++){
            System.out.print("|");
        }
        System.out.println("");
        for (int s = 0; s < 4; s++){
            for (sp = 0; sp < 3; sp++){
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
    
}
