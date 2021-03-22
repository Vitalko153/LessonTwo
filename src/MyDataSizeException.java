public class MyDataSizeException extends NumberFormatException{

    private int x;
    private int y;


    public MyDataSizeException(String s, int x, int y) {
        super(s);
        this.x = x;
        this.y = y;
    }
}
