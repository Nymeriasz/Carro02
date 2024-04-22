package Carro2;
public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi("Audi", "A4", "Preto Brilhante");
        BMW bmw = new BMW("BMW", "Serie 3", "Azul Portimão Metálico");

        audi.acelerar();
        bmw.acelerar();
        System.out.println();
        audi.buzinar();
        bmw.buzinar();
        System.out.println();

        audi.ligarBluetooth();
        audi.ligarBluetooth();
        System.out.println();
        bmw.ligarPiscaAlerta();
        bmw.ligarPiscaAlerta();
    }
}
