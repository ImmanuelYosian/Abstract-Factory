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
        SnackFactory snackfact = new SnackFactory();
        
        Snack Snack1 = snackfact.getSnack("Taro");
        Snack1.makan();
        
        Snack Snack2 = snackfact.getSnack("Cheetos");
        Snack2.makan();

        Snack Snack3 = snackfact.getSnack("Pilus");
        Snack3.makan();
        
        DrinkFactory drinkfact = new DrinkFactory();
        
        Drink Drink1 = drinkfact.getDrink("Milo");
        Drink1.minum();
        
        Drink Drink2 = drinkfact.getDrink("FruitTea");
        Drink2.minum();
        
        Drink Drink3 = drinkfact.getDrink("GoodDay");
        Drink3.minum();
    }
}
