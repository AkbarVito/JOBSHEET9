/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class LatihanSoal1 {

    /**
     * @param args the command line arguments
     */
    public static void hitung(int a, int b) {
        // TODO code application logic here
        System.out.println("hasil: " + (a + b));
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan bilangan I : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan II : ");
        int bil2 = input.nextInt();
        
        hitung(bil1, bil2);
    }
}
