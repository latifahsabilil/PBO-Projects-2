/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author Lenovo
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lingkaran L = new Lingkaran();
        L.jejari = 7;
        Lingkaran L2 = new Lingkaran();
        L2.jejari = 14;
        
        
        int totalLuas = L2.hitungLuas()/ 2 - L.hitungLuas();
        System.out.println("Luas bangun yang diarsir adalah " + totalLuas + " satuan luas");
    }
    
}
