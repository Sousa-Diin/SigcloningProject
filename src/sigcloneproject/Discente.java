package sigcloneproject;
/** @author wildes  */
public class Discente extends Pessoa {
    private String matricula;
    private String curso;
    private CriaLogin cadastrarLogin;
    private AutenticacaoDoSistema meuLogin;

    public Discente(String curso, CriaLogin cadastrarLogin, AutenticacaoDoSistema meuLogin, String nome, String nasc, String sexo, long cpf, long rg, long tel, Endereco residencia, String email, String[] filiacao) {
        super(nome, nasc, sexo, cpf, rg, tel, residencia, email, filiacao);
        matricula = "202011046";
        this.curso = curso;
        this.cadastrarLogin = cadastrarLogin;
        this.meuLogin = meuLogin;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public CriaLogin getCadastrarLogin() {
        return cadastrarLogin;
    }

    public void setCadastrarLogin(CriaLogin cadastrarLogin) {
        this.cadastrarLogin = cadastrarLogin;
    }

    public AutenticacaoDoSistema getMeuLogin() {
        return meuLogin;
    }

    public void setMeuLogin(AutenticacaoDoSistema meuLogin) {
        this.meuLogin = meuLogin;
    }
    
    
    
    
}
