package ejercicio3;

public abstract class Personaje {
    private int salud;

    public Personaje(int salud) {
        actualizarSalud(salud);
    }

    public int obtenerSalud() {
        return salud;
    }

    public void actualizarSalud(int nuevaSalud) {
        this.salud = Math.max(0, nuevaSalud);
    }

    public abstract void entrenar();

    public String toString() {
        return "Salud actual: " + salud;
    }
}


