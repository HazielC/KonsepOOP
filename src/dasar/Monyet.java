/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;


public class Monyet {
    public static void main(String[] args) {
 
         
        Hewan monyet = new Hewan(); 
        
        System.out.println("===== Data Hewan Monyet =====");
        System.out.print("Cara Makan : ");        
        monyet.makan(); 
        System.out.print("Cara Berjalan : ");
        monyet.jalan();
        System.out.print("Cara Berlari : ");
        monyet.lari();
        System.out.print("Cara Lompat : ");
        monyet.lompat();
    }
}

