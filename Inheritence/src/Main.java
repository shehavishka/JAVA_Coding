public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MBike mBike1 = new MBike(4,40,22.4);

        mBike1.stop();
        mBike1.go();
    }
}