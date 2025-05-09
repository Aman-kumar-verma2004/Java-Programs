package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10,20,30};
        int[] value = {60,100,120};
        int Weight = 50;
        double[][] ratio = new double[weight.length][2];
        for(int i = 0; i< weight.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)value[i]/weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // Ascending Order
        double totalValue = 0;
        int capacity = Weight;
        for(int i = ratio.length-1; i>= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                totalValue += value[idx];
                capacity -= weight[idx];
            }else{
                totalValue += (capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value is :" + totalValue);
    }
}
