/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Naveed
 */

class Stack{
    private int[] stackSize = new int [40];
    private int stackTop;
    
    public Stack(){
        stackTop = 0;
    };
    
    public boolean stackIsFull(){
        return false;
    };
    
    
    
}
public class LanguageStructuresAssignment1 {

    /**
     * @param args the command line arguments
     */
    private static Scanner fin; 
    
    private static void openFile(){
     try{
         fin = new Scanner(new File("hw33831data.txt"));
    }catch (Exception e){
        System.out.println("Error opening file.");
    }     
  }
    
  private int Counter = 1;
  private static char operator; //char operators are +, -, *, /
  private static int operand1, operand2;
  private int checkError;
    
    public static void main(String[] args) {
        // TODO code application logic here
       // openFile();
        Stack st = new Stack();
        
        //create a while loop as long as fin.Next is not 0
    }
    
}
