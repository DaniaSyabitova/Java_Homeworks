/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;


public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pascal triangle");
System.out.println(" ");

int [][] p = new int [10][10];
p [0][0] = 1;
p [0][1] = p [0][0];
p [1][1] = p [0][0];
for (int j=0; j<10; ++j) {
for (int i=0; i<=j; ++i) {
if (i<j && i>0) {
p[i][j]=p[i][j-1]+p[i-1][j-1];
} else {
p[i][j]=1;
}
System.out. print(p[i][j] + " ");
}
System.out. println(" ");
}



}

    }
    

