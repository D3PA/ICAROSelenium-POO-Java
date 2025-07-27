package ejercicio3;

public class Espadachin extends Personaje {
    private int ataque;

    public Espadachin(int salud, int ataqueInicial) {
        super(salud);
        establecerAtaque(ataqueInicial);
    }

    public int obtenerAtaque() {
        return ataque;
    }

    public void establecerAtaque(int nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    public void entrenar() {
        logEntrenamiento();
        ataque += 10;
    }

    private void logEntrenamiento() {
        System.out.println("Entrenamiento del espadachin: ataque ahora es " + (ataque + 10));
    }

    public String toString() {
        return "Espadachin → " + super.toString() + " | Ataque: " + ataque;
    }
}
