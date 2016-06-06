package examenfinalparte2;

import javax.swing.JOptionPane;

public class Principal {

//esta variable es la que si dice :-si el numero es par no lo muestro , pero si es impar , sí
    public static boolean mostrarPrimos = false;

    public static void main(String arg[]) {
        // no tiene lógica que inicializemos a 2 la variable int dig = 2;
       int digito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de digitos correcto (mayor que 0): "));;
        int numDigitos = 0;
        //el usuario debe introducir un valor mayor que 0
        if (digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        CondicionesParaQueSeaPrimo(digito);
    }
//introduzco en un metodo el bucle
    private static void CondicionesParaQueSeaPrimo(int digito) {
        int numDigitos;
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            numDigitos = contador;

            if (numDigitos == digito) {
                if (i < 4) {
                    mostrarPrimos = true;
                } else {
                    //esta condición es bastante importante ya que si el numero al dividirlo entre 2 da 0 de resto , este no se mostrara
                    if (i % 2 == 0) {
                        mostrarPrimos = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            mostrarPrimos = true;
                        }
                    }
                }

                if (mostrarPrimos == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
