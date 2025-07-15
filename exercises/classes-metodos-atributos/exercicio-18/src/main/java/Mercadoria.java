import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe que representa uma mercadoria.
 * Possui nome, valor, valor com juros, validade e fornecedor
 * 
 */
public class Mercadoria {

    private String nome;
    private float valor;
    private float valor_c_juros;
    private LocalDate validade;
    private Fornecedor fornecedor;

    private static int qtd_itens_total = 0;
    private float valor_total = 0;

    /**
     * Construtor padrão da classe Mercadoria.
     */
    public Mercadoria() {
    }
    
    /**
     * Construtor da classe Mercadoria com nome, valor, validade e fornecedor.
     * Também verifica se o produto está dentro da validade.
     * 
     * @param nome Nome da mercadoria
     * @param valor Valor da mercadoria
     * @param validade Validade da mercadoria
     * @param fornecedor Fornecedor da mercadoria
     */
    public Mercadoria(String nome, float valor, LocalDate validade, Fornecedor fornecedor) {

        LocalDate hoje = LocalDate.now();

        if (hoje.compareTo(validade) <= 0){

            this.nome = nome;
            this.valor = valor;

            this.valor_c_juros = valor + ((30*valor)/100);

            this.validade = validade;
            this.fornecedor = fornecedor;

            System.out.println("O item " + nome + " foi adicionado no carrinho com sucesso!\n");

            qtd_itens_total++;
        }
        else {
            System.out.println("\nERRO! \nO item " + nome + " passou da validade!\n");
        }
    }

    /**
    * Método que imprime a quantidade total de mercadorias.
    */
    public void qtd_itens_total(){
        System.out.println("\n QUANTIDADE DE PRODUTOS: " + getQtd_itens_total());
    }

    /**
     * Método que calcula o valor total de uma mercadoria de acordo com sua quantidade.
     * 
     * @param valor Valor unitário da mercadoria
     * @param qtd Quantidade de mercadorias 
     */
    public void calc_valor_total(float valor, int qtd){
        this.valor_total = this.valor_total + (valor*qtd);
    }

    /**
     * Método que imprime o valor total da mercadoria.
     */
    public void valor_total(){
        System.out.println(" VALOR TOTAL: " + this.valor_total);
        System.out.println("+-------------------------------+\n\n");
        
    }

    /**
     * Método que imprime a quantidade de mercadorias por produto
     * 
     * @param mercadoria Lista de produtos
     */
    public void qtd_por_produto(ArrayList<Mercadoria> mercadoria){

        System.out.println("+-------------------------------+");
        System.out.println("|           CARRINHO            |");
        System.out.println("+-------------------------------+");

        Set<String> produtosVisitados = new HashSet<>(); // Conjunto para armazenar produtos já visitados

        for (int i = 0; i < mercadoria.size(); i++) {

            String nome = mercadoria.get(i).getNome();
            float valor = mercadoria.get(i).getValor();
            String fornecedor = mercadoria.get(i).getFornecedor().getNome();

            if (!produtosVisitados.contains(nome + fornecedor)) {
                int tam = 0;

                for (Mercadoria produto : mercadoria) {

                    if (produto.getNome().equals(nome) && produto.getFornecedor().getNome().equals(fornecedor)) {
                        tam++;
                    }

                }

                System.out.println(" "+ nome + "     -  " + tam + "x");
                calc_valor_total( valor, tam);

                produtosVisitados.add(nome + fornecedor); // Adiciona o produto ao conjunto de produtos visitados
            }
        }
    }

    /**
     * Retorna o nome da mercadoria
     * 
     * @return Nome da mercadoria
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da mercadoria
     * 
     * @param nome Nome da mercadoria
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o valor da mercadoria
     * 
     * @return valor da mercadoria
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define o valor da mercadoria
     * 
     * @param valor valor da mercadoria
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * Retorna o valor com juros da mercadoria
     * 
     * @return valor com juros da mercadoria
     */
    public float getValor_c_juros() {
        return valor_c_juros;
    }

    /**
     * Define o valor com juros da mercadoria
     * 
     * @param valor_c_juros valor com juros da mercadoria
     */
    public void setValor_c_juros(float valor_c_juros) {
        this.valor_c_juros = valor_c_juros;
    }

    /**
     * Retorna a validade da mercadoria
     * 
     * @return Validade da mercadoria
     */
    public LocalDate getValidade() {
        return validade;
    }

    /**
     * Define a validade da mercadoria
     * 
     * @param validade validade da mercadoria
     */
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    /**
     * Retorna o fornecedor da mercadoria
     * 
     * @return Fornecedor da mercadoria
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * Define o fornecedor da mercadoria
     * 
     * @param fornecedor fornecedor da mercadoria
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * Retorna a quantidade total de mercadorias.
     * 
     * @return Quantidade total de mercadorias
     */
    public static int getQtd_itens_total() {
        return qtd_itens_total;
    }
    
}


