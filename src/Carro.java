public class Carro {

    public Carro(String modelo, double valorUnitario) {
        this.modelo = modelo;
        this.valor = valorUnitario;
    }
    private String modelo;
    private String fabricante;
    private String cor;

    private int ano;

    private int quilometragem;

    private double valor;

    public String getModelo(){
        return this.modelo;
    }
    public String getFabricante(){

        return this.fabricante;
    }
    public String getCor(){
        return this.cor;
    }

    public int getAno(){
        return this.ano;

    }
    public int getQuilometragem(){
        return this.quilometragem;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){

        return this.valor;
    }

}


