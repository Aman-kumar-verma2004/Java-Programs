package GreedyAlgorithm;
import java.util.ArrayList;
import java.util.Collections;
public class JobSequncingMethod {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
        //Kyuki kereko uss Job ke baare me info chahiye
    }
    public static void main(String[] args) {
        int[][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();// Job type ka ak array create kr lia
        //Stores the value inside jobs
        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
        // Sort in descending order;
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i =0; i< jobsInfo.length; i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        //Print the sequence
        System.out.println("No of job can be done : "+ seq.size());
        for(int i = 0; i< seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
