package sigcloneproject;

/** @author wildes  */
public class  Endereco {
    
    // who has an address -> Pessoa or immobile
    // Atributos
    private String pais;
    private String estado;
    private String municipio;
    private String bairro;
    private String longradouro;
    private int numero;

    public Endereco(String pais, String estado, String municipio, String bairro, String longradouro, int numero) {
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.bairro = bairro;
        this.longradouro = longradouro;
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    private void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    private void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLongradouro() {
        return longradouro;
    }

    private void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "pais=" + pais + ", estado=" + estado + 
                ", municipio=" + municipio + ", bairro=" + bairro + 
                ", longradouro=" + longradouro + ", numero=" + numero + '}';
    }
    
   
    
}
