package hospital;

public class PacienteUTI extends Paciente {

    public String verificarInternacao() {
        if (this.calcularMedia() >= 8.0f) {
            return "Internado";
        } else {
            return "Alta";
        }
    }
}