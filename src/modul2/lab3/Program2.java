/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab3;

import java.util.Scanner;
 
public class Program2 {
   
    public static void main(String[] args) {
           
        int population = 10000000;
        int born = 14;
        int death = 8;
        for(int i = 1; i <= 10; i++){
            if (born > 7) born -= 1;
            if  (death > 6) death -=1;
            population += population * (born - death) / 1000;
        }
        System.out.println(population);
    }
}

