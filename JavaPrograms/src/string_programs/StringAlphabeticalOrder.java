/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_programs;

import java.util.Scanner;

/**
 *
 * @author chamathw
 */
public class StringAlphabeticalOrder {
    
    
    public static void main(String[] args) {
        
        int count;
        String temp;
        
        System.out.println("Enter String count");
        
        Scanner sc = new Scanner(System.in);
        
        count = sc.nextInt();
        
        
        String[] str = new String[count];
        
        System.out.println("Enter All Strings");
        
        Scanner sc1 = new Scanner(System.in);
        
        
        for(int i = 0; i<str.length;i++){
        
            str[i] = sc1.nextLine();
            
        }
        
        
        sc.close();
        sc1.close();
        
        
        
        //-----------sorting string-------------------
        
        
        for (int i = 0; i < str.length; i++) {
            
            for(int j = i+1;j<str.length;j++){
            
                if(str[i].compareTo(str[j])>0){
                
                    temp = str[i];
                    
                    str[i] = str[j];
                    
                    str[j] = temp;
                
                }
                
                
            }
            
        }
        
        System.out.println(" ---------------------------------- ");
        //---------display string----------
        
        for(int i = 0; i < str.length;i++){
        
            System.out.println(str[i]);
            
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
