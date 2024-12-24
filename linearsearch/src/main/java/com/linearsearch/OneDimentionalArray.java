package com.linearsearch;

import java.util.Scanner;;

public class OneDimentionalArray {
    private Scanner sc;
    OneDimentionalArray(Scanner sca){
        sc = sca;
    }

    public void run(){
        int size = 0, searchItem = 0, found = 0;
        int[] array; 
        
        //get size
        System.out.print("Size : ");
        size = sc.nextInt();

        if(size == 0){
            System.out.println("Invalid Array!");
            return;
        }

        //Initialize array and take input
        array = new int[size];
        System.out.println("Enter items in separate lines :");

        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        //get search item 
        System.out.print("Enter element to search for : ");
        searchItem = sc.nextInt();

        //Search for the item
        for (int i = 0; i < size; i++){
            if (array[i] == searchItem){
                found = i + 1;
                break;
            }
        }

        if(found > 0){
            System.out.println("\nItem found at location - " + found);
        }
        else{
            System.out.println("\nItem not found in array.");
        }
    }
}
