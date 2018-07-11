package taskBoxOOP;

public class Box {
    private int height;
    private int width;

    public Box(int width) {
        this.height = width * 2;
        this.width = width;
    }

    public Box() { }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Box joinDiagonal(Box ... boxes){
        int widthSum = 0;

        for (Box box : boxes) {
            widthSum += box.getWidth();
        }
        return new Box(widthSum);
    }


    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
