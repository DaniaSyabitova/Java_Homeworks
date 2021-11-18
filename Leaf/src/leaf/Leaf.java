/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leaf;

import static leaf.Int2.STR2;

/**
 *
 * @author 12345
 */
public class Leaf extends Tree{ 

    /**
     * @param args the command line arguments
     */
    /**
     * barkcolor - it is the color of the tree`s bark
     */
    String barkcolor;
    
    
    @Override
    int area (int width, int length, int section) {  //ПЕРЕОПРЕДЕЛЕНИЕ
        System.out.println("Размер составного листочка равер " + width*length*section + " кв. см");
        return 1;
    }
    
   
    public static void main(String[] args) {
       Leaf objCl1 = new Leaf ();
       objCl1.age = 18;
       objCl1.barkcolor = "Коричневый";
       objCl1.area(3, 4, 5);
       System.out.println("Размер простого листочка равен " + objCl1.area(6, 4) + " кв.см");
       objCl1.Eatarea(objCl1.area(4, 6));
       
       Classification bereza = new Classification(13456);      
       bereza.imya("берёза");
       System.out.println("У берёзы " + bereza.leafCount + " листьев.");
       Classification klen = new Classification (7454568);
       klen.imya("клён");
       System.out.println("У клёна " + klen.leafCount + " листьев");
       Classification topol = new Classification(134546476);
       topol.imya("тополь");                         //КОНСТРУКТОР 
       System.out.println("У тополя " + topol.leafCount + " листьев");
       
       Leaf objLEAF = new Leaf();  //ИНТЕРФЕЙС
        objLEAF.Meth2();
        System.out.println(STR2);
        
        
        
        Conditions perech1 = Conditions.ALIVE;
        switch (perech1) {
            case ALIVE: System.out.println("На деревьях леса умеренное количество гусениц. Пока что деревья живы."); break;
            case DEAD: System.out.println("На деревьях леса слишком много гусениц. Деревья мертвы."); break;
            case ALMOSTDEAD: System.out.println("Гусениц очень много. Деревья на последнем издыхании."); break;
        }
       
    }
    
    void Eatarea(int area) {
        System.out.println("За день гусеницы съедают "+ area/2 + " кв. см от листочка");
    }
    
    Leaf (){}               //ИНТЕРФЕЙС
    
    public int Meth1(String str1) {
        return Integer.parseInt(str1);
    }
    
    public void Meth2() {
        System.out.println("Деревья потребляют углекислый газ");
    }
    
   
    private enum Conditions {        //  ПЕРЕЧИСЛЕНИЕ И КОНСТАНТЫ
         ALIVE, DEAD, ALMOSTDEAD;
     }
}
