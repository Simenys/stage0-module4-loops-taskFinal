package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int answer = numberToPrint;
        for (int i = 1; i < power; i++) {
            answer *= numberToPrint;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
