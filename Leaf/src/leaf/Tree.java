/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leaf;

/**
 *
 * @author 12345
 */
public class Tree{   
    
    /**
     * age - it is the age of the tree
     */
    int age;
    /**
     * 
     * @param width - width of the leaf
     * @param length - lenght of the leaf
     * @param section - count of parts of the leaf
     * @return - area of the leaf (all it`s parts)
     */
    int area (int width, int length, int section) {
        return width*length*section;
    }
    /**
     * 
     * @param width - width of the leaf
     * @param length - lenght of the leaf
     * @return - area of the leaf
     */
    int area (int width, int length) {    //ПЕРЕГРУЗКА
        return width*length;
    }

}