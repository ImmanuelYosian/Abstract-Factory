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
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
//        if (choice.equalsIgnoreCase("SHAPE")) {
//            return new ShapeFactory();
//        } else if (choice.equalsIgnoreCase("COLOR")) {
//            return new ColorFactory();
//        }
//        return null;
          return choice.equalsIgnoreCase("snack") ? new SnackFactory()
               : choice.equalsIgnoreCase("drink") ? new DrinkFactory()
               : null;
    }
}
