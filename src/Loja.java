import java.util.ArrayList;

public class Loja {

    public Loja() {
        carros = new ArrayList<>();
        motos = new ArrayList<>();
    }

    private String nome;
    private String localizacao;



    ArrayList<Carro> carros = new ArrayList<>();
    ArrayList<Moto> motos = new ArrayList<>();


    // talvez tenha usar a list normal

    public ArrayList<Carro> getEstoqueCarros() {
        return carros;
    }


    public ArrayList<Moto> getEstoqueMotos(){
        return motos;
    }

    public String getNome(){
        return this.nome;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }


    // add carro no arraylist carro e moto no arraylist moto

    public void addCarro(String modelo,double valor){

        Carro car = new Carro(modelo,valor);
        // add parametro da funcao no arrayList carros
        carros.add(car);


    }
    public void addMoto(String modelo, double valor){
        Moto m = new Moto(modelo,valor);
        motos.add(m);

    }

    // deletar carro e moto dos arrayslists
    public void removeMoto(){
        motos.remove(1);
    }
    public void removeCarro(){
        carros.remove(1);

    }

    void getTotalEstoque(){

    }
    public double calcularValorTotalCarros() {
        double valorTotal = 0;
        for (Carro carro : carros) {
            valorTotal += carro.getValor();
        }
        return valorTotal;
    }

    public double calcularValorTotalMotos(){
        double valorTotal = 0;
        for (Moto moto: motos){
            valorTotal += moto.getValor();
        }
        return valorTotal;
    }

    public double calcularValorTotal() {
        return calcularValorTotalCarros() + calcularValorTotalMotos();
    }

    

}
