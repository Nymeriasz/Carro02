package Carro2;

public class Audi extends Carro {
    private boolean bluetooth;

    public Audi(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
        this.bluetooth = false;
    }

    @Override
    public void acelerar() { System.out.println("O Audi acelerou."); }
    @Override
    public void frear() { System.out.println("O Audi freou."); }
    @Override
    public void buzinar() { System.out.println("O Audi buzinou."); }

    public void ligarBluetooth() {
        if (bluetooth) {
            System.out.println("Desligando o bluetooth...");
            this.bluetooth = false;
        } else {
            System.out.println("Ligando o bluetooth...");
            this.bluetooth = true;
        }
    }
}
