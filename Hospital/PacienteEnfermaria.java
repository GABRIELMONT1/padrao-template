package hospital;

public class PacienteEnfermaria extends Paciente {

    public String verificarInternacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Internado";
        } else {
            return "Alta";
        }
    }

    @Override
    public String getTipo() {
        return "PacienteGrave";
    }
}