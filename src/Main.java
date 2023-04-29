public class Main {

    public static void main(String[] args) {
        Loja l1 = new Loja();
        l1.addCarro("fusca",7500.00);
        l1.addCarro("bmw",140000.00);
        l1.addMoto("honda",5600.00);
        l1.addMoto("harley deyvson",22700);
        double totalCarros = l1.calcularValorTotalCarros();
        double totalMotos = l1.calcularValorTotalMotos();
        double valorTotal = l1.calcularValorTotal();
        System.out.println("o valor total das carros e : "+totalCarros);
        System.out.println("o valor total das motos e:"+totalMotos);
        System.out.println("o valor total é : "+valorTotal);
    }
}