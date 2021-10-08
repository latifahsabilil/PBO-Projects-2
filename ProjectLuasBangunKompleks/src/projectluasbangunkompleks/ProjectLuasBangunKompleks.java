/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Lenovo
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran L = new Lingkaran();
        L.jejari = 21;
        
        Persegi P = new Persegi();
        P.sisi = 42;
        
        int totalLuas = 2 * L.hitungLuas() + P.hitungLuas();
        System.out.println("Luas bangun tersebut adalah " + totalLuas + " satuan luas");
    }
    
}
