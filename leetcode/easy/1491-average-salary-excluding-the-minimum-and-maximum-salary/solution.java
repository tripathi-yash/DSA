class Solution {
    public double average(int[] salary) {
        



 




                

            
        

    

    
        
    

        int minS = Integer.MAX_VALUE;
        int maxS = Integer.MIN_VALUE;

        double avg = 0, sum = 0;
        for(int i=0; i<salary.length; i++){
   
            sum += salary[i];
            if(minS > salary[i]) minS = Math.min(minS, salary[i]);
            if(maxS < salary[i]) maxS = Math.max(maxS, salary[i]);
        }

        avg = ( sum - minS - maxS) / (salary.length - 2);
 
       
        return avg;
    }
}