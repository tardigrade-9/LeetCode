class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascal.add(firstRow);
        List<Integer> prevRow;
        if(numRows>1){
            prevRow = new ArrayList<>();
            prevRow.add(1);
            prevRow.add(1);
        }else{
            return pascal;
        }

        pascal.add(prevRow);

        for(int i=3;i<=numRows;i++){
            List<Integer> cRow = new ArrayList<>();
            cRow.add(1);
            for(int j=1;j<i-1;j++){
                cRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            cRow.add(1);
            pascal.add(cRow);
            prevRow = cRow;
        }

        return pascal;
    }
}