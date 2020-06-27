/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandler;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author antonio crapps
 */
public class ExceptionHandler {

   
   public static int quotient(int numerator,int denominator)
     throws ArithmeticException
   {
    return numerator/denominator;
   }
     
    public static void main(String[] args) 
    {
    //Scanner object instantiation
    Scanner sc = new Scanner(System.in);
    
    int[]numbers = new int[10];
    //variables to hold the data
    int i;//lowest number
    int k;//subscript or index number
    int inputNumber;
   
    double totalSum = 0;//sum of the 10 numbers
    double divisionResults ;//stores the division results
   
    // message that lets the user know how to exit the program
    System.out.println("You can exit the program at any time by typing '9999'.");
    for(k=0;k<numbers.length;k++)//loop that goes through each number
    {
        
    System.out.println("Please enter number"+ (k+1)+":");
    inputNumber = sc.nextInt();//stores input integer into one-dimensional array
    //if statement if the user inputs 9999
    if(inputNumber == 9999)
    {
        System.out.println("you decided to terminate the program; exiting the program now!\n");
        System.exit(0);//terminates or exits the program
    }
    //index number equals inputNumber
    numbers[k]=inputNumber;
    //Displays the input number
    System.out.println("Number entered is" + inputNumber + ":");
    //sum of all numbers added to or equal to the index number
    totalSum += numbers[k];
    //total of all numbers
    System.out.println("All the numbers totalSum is: " + totalSum + ".");
    
    }
   try {
       
        System.out.println("Please enter a different number");
        
        }
        catch(ArithmeticException e) {
        System.err.println("ArithmeticException " + e.getMessage());
      
        
        } catch(IndexOutOfBoundsException e) {
         System.err.println("IndexOutofBoundsException " + e.getMessage());
        }
        catch(InputMismatchException e) {
        System.err.println("InputMismatchException " + e.getMessage());
        }
         finally
        {
        System.out.println("Zero cannot be used"); 
        } 
    for (i=0; i< numbers.length - 1; i++ )
    {  //if statement conditions for the loop  
       if(numbers[i]>=numbers[i=1])
       {
        
        
        divisionResults= numbers[i]/numbers[i+1];
        System.out.println("Dividend number " + numbers[i] + "; + the divisor number"
        + numbers[i+1]+ "and the division results is: " + String.format("%.3f",divisionResults)+
        ".\n");
       }
         
       else
       {  
           //dividing the larger value by the smaller value
           divisionResults = numbers[i+1]/numbers[i];
           System.out.println("Dividend number " + numbers[i+1] + "; + the divisor number"
           + numbers[i] + "and the division results is: " + String.format("%.3f",divisionResults) +
            ".\n");
         
       }
       
      
    
    
    
    
    
    
    
    
    
       
     }
    
    }
    
}
