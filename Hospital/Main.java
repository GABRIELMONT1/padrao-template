package hospital;

public class Main {
    public static void main(String[] args) {

        PacienteUTI pacUTI = new PacienteUTI();
        pacUTI.setProntuario(1);
        pacUTI.setNome("Joao");
        pacUTI.setExame1(8.0f);
        pacUTI.setExame2(9.0f);
        System.out.println(pacUTI.getInfo());

        PacienteEnfermaria pacEnf = new PacienteEnfermaria();
        pacEnf.setProntuario(2);
        pacEnf.setNome("Maria");
        pacEnf.setExame1(6.0f);
        pacEnf.setExame2(7.0f);
        System.out.println(pacEnf.getInfo());
    }
}