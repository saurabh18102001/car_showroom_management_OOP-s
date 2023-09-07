/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsshowroom;
import java.util.*;

/**
 *
 * @author Saurabh Pal
 */


interface utility{
    
    public void get();
    
    public void set();
}

public class Main {

    static void main_menu(){
        System.out.println();
        System.out.println("********************  *** WELCOME TO SHOWROOM MANAGEMENT *** ********************");
        System.out.println();
        System.out.println("********************  *** ENTER YOUR CHOICE *** ********************");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEE \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEE  \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("********************  *** ENTER 0 TO EXIT *** ********************");
        
        

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employees emp[] = new Employees[5];                     //array size is 5
        Showroom shr[] = new Showroom[5];                       //array size is 5
        Cars car[] = new Cars[5];                               //array size is 5
        
        int car_counter=0;
        int employee_counter=0;
        int showroom_counter=0;
        int choice=100;
        
        while(choice!=0){
            main_menu();
            choice = sc.nextInt();
            
            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        shr[showroom_counter] = new Showroom();                //shr[0] = new Showroom();
                        shr[showroom_counter].set();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                        
                    case 2:
                        emp[employee_counter] = new Employees();                //emp[0] = new Employees();
                        emp[employee_counter].set();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW EMPLOYEES");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                        
                    case 3:
                        car[car_counter] = new Cars();                //car[0] = new Cars();
                        car[car_counter].set();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW CARS");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                        
                    case 4:
                        for(int i=0;i<showroom_counter;i++){
                            shr[i].get();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                        
                    case 5:
                        for(int i=0;i<employee_counter;i++){
                            emp[i].get();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                        
                    case 6:
                        for(int i=0;i<car_counter;i++){
                            car[i].get();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                        
                    default:
                        System.out.println("ENTER VALID CHOICE!!");
                        
                }
            }
        }
        
    }
    
}
