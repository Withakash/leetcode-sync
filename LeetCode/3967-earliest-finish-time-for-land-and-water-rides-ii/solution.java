class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;

        int minLandFinish = Integer.MAX_VALUE;
        int minWaterFinish = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            minLandFinish = Math.min(minLandFinish, landStartTime[i]+landDuration[i]);
        }

        int landToWater = Integer.MAX_VALUE;

        for(int i=0; i<m; i++){
            int finishTime = Math.max(minLandFinish, waterStartTime[i]) + waterDuration[i];
            landToWater = Math.min(landToWater, finishTime);
        }

        for(int i=0; i<m; i++){
            minWaterFinish = Math.min(minWaterFinish, waterStartTime[i]+waterDuration[i]);
        }

        int waterToLand = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int finishTime = Math.max(minWaterFinish, landStartTime[i]) + landDuration[i];
            waterToLand = Math.min(waterToLand, finishTime);
        }

        return Math.min(landToWater, waterToLand);
    }
}
