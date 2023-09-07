/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsshowroom;
import java.util.*;

public class Employees extends Showroom implements utility {
    
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;
    
    
    public void get(){
        System.out.println("ID:  "+emp_id);
        System.out.println("Name:  "+emp_name);
        System.out.println("Age:  "+emp_age);
        System.out.println("Department:  "+emp_department);
        System.out.println("Showroom Name:  "+showroom_name);
    }
    
    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("********************  *** ENTER EMPLOYEE DETAILS *** ********************");
        System.out.println();
        System.out.println("EMPLOYEE ID:  ");
        emp_id = sc.nextLine();
        System.out.println("EMPLOYEE NAME:  ");
        emp_name = sc.nextLine();
        System.out.println("EMPLOYEE AGE:  ");
        emp_age = sc.nextInt();
        System.out.println("EMPLOYEE DEPARTMENT");
        emp_department = sc.nextLine();
        System.out.println("NAME OF SHOWROOM");
        showroom_name = sc.nextLine();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
