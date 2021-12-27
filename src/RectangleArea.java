class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    private int[] coords;
    public RectangleArea(int[] coords){
        this.coords = coords;
    }

    public int getArea(){
        return (coords[2] - coords[0])* (coords[3] - coords[1]);
    }
}