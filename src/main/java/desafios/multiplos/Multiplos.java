package desafios.multiplos;

public class Multiplos {
    private int num1;
    private int num2;

    public Multiplos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean saoMultiplos() {
        if (num2 != 0 && num1 % num2 == 0) {
            return true;
        }
        if (num1 != 0 && num2 % num1 == 0) {
            return true;
        }
        return false;
    }

}
