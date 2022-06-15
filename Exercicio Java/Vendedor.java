public class Vendedor extends Empregado{    
    private double valorVenda;              //atributos
    private double comissao;

    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    public double getValorVenda(){
        return this.valorVenda;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    public double getComissao(){
        return this.comissao;
    }                                                   //métodos
    public double finalSalario(){
        return this.salarioBase = this.salarioBase + ( this.comissao * this.valorVenda);       //Fazendo calculo da comissão, salario e venda
    }
}
