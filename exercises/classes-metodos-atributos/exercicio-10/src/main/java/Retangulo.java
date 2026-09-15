/**
 * Classe que representa um retangulo.
 * Possui valor da base e altura.
 * 
 */
public class Retangulo {

    private float base;
    private float altura;

    /**
     * Construtor da classe Retangulo com base e altura.
     * 
     * @param base Valor da base
     * @param altura Valor da altura
     */
    public Retangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula o valor do perímetro do retângulo.
     * 
     * @param base Valor da base
     * @param altura Valor da altura
     * @return Valor do peímetro
     */
    public float perimetro(float base, float altura){
        float p = 2 * (base + altura);
        return p;
    }

    /**
     * Método que calcula o valor da área do retângulo.
     * 
     * @param base Valor da base
     * @param altura Valor da altura
     * @return Valor da área
     */
    public float area(float base, float altura){
        float a = base * altura;
        return a;
    }

    /**
     * Define o valor da base do retângulo.
     * 
     * @param base Valor da base do retângulo.
     */
    public void setRetangulo(float base){
        this.base = base;
    }

    /**
     * Retorna o valor da base do retângulo.
     * 
     * @return Valor da base do retângulo.
     */
    public float getBase(){
        return base;
    }

    /**
     * Define o valor da altura do retângulo.
     * 
     * @param altura Valor da altura do retângulo.
     */
    public void SetRetangulo(float altura){
        this.altura = altura;
    }

    /**
     * Retorna o valor da altura do retângulo.
     * 
     * @return Valor da altura do retângulo.
     */
    public float getAltura(){
        return altura;
    }
}
