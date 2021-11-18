/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort_thread;

import java.util.Arrays;

/**
 *
 * @author Асхат
 */
public class Sort_Thread {

    
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
    
    static Sec_Sort_Thread objST;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        objST = new Sec_Sort_Thread ();
        
        int [] mas1;
        int [] mas2;
        int [] mas3;
        
        mas1 = mas2 = new int [10000];
        mas3 = new int [10000];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = ((int)(Math.random() * 100));
        }
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = ((int)(Math.random() * 100));
        }
        
        long m = System.currentTimeMillis();
        BubbleSort (mas1);
        System.out.println("Первый массив: " + Arrays.toString(mas1));
        double m1 = (double)(System.currentTimeMillis() - m);
        System.out.println(m1 + " - Время сортировки 1-ого массива в главном потоке");
        
        long n = System.currentTimeMillis();
        BubbleSort (mas3);
        System.out.println("Третий массив: " + Arrays.toString(mas3));
        double n1 = (double)(System.currentTimeMillis() - n);
        System.out.println(n1 + " - Время сортировки 3-его массива в главном потоке");
        
        System.out.println(Math.abs(m1-n1) + " - Разница во времени сортировок 1-ого и 3-его массивов в основном потоке");
        
        //long l = System.currentTimeMillis();
        objST.start();
        long k = System.currentTimeMillis();
        BubbleSort (mas2);
        System.out.println("Второй массив: " + Arrays.toString(mas2));
        double k1 = (double)(System.currentTimeMillis() - k);
        System.out.println(k1 + " - Время сортировки 2-oго массива в главном потоке");
       // double l1 = (double)(System.currentTimeMillis() - l);
        //System.out.println(Math.abs(l1-k1) + " - Разница во времени сортировок 2-ого массива в основном потоке и 4-oго массива в побочном потоке");
    }
}