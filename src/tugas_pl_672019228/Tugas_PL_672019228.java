/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pl_672019228;

/**
 *
 * @author HP
 */
public class Tugas_PL_672019228 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jenis jenis = new jenis();
        
        Snack Snack1 = jenis.getSnack("taro");
        Snack1.draw();
        
        Snack Snack2 = jenis.getSnack("cheetos");
        Snack2.draw();

        Snack Snack3 = jenis.getSnack("pilus");
        Snack3.draw();
    }
}
