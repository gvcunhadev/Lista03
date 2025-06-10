package desafios.medidorGlicose;

public class MedidorGlicose {
    private float medida;

    public MedidorGlicose(float medida) {
        this.medida = medida;
    }

    public String classificar() {
        if (medida <= 100.0) {
            return "normal";
        } else if (medida <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}
