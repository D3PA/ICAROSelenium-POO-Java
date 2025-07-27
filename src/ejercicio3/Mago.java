package ejercicio3;

public class Mago extends Personaje {
    private String magia;

    public Mago(int salud, String magiaInicial) {
        super(salud);
        definirMagia(magiaInicial);
    }

    public String consultarMagia() {
        return magia;
    }

    public void definirMagia(String nuevaMagia) {
        this.magia = nuevaMagia;
    }

    public void entrenar() {
        System.out.println("Al mago no le gusta entrenar, es muy vago! jaja");
    }
    
    public String toString() {
        return "Mago -> " + super.toString() + " | Magia: " + magia;
    }
}
