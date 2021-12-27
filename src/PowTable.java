import java.util.Arrays;

class PowTable {
    public static final int[] POWERS_2;

    static {
        POWERS_2 = new int[10];
       int [] pow1 = new int [11];
        int i = 0;
        for (i = 0; i < pow1.length; i++) {
            pow1[i] = i * i;
                System.out.println(pow1[i]);
            }
        System.arraycopy(pow1, 1, POWERS_2, 0, 10);
        }
        }


class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}