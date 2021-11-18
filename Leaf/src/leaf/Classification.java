/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leaf;

/**
 *
 * @author 12345
 */
public class Classification extends Leaf{
     
    String name;
    int leafCount;

    Classification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void imya (String name) {
        System.out.println("Название дерева - " + name);
    }
    
    public Classification (int c) {
        leafCount = c;
    }
    
    
}
