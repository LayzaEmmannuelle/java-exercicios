package aula1.controle;

public class Acesso {

    private String dtEntrada;
    private String dtSaida;
    private Pessoa pessoa;

    public Acesso(String dtEntrada, Pessoa pessoa) {
        this.dtEntrada = dtEntrada;
        this.pessoa = pessoa;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
