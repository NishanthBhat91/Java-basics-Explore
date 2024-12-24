package com.linearsearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("1. One Dimentional Array");
            System.out.print("Select Operation : ");
            int input = sc.nextInt();

            if (input == 1){
                OneDimentionalArray prog = new OneDimentionalArray(sc);
                prog.run();
            }
            else{
                System.out.println("Invalid input!");
            }
        }
        finally{
            sc.close();
        }
    }
}