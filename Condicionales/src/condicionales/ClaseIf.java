package condicionales;

import java.util.Objects;

public class ClaseIf {

    public ClaseIf() {
        //Constructor de la clase condicional if.
    }
    Integer n1 = 0, n2 = 0, n3 = 0;//inicializacion de variables

    public void setIgual(int v1, int v2) {
        /*creacion del metodo setIgual el cual Comparara si 
        dos valores son iguales o no.
         */
        this.n1 = v1;
        this.n2 = v2;
        if (Objects.equals(n1, n2)) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son distintos");
        }
    }

    public void setMenor(int v1, int v2) {
        /*Creacion del metodo setMenor que servira para ver
        cual numero es menor entre 2 valores ingresados por el usuario.
         */
        this.n1 = v1;
        this.n2 = v2;
        if (n1 < n2) {
            System.out.println("El numero menor es: " + n1);
        } else {
            System.out.println("El numero menor es: " + n2);
        }
    }

    public void setMayor(int v1, int v2) {
        /*Creacion del metodo setMenor que servira para ver
        cual numero es menor entre 2 valores ingresados por el usuario.
         */
        this.n1 = v1;
        this.n2 = v2;
        if (n1 > n2) {
            System.out.println("El numero mayor es: " + n1);
        } else {
            System.out.println("El numero mayor es: " + n2);
        }
    }

    public void setRaiz(int v1, int v2) {
        this.n1 = v1;
        this.n2 = v2;
        System.out.println("La raiz cuadrada de " + n1 + "es: " + Math.sqrt(n1));
        System.out.println("La raiz cuadrada de " + n2 + "es: " + Math.sqrt(n2));
    }

    public void setSuma(int v1, int v2) {
        this.n1 = v1;
        this.n2 = v2;
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }

    public void setResta(int v1, int v2) {
        this.n1 = v1;
        this.n2 = v2;
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    }

    public void setMul(int v1, int v2) {
        this.n1 = v1;
        this.n2 = v2;
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    }

    public void setDiv(int v1, int v2) {
        this.n1 = v1;
        this.n2 = v2;
        System.out.println(n1 + "/" + n2 + " = " + (n1 / n2));
    }

    public void setCuadratica(int a, int b, int c) {
        this.n1 = a;
        this.n2 = b;
        this.n3 = c;
        System.out.println("La formula cuadratica da: " + 
                (-n2 + Math.sqrt(((n2 * n2) - 4 * n1 * n3)) / 2 * n1)+" y "
                +(-n2 - Math.sqrt(((n2 * n2) - 4 * n1 * n3)) / 2 * n1));
    }

    public void setMaximo(int x[]) {
        int aux;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] < x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }
        System.out.println("los numeros del mayor al menor son: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void setMinimo(int x[]) {
        int aux;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] < x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }
        System.out.println("los numeros del menor al mayor son: ");
        for (int i = x.length-1; i > 0; i--) {
            System.out.println(x[i]);
        }
    }

    public void setAND(int x[], int y[]) {
        int z[] = new int[5];
        for (int i = 0; i < x.length; i++) {
            if (y[i] == 1 && x[i] == 1) {
                z[i] = 1;
            } else {
                z[i] = 0;
            }
        }
        System.out.println("Compuerta AND");
        for (int i = x.length-1; i > 0; i--) {
            System.out.println(x[i]+" "+y[i]+"="+z[i]);
        }
    }

    public void setOR(int x[], int y[]) {
        int[] z = new int[5];
        for (int i = 0; i < x.length; i++) {
            if (y[i] == 1 || x[i] == 1) {
                z[i] = 1;
            } else {
                z[i] = 0;
            }
        }
        System.out.println("Compuerta OR");
        for (int i = x.length-1; i > 0; i--) {
            System.out.println(x[i]+" "+y[i]+"="+z[i]);
        }
    }

    public void setNOT(int x[]) {
        int[] z = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                z[i] = 0;
            } else {
                z[i] = 1;
            }
        }
                System.out.println("Compuerta NOT");
        for (int i = x.length-1; i > 0; i--) {
            System.out.println(x[i]+"="+z[i]);
        }
    }
}
    

