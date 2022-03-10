package com.company;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        String arr[][]=new String[a][2];

        System.out.println("enter elements");
        int j=0;
        int i;
        for( i = 0; i<a; i++)
        {
            for( j = 0; j<2; j++)
            {
                if(j==0){
                    System.out.println("person"+i);
                }
                arr[i][j]=sc.next();

            }
        }

        System.out.println("enter name");
        String b= sc.next();
        j=0;
        for(i=0; i<a; i++) {
            if(arr[i][j].equals(b)){
                System.out.print(arr[i][j]+" ");
                j=j+1;
                System.out.println(arr[i][j]);
                break;
            }else if(i==a) {
                System.out.println("person does not exist");

            }

        }

    }

}
