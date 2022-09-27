/*
Rudrik Patel
COP2805 HW 4_1
02/19/2022
 */

import java.util.Random;
import java.util.Scanner;

public class hw4_1 {
    public static void main(String[] args){ //main class
        Scanner input = new Scanner(System.in); 
        
        //display the statement and store user input into the variables
        System.out.println("Enter the array size n: ");
        int mat = input.nextInt();
        
        //creating matrix array and assign user input as a array size
        int matrix[][] = new int[mat][mat];
        
        
        //random variable creating
        Random num = new Random(); 
        
        //for loop for creating matrix and filled 0 and 1 random number 
        for(int row = 0; row < mat; row++){
            for(int coloumn = 0; coloumn < mat; coloumn++){
                matrix[row][coloumn] = num.nextInt(2);
                System.out.print(matrix[row][coloumn] +"  "); //space
            }
            System.out.println(); //line break
        }
        
        // counting The largest row index:
        //creating array for store row numbers
        int[] largest_row = new int[mat];
        
        //variables for counting 
        int largest_r = 0;
        int count_row = 0;
        int counter_r= 0;
        
        //for loop for finding largest row index
        for(int r = 0; r < mat; r++){
            int count = 0;
            for(int c = 0; c < mat; c++){
                if(matrix[r][c] == 1){
                    count++;
                } 
            }
            
            if(count > count_row && count != 0){
                count_row = count;
                largest_r = r; //assign largest row index to largest_r variable
            }
            
        }
        
        //for loop creating for
        // storing in array if more row indexes that have same largest value 
        for(int j = largest_r +1; j < mat; j++){
            int count = 0;
            for(int c = 0; c < mat; c++){
                if(matrix[j][c] == 1){
                    count++;
                }
            }
            if(count == count_row){
                largest_row[counter_r] = j; //the row index number store in array
                counter_r++;
            }
        }
        // counting The largest row index:
        //creating array for store row numbers
        int[] largest_column = new int[mat];
        
        //creating variables
        int count_column = 0;
        int largest_c = 0;
        int counter_c = 0;
        
        
        //for loop for finding largest column index
        for(int c = 0; c < mat; c++){
            int count = 0;
            for(int r = 0; r < mat; r++){
                if(matrix[r][c] == 1){
                    count++;
                } 
            }
            
            if(count > count_column && count != 0){
                count_column = count;
                largest_c = c;
            }
            
        }
        
        //for loop creating for
        // storing in array if more column indexes that have same largest value 
        for(int c = largest_c + 1; c < mat; c++){
            int count = 0;
            for(int j = 0; j < mat; j++){
                
                
                if(matrix[j][c] == 1){
                count++;
                }
            }
            if(count == count_column){
                largest_column[counter_c] = c; //the column index number store in array
                counter_c++;
            }
        }
        
        
        
        
        //display the largest row index
        System.out.print("The largest row index: " +largest_r );
        //display the largest row indexes if it is more than one
        for(int i = 0; i < largest_row.length; i++){
            if(largest_row[i] != 0){
                System.out.print(", " +largest_row[i] ); //array display the index number
            }
        }
        System.out.println(); //break
        
        
        //display the largest column index
        System.out.print("The largest column index: " +largest_c );
        //display the largest column indexes if it is more than one
        for(int i = 0; i < largest_column.length; i++){
            if(largest_column[i] != 0){
                System.out.print(", " +largest_column[i] ); //array display the index number
            }
        }
        System.out.println();
    }
    
}
