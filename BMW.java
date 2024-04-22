package Carro2;

public class BMW extends Carro{
    private boolean piscaAlerta;

    public BMW(String marca, String modelo, String cor) {
        super(marca, modelo, cor);
        this.piscaAlerta = false;
    }
    
    @Override
    public void acelerar() { System.out.println("A BMW acelerou."); }
    @Override
    public void frear() { System.out.println("A BMW freou."); }
    @Override
    public void buzinar() { System.out.println("A BMW buzinou."); }

    public void ligarPiscaAlerta() {
        if (piscaAlerta) {
            System.out.println("Desligando o pisca-alerta...");
            this.piscaAlerta = false;
        } else {
            System.out.println("Ligando o pisca-alerta...");
            this.piscaAlerta = true;
        }
    }
}
