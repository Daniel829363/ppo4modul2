/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab3;

/**
 *
 * @author Acer
 */
public class Program {
   
    public static void main(String[] args) {
           
        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
    }
}

