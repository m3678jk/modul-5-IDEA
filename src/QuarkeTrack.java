import java.util.Arrays;
import java.util.Objects;

class QuarkeTrack {
    private int[] lines;

    public QuarkeTrack(int[] lines){
        this.lines = lines;
    }




    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof QuarkeTrack)) {
            return false;
        }

        QuarkeTrack another = (QuarkeTrack) o;

        int mySum = 0;
        int i = 0;
        while ( i < lines.length){
            mySum += lines[i];
                    i++;
            System.out.println(mySum);
        }
        int anotherSum = 0;

        int k = 0;
        while (k <  another.lines.length){
            anotherSum += another.lines[k];
            k++;
        }


        return mySum == anotherSum;
    }

    @Override
    public int hashCode() {
        int mySum = 0;
        int i = 0;
        while (i < lines.length){
            mySum += lines[i];
            i++;
        }
        return Objects.hash(mySum);
    }

}






class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {67};
        int[] track2Data = {35, 23, 4, 2, 3};
        //int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
       // QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
       // System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
      //  System.out.println(track1.hashCode() == track3.hashCode());
    }
}
