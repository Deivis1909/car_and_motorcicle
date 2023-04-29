public class Moto {

    public Moto(String modelo, double valorUnitario) {
        this.modelo = modelo;
        this.valor= valorUnitario;
    }

    private String modelo;
    private String cor;

    private String fabricante;
    private int ano;

   private boolean corrida;

   private int quilometragem;

   private double valor;


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(){

    }
    public void setCorrida(boolean corrida){
        this.corrida = corrida;

    }

    public boolean isCorrida() {

        return this.corrida;
    }
    public String getModelo(){
        return this.modelo;

    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getCor(){

        return this.cor;
    }

    public double getValor(){
        return this.valor;
    }
    public double setValor(double valor){

      return  this.valor = valor;
    }



}


