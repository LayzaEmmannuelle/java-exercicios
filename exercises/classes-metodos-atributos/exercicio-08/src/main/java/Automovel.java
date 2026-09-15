/**
 * Classe que representa um automovel.
 * Possui marca, modelo, ano de fabricação, ano do modelo, cor e quilometragem.
 * 
 */
public class Automovel {
    
    private String marca;
    private String modelo;
    private int ano_fabricacao;
    private int ano_modelo;
    private String cor;
    private float km = 0;

    /**
     * Construtor da classe Automovel com marca, modelo e ano de fabricação.
     * 
     * @param marca Marca do automóvel
     * @param modelo Modelo do automóvel
     * @param ano_fabricacao Ano de fabricação do automóvel
     */
    public Automovel(String marca, String modelo, int ano_fabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
    }

    /**
     * Construtor da classe Automovel com marca, modelo, ano de fabricação, ano do modelo, cor e 
     * quilometragem.
     * 
     * @param marca Marca do automóvel
     * @param modelo Modelo do automóvel
     * @param ano_fabricacao Ano de fabricação do automóvel
     * @param ano_modelo Ano do modelo do automóvel
     * @param cor Cor do automóvel
     * @param km Quilometragem do automóvel
     */
    public Automovel (String marca, String modelo, int ano_fabricacao, int ano_modelo, String cor, float km){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.ano_modelo = ano_modelo;
        this.cor = cor;
        this.km = km;
    }

    /**
     * Retorna a marca do automóvel.
     * 
     * @return Marca do automóvel
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Define a marca do automóvel.
     * 
     * @param marca Marca do automóvel
     */
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * Retorna o modelo do automóvel.
     * 
     * @return Modelo do automóvel
     */
    public String getModelo(){
        return modelo;
    }

    /**
     * Define o modelo do automóvel.
     * 
     * @param modelo Modelo do automóvel
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Retorna a ano de fabricação do automóvel.
     * 
     * @return Ano de fabricação do automóvel
     */
    public int getAno_fabricacao(){
        return ano_fabricacao;
    }

    /**
     * Define o ano de fabricação do automóvel.
     * 
     * @param ano_fabricaçao Ano de fabricação do automóvel
     */
    public void setAno_fabricacao(int ano_fabricacao){
        this.ano_fabricacao = ano_fabricacao;
    }

    /**
     * Retorna o ano do modelo do automóvel.
     * 
     * @return Ano do modelo do automóvel
     */
    public int getAno_modelo(){
        return ano_modelo;
    }

    /**
     * Define o ano do modelo do automóvel.
     * 
     * @param ano_modelo Ano do modelo do automóvel
     */
    public void setAno_modelo(int ano_modelo){
        this.ano_modelo = ano_modelo;
    }

    /**
     * Retorna a cor do automóvel.
     * 
     * @return Cor do automóvel
     */
    public String getCor(){
        return cor;
    }

    /**
     * Define a cor do automóvel.
     * 
     * @param cor Cor do automóvel
     */
    public void setCor(String cor){
        this.cor = cor;
    }

    /**
     * Retorna a quilometragem do automóvel.
     * 
     * @return Quilometragem do automóvel
     */
    public Float getKm(){
        return km;
    }

    /**
     * Define a quilometragem do automóvel.
     * 
     * @param km Quilometragem do automóvel
     */
    public void setKm(Float km){
        this.km = km;
    }


    /**
     * Método para aumentar a quilometragem do automóvel.
     * 
     * @param km Valor a ser aumentado na quilometragem do automóvel
     */
    public void AddKm(float km){
        this.km += km;
    }

    /**
     * Retorna a quilometragem total do automóvel.
     * 
     * @return Quilometragem total do automóvel
     */
    public float KmTotal(){
        return this.km;
    }

    /**
     * Método que define a velocidade média do automóvel.
     * 
     * @param distperco Distância percorrida em quilômetros
     * @param tempomin Período de tempo em que a distância foi percorrida em minutos
     * @return Velocidade média do automóvel
     */
    public float VelMedia(float distperco, float tempomin){
        float vm = distperco/tempomin;
        return vm;
    }

    /**
     * Método que simula a aceleração do automóvel.
     * 
     * @param marcacarro Marca do carro
     */
    public void Acelerar(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " acelerou");
    }

    /**
     * Método que simula a frenagem do automóvel.
     * 
     * @param marcacarro Marca do carro
     */
    public void Frear(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " freiou");
    }

    /**
     * Método que simula uma curva para a direita com o automóvel.
     * 
     * @param marcacarro Marca do carro
     */
    public void Direita(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " se moveu para direita");
    }

    /**
     * Método que simula uma curva para a esquerda com o automóvel.
     * 
     * @param marcacarro Marca do carro
     */
    public void Esquerda(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " se moveu para esquerda");
    }
 
}
