public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(11, 0, 10, 7);

        bus1.drive();
        bus1.conditionChange();
        bus1.ride();
        bus1.speedChange();

    }
}