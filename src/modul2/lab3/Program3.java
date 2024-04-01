/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab3;

import java.util.Scanner;
 
public class Program3 {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = in.nextInt();
 
        for(int i = 1; i <= period; i++){
            sum += sum * 0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);
    }
}

