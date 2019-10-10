/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan24;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program perbandingan dua buah nilai
 */
public class Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilaiA,nilaiB;
        int hasil;
        String status="ya";
        Scanner input = new Scanner(System.in);
        
        while(status.equals("ya")){
                 System.out.print("Masukan Nilai Pertama :");
                 nilaiA = input.nextInt();
        
                 System.out.print("Masukan Nilai Kedua :");
                 nilaiB = input.nextInt();
                 
                 if(nilaiA > nilaiB){
                     System.out.println("hasil : nilai "+nilaiA+" Lebih besar Dari "+nilaiB);
                 }else if(nilaiA < nilaiB){
                     System.out.println("hasil : nilai "+nilaiA+" Lebih kecil Dari "+nilaiB);
                 }
                 
                 System.out.print("Ulangi aktifitas ? (Ya/Tidak) ");
                 status = input.next();
        }
        
       
        
        
    }
    
}
