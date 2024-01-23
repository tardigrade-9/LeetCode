class Solution {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        for(int i=1;i< intervals.length;i++){
            if(intervals[i][0]<=current[1]){
                current[1] = Math.max(intervals[i][1],current[1]);
            }else{
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[0][]);
    }
}