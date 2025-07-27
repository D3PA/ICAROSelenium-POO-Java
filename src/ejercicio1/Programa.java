package ejercicio1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora calcu = new Calculadora();
        int contadorCerrar = 0;

        while (contadorCerrar < 5) {
            System.out.println("###########################################");
            System.out.println("ICARO - EJERCICIO 1 - RODRIGO MUÑOZ");
            System.out.println("###########################################");
            System.out.print("Ingrese primer numero: ");
            int numero1 = teclado.nextInt();
            System.out.print("Ingrese segundo numero: ");
            int numero2 = teclado.nextInt();
             System.out.println("Opciones:");
            System.out.println("(+) SUMA");
            System.out.println("(-) RESTA");
            System.out.println("(*) MULTIPLICACION");
            System.out.println("(/) DIVISION");
            System.out.print("Ingrese la operacion que desea realizar: ");
            String operacion = teclado.next();

            boolean operacionValida = true;
            int resultado = 0;

            switch (operacion) {
                case "+":
                    resultado = calcu.sumar(numero1, numero2);
                    break;
                case "-":
                    resultado = calcu.restar(numero1, numero2);
                    break;
                case "*":
                    resultado = calcu.multiplicar(numero1, numero2);
                    break;
                case "/":
                    try {
                        resultado = calcu.dividir(numero1, numero2);
                    } catch (ArithmeticException e) { // Ejercicio 2: Maneja la division por cero mostrando un mensaje de error
                        System.out.println("No se puede dividir por cero");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
                    operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("Resultado: " + resultado);
                if (resultado < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo!");
                } else if (resultado < 10000) {
                    System.out.println("Resultado dentro de los límites.");
                } else {
                    System.out.println("Error, resultado muy grande.");
                }
            }

            contadorCerrar++;
        }
        teclado.close();
    }
}
