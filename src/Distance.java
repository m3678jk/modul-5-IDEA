import java.lang.*;
class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    Distance(int startX, int startY, int endX, int endY){
        this.endX = endX;
        this.startX = startX;
        this.endY = endY;
        this.startY = startY;

    }
//возвращает расстояние между точками, координаты которых переданы в конструктор.
// Расстояние округляется по правилам математического округления, возвращается целый результат.
    public int getDistance(){
        double n = Math.sqrt((endX  - startX )*(endX  - startX ) + (endY - startY)*(endY - startY));
        return (int) Math.round(n);
    }
}
class testDistance{
    public static void main (String [] args){
        new Distance(10, 10, 27, 25).getDistance();
        new Distance(10, 10, 20, 20).getDistance();
    }

}