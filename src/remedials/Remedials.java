/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package remedials;

/**
 *
 * @author Almodad
 */
import java.util.Scanner;
public class Remedials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name: ");
        while(in.hasNext()){            
            name = in.nextLine();
            System.out.println("Enter you age (years): ");
            age = in.nextInt();
            
            System.out.print("My name is "+name+
                    ". I am "+age+" years old.\n");           
        }       
    }
    
}
