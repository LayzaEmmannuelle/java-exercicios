/**
 * Classe que representa uma conta corrente.
 * Possui saldo, numero, cliente, limite, situacao.
 * 
 */
public class ContaCorrente {

    private float saldo;
    private int numero;
    private String cliente;
    private float limite;
    private boolean situacao;

    /**
     * Construtor da classe ContaCorrente com saldo, número, cliente, limite e situação.
     * 
     * @param saldo Saldo da conta
     * @param numero Número da conta
     * @param cliente Nome do cliente
     * @param limite Valor do limite
     * @param situacao Tipo de situação da conta (ativa ou inativa)
     */
    public ContaCorrente(Float saldo, int numero, String cliente, float limite, boolean situacao){
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
        this.situacao = situacao;
    }

    /**
     * Método para fazer o levantamento da conta para realizar um saque.
     * 
     * @param saque Valor do saque desejado
     */
    public void levantar(float saque){
        if (this.situacao == true) {
            if (saque <= this.saldo){
                this.saldo = this.saldo - saque;
                System.out.println("\nSaque de " +saque+ " reais!\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
            }
            else if(saque <= limite) {
                this.limite = this.limite - saque;
                System.out.println("\nVocê nao possui saldo suficiente, o saque será feito no limite! ");
                System.out.println("\nSaque de " +saque+ " reais!\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
            }
            else {
                System.out.println("\nVocê nao possui saldo e nem limite suficiente!");
                System.out.println("\nTRANSAÇAO CANCELADA");
                System.out.println("\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
            }
        }
        else {
            System.out.println(" Conta inativa! ");
        }
    }

    /**
     * Método que simula um depósito na conta
     * 
     * @param deposito Valor do depósito
     */
    public void depositar(float deposito){
        if (this.situacao == true) {
            this.saldo = this.saldo + deposito;
            System.out.println("\nValor depositado: "+ deposito+"\nSaldo atual: "+this.saldo+"\nLimite atual: "+ this.limite);
        }
        else {
            System.out.println(" Conta inativa! ");
        }
    }

    /**
     * Método que simula uma transferência de valores entre contas
     * 
     * @param valor Valor a ser transferido
     * @param saldo Saldo atual da conta do remetente
     * @param nome Nome do destinatário
     * @param numero Número da conta do destinatário
     * @param situacao Situação da conta do destinatário (ativa ou inativa)
     * @return
     */
    public float transferir (float valor, float saldo, String nome, int numero, boolean situacao){
        if ((this.situacao == true) && (situacao == true)) {
            if (valor <= this.saldo){
                this.saldo = this.saldo - valor;
                saldo = saldo + valor;
                System.out.println("\nTranferência de " +valor+ " reais, para "+nome+", Número da conta: "+numero+"\nSeu saldo atual: "+ this.saldo+"\nSeu limite atual: "+ this.limite);
                return saldo;
            }
            else if(valor <= limite) {
                this.limite = this.limite - valor;
                saldo = saldo + valor;
                System.out.println("\nVocê nao possui saldo suficiente, o saque será feito no limite! ");
                System.out.println("\nTranferência de " +valor+ " reais, para "+nome+", Número da conta: "+numero+"\nSeu saldo atual: "+ this.saldo+"\nSeu limite atual: "+ this.limite);
                return saldo;
            }
            else {
                System.out.println("\nVocê nao possui saldo e nem limite suficiente!");
                System.out.println("\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
                return saldo;
            }
        }
        else {
            System.out.println(" Conta inativa! ");
            return saldo;
        }
    }

    /**
     * Define um saldo para a conta corrente
     * 
     * @param saldo Saldo da conta
     */
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    /**
     * Retorna o valor do saldo da conta corrente
     * 
     * @return Valor do saldo da conta
     */
    public float getSaldo(){
        return saldo;
    }

    /**
     * Define um numero para a conta corrente
     * 
     * @param numero Número da conta
     */
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    /**
     * Retorna o numero da conta corrente
     * 
     * @return Número da conta
     */
    public int getNumero(){
        return numero;
    }

    /**
     * Define um nome para o cliente da conta corrente
     * 
     * @param cliente Nome do cliente da conta
     */
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    /**
     * Retorna o nome do cliente da conta corrente
     * 
     * @return Nome do cliente da conta
     */
    public String getCliente(){
        return cliente;
    }

    /**
     * Define um limite para a conta corrente
     * 
     * @param limite Limite da conta
     */
    public void setLimite(float limite){
        this.limite= limite;
    }
    
    /**
     * Retorna um limite para a conta corrente
     * 
     * @return Limite da conta
     */
    public float getLimite(){
        return limite;
    }

    /**
     * Define a situação da conta corrente
     * 
     * @param situacao
     */
    public void setSituacao(boolean situacao){
        this.situacao = situacao;
    }
    
    /**
     * Retorna a situação da conta corrente 
     * 
     * @return Situação da conta corrente
     */
    public boolean getSituacao(){
        return situacao;
    }
    
}
