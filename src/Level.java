import java.util.Arrays;
import java.util.Objects;

class Level {
    private LevelInfo levelInfo;
    private Point[] points;


    public Level(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    public int calculateLevelHash() {
        int mySum = 0;
        int i = 0;
        while (i < points.length) {
            mySum = mySum + points[i].getX() *points[i].getY();
            i++;
           // System.out.println(mySum);
        }  return mySum;
    }






    static class LevelInfo{
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty){

            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }
    @Override
    public String toString() {



        String s = "Quarke level, name is " + levelInfo.name + ", difficulty is " + levelInfo.difficulty + ", point count is " + points.length;
        return s;
    }


    static class Point{
        private int x,y;

        public int getY() {
            return y;
        }

        public int getX() {
            return x;
        }
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}


class LevelTest {
    public static void main(String[] args) {
        Level.Point p1 = new Level.Point(3, 5);
        Level.Point p2 = new Level.Point(10, 100);
        Level.Point p3 = new Level.Point(50, 40);

        Level.Point[] points = {p1, p2, p3};

        Level.LevelInfo info = new Level.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level(info, points).calculateLevelHash());
    }
}