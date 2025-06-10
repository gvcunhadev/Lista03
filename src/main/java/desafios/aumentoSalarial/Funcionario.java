package desafios.aumentoSalarial;

public class Funcionario {
    private float salario;

    public Funcionario(float salario) {
        this.salario = salario;
    }

    public float aumentoSalarial() {
        if (salario < 1000) {
            return salario * 0.2f;
        } else if (salario < 2000) {
            return salario * 0.15f;
        } else if (salario < 3000) {
            return salario * 0.1f;
        } else {
            return salario * 0.05f;
        }
    }

}
