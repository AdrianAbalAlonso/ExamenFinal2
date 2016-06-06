package examenfinalparte2;

public class Principal {

//esta variable es la que si dice :-si el numero es par no lo muestro , pero si es impar , sí
    public static boolean mostrarPrimos = false;

    public static void main(String arg[]) {
        int dig = 2;
        int ndig = 0;
        //si el numero es 0 o menor que 0 , el usuario debera introducir un valor valido
        if (dig <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        CondicionesParaQueSeaPrimo(dig);
    }

    private static void CondicionesParaQueSeaPrimo(int dig) {
        int ndig;
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            ndig = contador;

            if (ndig == dig) {
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
