import java.time.LocalDate;
import java.time.Period;

/**
 * Classe que representa uma nota fiscal 
 * Possui informações da compra, comprador, valor e status de pagamento.
 * 
 */
public class NotaFiscal {

    private String numero;
    private LocalDate data_compra;
    private float valor;
    private String nome_comprador, endereco_comprador, telefone_comprador, cpf_comprador;
    private boolean pagamento_realizado;
    private int qtd_dias;

    /**
     * Construtor padrão da classe NotaFiscal.
     */
    public NotaFiscal() {
    }

    /**
     * Construtor da classe NotaFiscal com parâmetros pré-definidos
     * 
     * @param numero Número da nota fiscal.
     * @param data_compra Data da compra.
     * @param valor Valor da nota.
     * @param nome_comprador Nome do comprador.
     * @param telefone_comprador Telefone do comprador.
     * @param cpf_comprador CPF do comprador.
     */
    public NotaFiscal(String numero, LocalDate data_compra, float valor, String nome_comprador,
            String telefone_comprador, String cpf_comprador) {
        this.numero = numero;
        this.data_compra = data_compra;
        this.valor = valor;
        this.nome_comprador = nome_comprador;
        this.telefone_comprador = telefone_comprador;
        this.cpf_comprador = cpf_comprador;
    }

    /**
     * Método que alcula o valor final com juros baseado nos dias de atraso desde a data da compra.
     * Aplica 0.95% de juros ao dia.
     * 
     * @param valor Valor original da nota.
     * @param data_compra Data da compra.
     * @return Valor total com os juros aplicados.
     */
    public float juros(float valor, LocalDate data_compra){

        LocalDate data_atual = LocalDate.now();
        Period periodo = Period.between(data_compra, data_atual);
        qtd_dias = periodo.getDays();

        for (int i = 0; i <= qtd_dias; i++) {
            valor = valor + ((0.95f * valor)/100);
        }

        return valor;
    }

     /**
     * Método que exibe todos os dados da nota fiscal, incluindo o status de pagamento e o valor total com juros.
     * 
     * @param nf Objeto da nota fiscal a ser visualizado.
     * @param juros Valor total com juros.
     */
    public void visualizar_nota(NotaFiscal nf, float juros){

        System.out.println("\n+-------------------------------------+");
        System.out.println("|             NOTA FISCAL             |");
        System.out.println("+-------------------------------------+");
        System.out.println(" Número " + nf.getNumero());
        System.out.println(" Data da compra : " + nf.getData_compra());

        System.out.println("\n COMPRADOR: \n Nome: " + nf.getNome_comprador());
        System.out.println(" Cpf: " + nf.getCpf_comprador());
        System.out.println(" Endereço: " + nf.getEndereco_comprador());
        System.out.println(" Telefone: " + nf.getTelefone_comprador());

        System.out.println("\n Valor subtotal: " + nf.getValor());

        if (nf.isPagamento_realizado() == true){
            System.out.println(" Status: Pago");
        }
        else {
            System.out.println("\n Status: Aguardando pagamento ");
            System.out.println("         Dias de atraso: " + qtd_dias);
        }

        System.out.println("\n TOTAL C/ JUROS: "+ juros);
        System.out.println("+-------------------------------------+\n\n");

    }
    
    /**
     * Retorna o numero da nota fiscal.
     * 
     * @return Número da nota fiscal.
     */
    public String getNumero() {
        return numero;
    }
    
    /**
     * Define o número da nota fiscal.
     * 
     * @param numero Número da nota.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Retorna a data da compra.
     * 
     * @return Data da compra.
     */
    public LocalDate getData_compra() {
        return data_compra;
    }

    /**
     * Define a data da compra.
     * 
     * @param data_compra Data da compra.
     */
    public void setData_compra(LocalDate data_compra) {
        this.data_compra = data_compra;
    }

    /**
     * Retorna o valor da nota fiscal.
     * 
     * @return Valor da nota fiscal.
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define o valor da nota fiscal.
     * 
     * @param valor Valor da nota.
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * Retorna o nome do comprador
     * 
     * @return Nome do comprador.
     */
    public String getNome_comprador() {
        return nome_comprador;
    }

    /**
     * Define o nome do comprador.
     * 
     * @param nome_comprador Nome do comprador.
     */
    public void setNome_comprador(String nome_comprador) {
        this.nome_comprador = nome_comprador;
    }

    /**
     * Retorna o endereço do comprador
     * 
     * @return Endereço do comprador.
     */
    public String getEndereco_comprador() {
        return endereco_comprador;
    }

    /**
     * Define o endereço do comprador.
     * 
     * @param endereco_comprador Endereço do comprador.
     */
    public void setEndereco_comprador(String endereco_comprador) {
        this.endereco_comprador = endereco_comprador;
    }

    /**
     * Retorna o número de telefone do comprador
     * 
     * @return Telefone do comprador.
     */
    public String getTelefone_comprador() {
        return telefone_comprador;
    }

    /**
     * Define o numero de telefone do comprador.
     * 
     * @param telefone_comprador Telefone do comprador.
     */
    public void setTelefone_comprador(String telefone_comprador) {
        this.telefone_comprador = telefone_comprador;
    }

    /**
     * Retorna o número de CPF do comprador
     * 
     * @return CPF do comprador.
     */
    public String getCpf_comprador() {
        return cpf_comprador;
    }

    /**
     * Define o CPF do comprador.
     * 
     * @param cpf_comprador CPF do comprador.
     */
    public void setCpf_comprador(String cpf_comprador) {
        this.cpf_comprador = cpf_comprador;
    }

    /**
     * Retorna o estado do pagamento: Realizado(true) ou não(false)
     * 
     * @return true se o pagamento foi realizado; false caso contrário.
     */
    public boolean isPagamento_realizado() {
        return pagamento_realizado;
    }

    /**
     * Define o status de pagamento.
     * 
     * @param pagamento_realizado true se pago ou false se pendente.
     */
    public void setPagamento_realizado(boolean pagamento_realizado) {
        this.pagamento_realizado = pagamento_realizado;
    }

    



    
}
