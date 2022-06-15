public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }
    public double getValorCredito(){
        return this.valorCredito;
    }

    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    public double getValorDivida(){
        return this.valorDivida;
    }

    public double obterSaldo(){                         //fazendo o calculo do crédito - divida.
        return (this.valorCredito - this.valorDivida);      
    }
    
    public void comer(){
        System.out.println("Estou comendo um rosca ");
    }
}