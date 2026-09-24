import java.util.ArrayList;

/**
 * Classe que representa um quarto.
 * Possui controle de lampada, controle de abajur, controle de ar-condicionado, controle de tv e lista/controle de ventiladores.
 * 
 */
public class Quarto {

    private boolean lampada;
    private boolean abajur;
    private boolean arcondicionado;
    private boolean tv;
    private ArrayList<Ventilador> ventiladores;

    /**
     * Construtor padrão da classe Quarto
     * 
     */
    public Quarto() {
        this.ventiladores = new ArrayList<Ventilador>();
    }

    /**
     * Método que representa o interruptor de uma lâmpada.
     * Leva em consideração se ela está desligada.
     */
    public void ligarLampada(){
        if (lampada == false){
            System.out.println("\nlâmpada ligada!");
            lampada = true;
        }
        else {
            System.out.println("\nlâmpada já está ligada!");
        }
    }

    /**
     * Método que representa o interruptor de uma lâmpada.
     * Leva em consideração se ela está ligada.
     */
    public void desligarLampada(){
        if (lampada == true){
            System.out.println("\nlâmpada desligada!");
            lampada = false;
        }
        else {
            System.out.println("\nlâmpada já está desligada!");
        }
    }

    /**
     * Método que representa o interruptor de um abajur.
     * Leva em consideração se ele está desligado.
     */
    public void ligarAbajur(){
        if (abajur == false){
            System.out.println("\nabajur ligado!");
            abajur = true;
        }
        else {
            System.out.println("\nabajur já está ligado!");
        }
    }

    /**
     * Método que representa o interruptor de um abajur.
     * Leva em consideração se ele está ligado.
     */
    public void desligarAbajur(){
        if (abajur == true){
            System.out.println("\nabajur desligado!");
            abajur = false;
        }
        else {
            System.out.println("\nabajur já está desligado!");
        }
    }

    /**
     * Método que representa o controle de um ar-condicionado.
     * Leva em consideração se ele está desligado.
     */
    public void ligarArcondicionado(){
        if (arcondicionado == false){
            System.out.println("\nar-condicionado ligado!");
            arcondicionado = true;
        }
        else {
            System.out.println("\nar-condicionado já está ligado!");
        }
    }

    /**
     * Método que representa o controle de um ar-condicionado.
     * Leva em consideração se ele está ligado.
     */
    public void desligarArcondicionado(){
        if (arcondicionado == true){
            System.out.println("\nar-condicionado desligado!");
            arcondicionado = false;
        }
        else {
            System.out.println("\nar-condicionado já está desligado!");
        }
    }

    /**
     * Método que representa o controle de uma TV.
     * Leva em consideração se ela está desligada.
     */
    public void ligarTv(){
        if (tv == false){
            System.out.println("\nTelevisao ligada!");
            tv = true;
        }
        else {
            System.out.println("\nTelevisao já está ligada!");
        }
    }

    /**
     * Método que representa o controle de uma TV.
     * Leva em consideração se ela está ligada.
     */
    public void desligarTv(){
        if (tv == true){
            System.out.println("\nTelevisao desligada!");
            tv = false;
        }
        else {
            System.out.println("\nTelevisao já está desligada!");
        }
    }

    /**
     * Método que representa o controle de uma TV.
     * Leva em consideração se ela está ligada.
     */
    public void mudarCanalTv(String nomecanal){
        if (tv == true){
            System.out.println("\nAssistindo ao canal " + nomecanal);
        }
        else {
            System.out.println("\nTelevisao está desligada!");
        }
    }

    /**
     * Método que representa o controle de uma TV.
     * Leva em consideração se ela está ligada.
     */
    public void mudarSinalTv(Source source){
        if (tv == true) {
            if (source == Source.IE){
                System.out.println("\nEntrada de sinal alterada para I.E!" );
            }
            else if (source == Source.USB){
                System.out.println("\nEntrada de sinal alterada para USB!" );
            }
            else if (source == Source.HDMI){
                System.out.println("\nEntrada de sinal alterada para HDMI!" );
            }
        }
        else {
            System.out.println("\nA televisao está desligada!");
        } 
    }  

    /**
     * Método que representa o controle de um ventilador.
     * Leva em consideração se ele está desligado.
     */
    public boolean ligarVentilador(boolean status){
        if (status == false){
            System.out.println("\nVentilador ligado!");
            return true;
        }
        else {
            System.out.println("\nVentilador já está ligado!");
            return true;
        }
    }

    /**
     * Método que representa o controle de um ventilador.
     * Leva em consideração se ele está desligado.
     */
    public boolean desligarVentilador(boolean status){
        if (status == true){
            System.out.println("\nVentilador desligado!");
            return false;
        }
        else {
            System.out.println("\nVentilador já está desligado!");
            return false;
        }
    }

    /**
     * Retorna o objeto lampada
     * 
     * @return Lampada
     */
    public boolean isLampada() {
        return lampada;
    }

    /**
     * Define uma lampada
     * 
     * @param lampada Lampada
     */
    public void setLampada(boolean lampada) {
        this.lampada = lampada;
    }

    /**
     * Retorna o objeto abajur
     * 
     * @return abajur
     */
    public boolean isAbajur() {
        return abajur;
    }

    /**
     * Define uma abajur
     * 
     * @param abajur abajur
     */
    public void setAbajur(boolean abajur) {
        this.abajur = abajur;
    }

    /**
     * Retorna o objeto ar-condicionado
     * 
     * @return ar-condicionado
     */
    public boolean isArcondicionado() {
        return arcondicionado;
    }

    /**
     * Define uma ar-condicionado
     * 
     * @param arcondicionado ar-condicionado
     */
    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    /**
     * Retorna o objeto tv
     * 
     * @return tv
     */
    public boolean isTv() {
        return tv;
    }

    /**
     * Define uma tv
     * 
     * @param tv tv
     */
    public void setTv(boolean tv) {
        this.tv = tv;
    }

    /**
     * Retorna uma lista de ventiladores
     * 
     * @return Lista de ventiladores
     */
    public ArrayList<Ventilador> getVentiladores() {
        return ventiladores;
    }

    /**
     * Define uma lista de ventiladores
     * 
     * @param ventiladores Lista de ventiladores
     */
    public void setVentiladores(ArrayList<Ventilador> ventiladores) {
        this.ventiladores = ventiladores;
    }
    
}
