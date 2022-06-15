public class Pessoa{
    private String nome;        //Atributos
    private String endereco;
    private String telefone;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }

    public void comer(){
        System.out.println("Estou comendo uma coxinha com massa de aipim ");
     
    }

}