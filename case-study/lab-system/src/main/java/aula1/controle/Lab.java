package aula1.controle;

import java.util.ArrayList;

public class Lab {

    private String cod;
    private String desc;
    private String area;

    // VSCode pode dar um alerta devido a inferência redundante. Manter o decorator abaixo:
    @SuppressWarnings("Convert2Diamond")
    private ArrayList<Material> materiais = new ArrayList<Material>();

    public Lab(String cod, String desc, String area) {
        this.cod = cod;
        this.desc = desc;
        this.area = area;
    }

    public ArrayList<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(ArrayList<Material> materiais) {
        this.materiais = materiais;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
