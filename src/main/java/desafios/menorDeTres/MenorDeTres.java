package desafios.menorDeTres;

public class MenorDeTres {
    private int num1;
    private int num2;
    private int num3;

    public MenorDeTres(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int menor() {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
