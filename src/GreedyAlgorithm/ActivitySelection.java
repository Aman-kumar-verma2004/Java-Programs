package GreedyAlgorithm;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int maxAct = 0;

        ArrayList<Integer> arr = new ArrayList<>(); // for storing the activity index
        maxAct = 1;
        arr.add(0);
        int lastEnd = end[0];
        for(int i = 1; i< end.length; i++){
            if(start[i] >= lastEnd){
                maxAct++;
                arr.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max Activities are : "+maxAct);
        for(int i = 0; i< arr.size(); i++){
            System.out.print("A"+arr.get(i)+" ");
        }
        System.out.println();
    }
}
