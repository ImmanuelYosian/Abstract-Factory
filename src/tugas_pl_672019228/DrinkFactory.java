/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pl_672019228;

/**
 *
 * @author denisaditya
 */
public class DrinkFactory extends AbstractFactory{
    @Override
    Snack getSnack(String snack) {
        return null;
    }
    
    @Override
     public Drink getDrink(String DrinkType) {
        if (DrinkType == null) {
            return null;
        }
        if (DrinkType.equalsIgnoreCase("milo")) {
            return new milo();
        } else if (DrinkType.equalsIgnoreCase("fruittea")) {
            return new fruittea();
        } else if (DrinkType.equalsIgnoreCase("goodday")) {
            return new goodday();
        }
        return null;
    }
     
    
}
