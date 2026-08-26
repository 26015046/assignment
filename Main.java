/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author adivh
 */
/*Name :Vele Adivhaho
*student number :26015046
*Module :Com1321
*Assignment :1
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("BRIGHT FUTURE TECHNOLOGIES APPLICATION");
        System.out.println("**************************************");
        while (true) {
        System.out.println("");
        System.out.print("Enter (1) to launch menu or any other key to exit ");
        String value = input.nextLine();
        System.out.println("");
        if("1".equals(value.trim())){
            int menuSelection = Products.DisplayMenu();
            switch(menuSelection){
                case 1: Products.CaptureProduct();
                    break;
                case 2: Products.SearchProduct();
                    break;
                case 3: Products.UpdateProduct();
                    break;
                case 4: Products.DeleteProduct();
                    break;
                case 5: Products.PrintProductReport();
                    break;
                case 6: Products.ExitApplication();
                    break;
            }
        }
        else{  
            Products.ExitApplication();
        } 
            
        }
    
    }
    
}

    
