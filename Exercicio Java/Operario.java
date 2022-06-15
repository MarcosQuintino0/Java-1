public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;
    
    public void setValorProducao(double valorProducao){
        this.valorProducao = valorProducao;
    }
    public double getValorProducao(){
        return this.valorProducao;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    public double getComissao(){
        return this.comissao;
    }
    public double totalSalario(){
        return this.salarioBase = this.salarioBase + ( this.comissao * this.valorProducao);
    }

}