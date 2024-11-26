
public class Banco_simples {//construtor primário(padrão)
    //construtor secundário - Eu customizo como eu quiser
    private String titular;
    private float saldo;

    //construtor secundário
    public Banco_simples(String titular, float saldo){ //passando valores para ser trabalhados
        this.saldo = saldo;
        this.titular = titular;
    }
    private void ajustandoValor(float valor){
        saldo+=valor;
    }
    protected void depositar(float valor){
        if (valor >= 10000){
            System.out.println("Não foi possivel depositar esse valor");

        }else {
            System.out.println("Deposito realizado");
            ajustandoValor(valor);
        }
    }
    protected void sacar(float saque){
        if(saque > 50000){
            System.out.println("Não possivel fazer o saque acima de 50 mil reais");
        }else {
            if(saque > saldo){
                System.out.println("Não foi possivel efetuar o saque");
            }else if (saque == saldo){
                System.out.println("Sua conta está zerada");
            }else {
                System.out.println("Realizando saque");
                ajustandoValor(-saque);
            }
        }
    }
    protected void getSaldo(){
        System.out.println("\n"+titular);
        System.out.println("Seu saldo atual é de "+saldo);
    }
}
