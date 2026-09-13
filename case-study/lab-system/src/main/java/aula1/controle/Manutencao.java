package aula1.controle;

public class Manutencao {

    private String dtManutencao;
    private String os;
    private String desc;
    private String tipo;

    public Manutencao(String os, String tipo, String desc, String dtManutencao) {
        this.os = os;
        this.desc = desc;
        this.tipo = tipo;
        this.dtManutencao = dtManutencao;
    }

    public String getDtManutencao() {
        return dtManutencao;
    }

    public void setDtManutencao(String dtManutencao) {
        this.dtManutencao = dtManutencao;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
