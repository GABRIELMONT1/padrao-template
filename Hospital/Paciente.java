package hospital;

public abstract class Paciente {

    private int prontuario;
    protected String nome;
    private float exame1;
    private float exame2;

    public int getProntuario() { return prontuario; }
    public void setProntuario(int prontuario) { this.prontuario = prontuario; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getExame1() { return exame1; }
    public void setExame1(float exame1) { this.exame1 = exame1; }

    public float getExame2() { return exame2; }
    public void setExame2(float exame2) { this.exame2 = exame2; }

    public float calcularMedia() {
        return (this.exame1 + this.exame2) / 2;
    }

    public abstract String verificarInternacao();

    public String getTipo() {
        return "Paciente";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "prontuario=" + this.prontuario +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarInternacao() +
                '}';
    }
}