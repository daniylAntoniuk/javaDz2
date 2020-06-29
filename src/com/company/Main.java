package com.company;

import java.util.*;

public class Main {
    private static int[] push(int[] array, int push) {
        int[] longer = new int[array.length + 1];
        for (int i = 0; i < array.length; i++)
            longer[i] = array[i];
        longer[array.length] = push;
        return longer;
    }
    public static void main(String[] args) {

        //1
//        int i=1;
//        while (i<100){
//            System.out.println(i);
//            i+=1;
//        }

        //2
        Scanner in = new Scanner(System.in);
        System.out.print("Factorial of: ");
        int num = in.nextInt();
        int [] arr = new int[0];
        int i=1;
        while (i<=num){

            arr= push(arr, i);
            i+=1;
        }
        int sum = 1;
        i=0;
        while (i<arr.length){
            sum*=arr[i];
            i+=1;
        }
        System.out.print("Factorial: "+sum);

    }
}

