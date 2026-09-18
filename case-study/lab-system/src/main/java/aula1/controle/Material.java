package aula1.controle;

public class Material {
    private String cod;
    private String desc;
    private String nome;
    private String tipo;
    private String prevManu;
    private String status;
    
    public Material(String cod, String nome, String tipo) {
        this.cod = cod;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrevManu() {
        return prevManu;
    }

    public void setPrevManu(String prevManu) {
        this.prevManu = prevManu;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
