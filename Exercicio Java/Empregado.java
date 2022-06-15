public class Empregado extends Pessoa{
    private int codSetor;
    protected double salarioBase;
    private double imposto;


    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public int getCodSetor() {
        return codSetor;
    }
    public void setCodSetor(int codSetor) {
        this.codSetor = codSetor;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public void setImposto(double imposto){
        this.imposto = imposto;
    }
    public double getImposto(){
        return this.imposto;
    }
                                            //métodos
    public double calcularSalario(){       //fazendo o calculo do sálario base - imposto
        return this.salarioBase - (this.salarioBase * this.imposto);
    }

    public void comer(){
        System.out.println("Estou comendo um bolo de cenoura ");
    }
}