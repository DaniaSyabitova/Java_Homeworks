/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_thread;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sort_thread.Sort_Thread.BubbleSort;

/**
 *
 * @author Асхат
 */
public class Sec_Sort_Thread extends Thread{
    
    static void swap (int [] a, int x, int y) {   //Я не поняла, что это и зачем, но без этого не работает
        int t = a[x];
        a[x]=a[y];
        a[y]=t;
    }
      
    static void BubbleSort (int [] a){
        for (int i = 0; i < a.length - 1; i++) {
             for (int j = 0; j < a.length - 1; j++) {
                 if (a[j] > a[j+1]) {
                     swap(a, j, j+1); 
                 }
             }
        }
    }

    @Override
    public void run () {
        
        int [] mas4;
        mas4 = new int [10000];
        
        for (int i = 0; i < mas4.length; i++) {
            mas4[i] = ((int)(Math.random() * 100));
        }
        
        long l = System.currentTimeMillis();
        BubbleSort (mas4);
        System.out.println("Четвертый массив: " + Arrays.toString(mas4));
        double l1 = (double)(System.currentTimeMillis() - l);
        System.out.println(l1 + " - Время сортировки 4-ого массива в побочном потоке");
        
    }

}
    
