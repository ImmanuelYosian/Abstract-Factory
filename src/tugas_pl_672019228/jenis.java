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
public class jenis {
     public Snack getSnack(String SnackType) {
        if (SnackType == null) {
            return null;
        }
        if (SnackType.equalsIgnoreCase("pilus")) {
            return new pilus();
        } else if (SnackType.equalsIgnoreCase("cheetos")) {
            return new cheetos();
        } else if (SnackType.equalsIgnoreCase("taro")) {
            return new taro();
        }
        return null;
    }
}
