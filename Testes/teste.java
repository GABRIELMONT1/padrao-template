package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacienteUTITeste {

    @Test
    void deveRetornarInternado() {
        PacienteUTI paciente = new PacienteUTI();
        paciente.setExame1(8.0f);
        paciente.setExame2(8.0f);
        assertEquals("Internado", paciente.verificarInternacao());
    }

    @Test
    void deveRetornarAlta() {
        PacienteUTI paciente = new PacienteUTI();
        paciente.setExame1(8.0f);
        paciente.setExame2(7.9f);
        assertEquals("Alta", paciente.verificarInternacao());
    }

    @Test
    void deveRetornarInformacoes() {
        PacienteUTI paciente = new PacienteUTI();
        paciente.setExame1(8.0f);
        paciente.setExame2(7.9f);
        paciente.setNome("Joao");
        paciente.setProntuario(1);
        assertEquals("Paciente{prontuario=1, nome='Joao', resultado=Alta}", paciente.getInfo());
    }
}