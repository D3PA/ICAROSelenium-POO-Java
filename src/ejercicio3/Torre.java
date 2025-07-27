package ejercicio3;

public class Torre extends Personaje {
    private int nivel;

    public Torre(int salud, int nivelInicial) {
        super(salud);
        asignarNivel(nivelInicial);
    }

    public int nivelActual() {
        return nivel;
    }

    public void asignarNivel(int nuevoNivel) {
        this.nivel = nuevoNivel;
    }

    public void entrenar() {
        System.out.println("La torre sube de nivel: " + nivel + " -> " + (nivel + 1));
        nivel++;
    }

    public String toString() {
        return "Torre -> " + super.toString() + " | Nivel: " + nivel;
    }
}
