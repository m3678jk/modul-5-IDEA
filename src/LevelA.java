class LevelA {
    private int width;
    private int height;

    public LevelA(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
class LevelTooBigException extends Exception{
    LevelTooBigException (){
        super();
    }
}
class LevelALoader {
    public void load(LevelA level) throws LevelTooBigException {
        if (level.getWidth() * level.getHeight() >= 100000 ){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}

class LevelALoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelALoader().load(new LevelA(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelALoader().load(new LevelA(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}