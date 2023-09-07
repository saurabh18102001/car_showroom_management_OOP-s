/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsshowroom;
import java.util.Scanner;

public class Showroom implements utility{                //implementing from Main.java
    
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_stock=0;
    String manager_name;
    
    public void get(){
        System.out.println("Showroom Name:  "+showroom_name);
        System.out.println("Showroom Adress:  "+showroom_address);
        System.out.println("Manager Name:  "+manager_name);
        System.out.println("Total car in stock:  "+total_cars_stock);
        System.out.println("Total number of Employees:  "+total_employees);
    }

    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********************  *** ENTER SHOWROOM DETAILS *** ********************");
        System.out.println();
        System.out.println("SHOWROOM NAME:  ");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS:  ");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME:  ");
        manager_name = sc.nextLine();
        System.out.println("TOTAL CAR IN STOCK:  ");
        total_cars_stock = sc.nextInt();
        System.out.println("TOTAL NUMBER OF EMPLOYEE:  ");
        total_employees = sc.nextInt();
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
