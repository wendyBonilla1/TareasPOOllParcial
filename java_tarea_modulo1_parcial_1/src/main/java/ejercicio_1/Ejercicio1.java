package ejercicio_1;

public class Ejercicio1 {
    public static void main(String[] args) {
       //#1 Crear el código que imprima la siguiente salida: "Hola, Soy de la clase de Programación Orientada a Objetos
        System.out.println("Hola, Soy de la clase de Programación Orientada a Objetos\n\n");
        
       //#2 Crear un programa que imprima en consola todas las operaciones aritméticas de 4 números enteros (suma, resta, multiplicación, divición)
        System.out.println("La suma es: "+(3+4+8+6)+"\n");
        System.out.println("La resta es: "+(3-4-8-6)+"\n");
        System.out.println("El producto es: "+(3*4*8*4)+"\n");
        System.out.println("La division es: "+(3/4/8/4)+"\n\n");
       
       //#3 Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones daría como resultado verdadero o falso:
       int M = 6, T = 1, K = -10 ;
        System.out.println("El resultado de M > T es: "+(M > T)+"\n");
        System.out.println("El resultado de T / K == -5 es: "+(T / K == -5)+"\n");
        System.out.println("El resultado de (M+T == 7) || (M-T == 5) es: "+((M+T == 7) || (M-T == 5))+"\n\n");
        
       //#4 Crear un arrelo que guarde e imprima 20 nombres de ciudades.
         String countries[]={
"Argentina",
"Australia",
"Brasil",
"Canadá",
"China",
"Francia",
"Alemania",
"Italia",
"India",
"Indonesia",
"Japón",
"México",
"República de Corea",
"Rusia",
"Arabia Saudí",
"Sudáfrica",
"Turquía",
"Reino Unido",
"Estados Unidos",
"Unión Europea"};

        System.out.println("Los paises son:\n");
        for (int i = 0; i < countries.length; i++) {
            String country = countries[i];
            System.out.println((i+1)+"."+country);
        }
        
    //#5 Escribe un programa que imprima mediante un ciclo los números pares del 2 al 100
        System.out.println("Numeros Pares\n");
       for (int i = 2; i < 102; i+=2) {
            System.out.println(""+i);            
        }
    }
}
