public class Main {

    public static void main(String[] args) {

        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100 || r == 90 || r == 95) {
                System.out.println("Выпало число " + r + ", давайте на этом закончим");
                break;
            }
        }
    }
}
