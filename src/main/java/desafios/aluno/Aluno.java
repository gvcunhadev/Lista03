package desafios.aluno;

public class Aluno {

    private float nota1;
    private float nota2;

    public Aluno(float nota1, float nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public float notaFinal() {
        return nota1 + nota2;
    }
}
