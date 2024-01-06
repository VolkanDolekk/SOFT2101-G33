/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soft2101.g33;

import java.util.Scanner;
/**
 *
 * @author vlknd
 */
public class SOFT2101G33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        
        if(num1 < num2){
            for(int i = num1 + 1; i < num2; i++){
                if (i % 2 == 0){
                System.out.print(i + " ");
            }
            }
        } else if(num2 < num1){
            for(int i = num2 + 1; i < num1; i++){
                    if (i % 2 == 0){
                System.out.print(i + " ");
            }
            }
        } else{
            System.out.println("The numbers are equal!");
        }
    }
    
}
