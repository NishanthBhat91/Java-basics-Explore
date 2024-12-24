package com.linearsearch;

import java.util.Scanner;

public class TwoDimentionalArray {
    private Scanner sc;

    TwoDimentionalArray(Scanner sca){
        sc = sca;
    }

    public void run(){
        int row = 0, col = 0, searchItem = 0, foundRow = 0, foundCol = 0;
        int[][] array; 
        
        //get matrix size
        System.out.print("Row size : ");
        row = sc.nextInt();
        System.out.print("Column size : ");
        col = sc.nextInt();

        if(row <= 0 || col <= 0){
            System.out.println("Invalid size!");
            return;
        }

        //Initialize array and take input
        array = new int[row][col];
        System.out.println("\nEnter items in separate lines :");

        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                array[i][j] = sc.nextInt();
            }
        }

        //Display array in format
        System.out.println("\nInput matrix of dimention " +  row + "x" + col + " is :");
        
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //get search item 
        System.out.print("\nEnter element to search for : ");
        searchItem = sc.nextInt();

        //Search for the item
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (array[i][j] == searchItem){
                    foundRow = i + 1;
                    foundCol = j + 1;
                    break;
                }

                if(foundRow > 0){
                    break;
                }
            }
        }

        if (foundRow > 0){
            System.out.println("\nItem found at row - " + foundRow + " and column - " + foundCol);
        }
        else{
            System.out.println("Item not found in matrix.");
        }
        System.out.println();
    }
}
