class Solution {
    public int hIndex(int[] citations) {
        int hindex = 0;
        ArrayList<Integer> potential_hindex = new ArrayList<>();
        //start yaha se 1*
        for(int i=0;i < citations.length;i++){
            
            boolean result=check(citations,citations[i]);
            if (result==true){
                potential_hindex.add(citations[i]);
            }
        }
        //if the hindex is not one of the citation number
        for(int i = 0; i <= citations.length; i++) {
            boolean result = check(citations, i);
            if (result == true) {
                potential_hindex.add(i);
            }
        }


        // finding max value from the potential_hindex array  3*
        if(potential_hindex.isEmpty()) { return 0; }

        int max = potential_hindex.get(0);  // Assume the first element is the largest initially
        for (int i = 1; i < potential_hindex.size(); i++) {
            if (potential_hindex.get(i) > max) {
                max = potential_hindex.get(i);  // Update max if a larger element is found
            }
        }
        return max;     
    }
    //2*
    public boolean check(int[] citations,int number){
        int count=0;
        for(int i=0;i < citations.length;i++){
            if(number <= citations[i]){
                count++;
            }
        
        } 
        if (count>=number){
            return true;
        }
        else{return false;}   
    }
}