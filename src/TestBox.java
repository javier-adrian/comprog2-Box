public class TestBox {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setHeight(10);
        box1.setWidth(10);
        box1.setLength(10);

        Box box2 = new Box(10, 10, 10);

        box1.printBoxInfo();
        box2.printBoxInfo();
    }
}