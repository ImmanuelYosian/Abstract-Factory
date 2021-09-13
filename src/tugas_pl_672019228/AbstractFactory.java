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
public abstract class AbstractFactory {
    abstract Snack getSnack(String snack);
    abstract Drink getDrink(String drink);
}
