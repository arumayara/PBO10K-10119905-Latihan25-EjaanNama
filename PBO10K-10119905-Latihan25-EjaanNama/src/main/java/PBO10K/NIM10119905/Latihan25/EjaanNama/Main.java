/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan25.EjaanNama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program untuk membuat ejaan nama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        
        char[] userFirstName;
        
        System.out.println("Masukan Nama Depan Anda Untuk Di Eja : ");
        userFirstName = scanner.nextLine().toCharArray();
        
        System.out.printf("%nEjaan Untuk \"%s\" Adalah : %n", new String(userFirstName));
        for (int i = 0; i < userFirstName.length; i++) 
            System.out.printf("Huruf ke-%d : %c%n",i+1,userFirstName[i]);
    
    }
    
}

