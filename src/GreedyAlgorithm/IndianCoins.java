package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};
        //Sort this coins array in descending order
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        int total = 590;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<coins.length; i++){
            if(coins[i] <= total){
                while(coins[i] <= total){
                    count++;
                    list.add(coins[i]);
                    total -= coins[i];
                }
            }
        }
        System.out.println("Min no of coins required is : "+count);
        System.out.print("The coins required are : ");
        for(int i = 0; i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
