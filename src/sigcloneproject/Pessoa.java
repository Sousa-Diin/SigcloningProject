package sigcloneproject;
/**  @author wildes */
// CLASSE PROGENITORA
public abstract class Pessoa {
    
    //Especificação de {Reitor; Docente; Discente; Funcionario; Terceirizado ...}
    // Atributos 
    private String nome;
    private String nasc;
    private String sexo;
    private long cpf;
    private long rg;
    private long tel;
    private Endereco residencia;
    private String email;
    private String[] filiacao;

    public Pessoa(String nome, String nasc, String sexo, long cpf, long rg, long tel, Endereco residencia, String email, String[] filiacao) {
        this.nome = nome;
        this.nasc = nasc;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.residencia = residencia;
        this.email = email;
        this.filiacao = filiacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public Endereco getResidencia() {
        return residencia;
    }

    public void setResidencia(Endereco residencia) {
        this.residencia = residencia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String[] filiacao) {
        this.filiacao = filiacao;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", nasc=" + nasc + ", sexo=" + sexo + ", cpf=" + cpf + ", rg=" + rg + ", tel=" + tel + ", residencia=" + residencia + ", email=" + email + ", filiacao=" + filiacao + '}';
    }
    
    
    
}
