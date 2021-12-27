import java.util.Arrays;
import java.util.Comparator;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {-26, 11};
        int[][] targets = {
                {-26, 41},
                {-26, 60},
                {-26, 19},
                {-26, 25},
                {-26, 35},


        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}


class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {

        int[][] result = new int[targets.length][3];
        for (int i = 0; i < targets.length; i++)
            for (int j = 0; j < targets[i].length; j++)
                result[i][j] = targets[i][j];
        //System.arraycopy(targets, 0, result,0,targets.length);
        int[] dest = new int[targets.length];

        // i -  line,  (j) - column (only 2 columns
        // find distance between points
        int distance = 0;
        double n = 0;
        for (int k = 0; k < targets.length; k++) {

            n = Math.sqrt((targets[k][0] - aiCoords[0]) * (targets[k][0] - aiCoords[0]) + (targets[k][1] - aiCoords[1]) * (targets[k][1] - aiCoords[1]));
            distance = (int) Math.round(n);
            System.out.println(n);
            System.out.println(distance);
            result[k][2] = distance;
            System.out.println(Arrays.deepToString(result));
        }
        Arrays.sort(result, Comparator.comparingInt(o -> o[2]));

        System.out.println(Arrays.deepToString(result));
        int[] result1 = new int [2];
        System.arraycopy(result[0], 0, result1, 0 , 2);
//            for(int [] res : result){
//                if (res [] > min){
//                    min = res[];
        System.out.println(Arrays.toString( result1));
        return result1;
    }
            }





