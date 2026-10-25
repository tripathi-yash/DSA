class Solution {

    private boolean isselfDividing(int num){
        
        int temp = num;

        while(temp != 0){

            int lstDig = temp % 10;
            if(lstDig == 0 || num % lstDig != 0) return false;
            temp /= 10;
        }

        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ansNumbers = new ArrayList<>();

        for(int i=left; i<=right; i++){

            if(isselfDividing(i)) ansNumbers.add(i);
        }

        return ansNumbers;
    }
}