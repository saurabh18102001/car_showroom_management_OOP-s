/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsshowroom;
import java.util.*;


public class Cars extends Showroom implements utility {
    
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;
    
    public void get(){
        System.out.println("CAR NAME:  "+car_name);
        System.out.println("COLOR:  "+car_color);
        System.out.println("FUEL TYPE:  "+car_fuel_type);
        System.out.println("PRICE:  "+car_price);
        System.out.println("CAR TYPE"+car_type);
        System.out.println("TRANSMISSION"+car_transmission);
        
    }
    
    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********************  *** ENTER SHOWROOM DETAILS *** ********************");
        System.out.println();
        System.out.println("CAR NAME:  ");
        car_name = sc.nextLine();
        System.out.println("CAR COLOR:  ");
        car_color = sc.nextLine();
        System.out.println("CAR FUEL TYPE:  ");
        car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE:  ");
        car_price = sc.nextInt();
        System.out.println("CAR TYPE:  ");
        car_type = sc.nextLine();
        System.out.println("CAR TRANSMISSION:  ");
        car_transmission = sc.nextLine();
        total_cars_stock++;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
