public class actividad3 {
    public static void main(String[] args) {

        // Ejercicio 1
        // Calcular el área de un triángulo: b x a / 2

        double base = 50; // base del triángulo
        double altura = 7; // altura del triángulo
        double area = (base * altura) / 2;

        System.out.println(base);
        System.out.println(altura);
        System.out.println(area);
        System.out.println("area del triángulo: " + area);
        System.out.println("--------------------------------------------------");

        // Ejercicio 2.
        // Convertir grados Celsius a Fahrenheit: (grados Fahrenheit − 32) × 5/9

        double gradosCelsius = 70;
        double Fahrenheit = (gradosCelsius * 9 / 5) + 32;

        System.out.println(gradosCelsius);
        System.out.println(Fahrenheit);
        System.out.println("Temperatura en Fahrenheit: " + Fahrenheit);
        System.out.println("-----------------------------------------------------");

        // Ejercicio 3
        // Calcular el máximo de dos números:

        int numero1 = 20;
        int numero2 = 50;
        int maximo = Math.max(numero1, numero2);

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(maximo);

        // Ejercicio 4
        // Calcular el promedio de tres números:

        double numeroA1 = 20;
        double numeroA2 = 75;
        double numeroA3 = 35;
        double promedio = (numeroA1 + numeroA2 + numeroA3) / 3;

        System.out.println("numeroA1 " + numeroA1);
        System.out.println("numeroA2 " + numeroA2);
        System.out.println("numeroA3 " + numeroA3);
        System.out.println("promedio " + promedio);
        System.out.println("promedio de tres números:" +  promedio);
        System.out.println("----------------------------------------------------");

        // Ejercicio 5
        // 5. Calcular el perímetro de un cuadrado:

        double longitudLado = 20;
        double resultadoPerimetro = (longitudLado * 4);

        System.out.println("Longitud del lado del cuadrado: " + longitudLado);
        System.out.println("Perimetro del cuadrado: " + resultadoPerimetro);
        System.out.println("perímetro de un cuadrado: " + resultadoPerimetro);
        System.out.println("--------------------------------------");

        // Ejercicio 6
        // Calcular el volumen de un cubo.

        double longitud = 30;
        double volumen = Math.pow( longitud , 3);

        System.out.println("Longitud lado del cubo: " + longitud);
        System.out.println("Volumen del cubo: " + volumen);
        System.out.println("Volumen de un cubo: ");
        System.out.println("-------------------------------------------");

        // 7. Calcular la hipotenusa de un triángulo rectángulo:

        double cateto1 = 25;
        double cateto2 = 50;
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("Longitud del cateto 1: " + cateto1+ " es: ");
        System.out.println("longitud del cateto 2: " + cateto2);
        System.out.println("Área del círculo:" + hipotenusa);
        System.out.println("-------------------------------------------");


        // 8. Calcular el área de un círculo:

        double radioCirculo = 50;
        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);

        System.out.println(" Área del círculo:  " + areaCirculo + " es:  " + areaCirculo);
        System.out.println("-------------------------------------------");


        // 9. Calcular el resto de una división:

        int dividendo = 10;
        int divisor = 3;

        int resto = dividendo % divisor;

        System.out.println("El resto de la división de " + dividendo + " entre " + divisor + " es: " + resto);
        System.out.println("Resto de la división" +  resto);
        System.out.println("-------------------------------------------");


        // 10. Invertir el valor de una variable:

        double numeroOriginal = 5.0;
        double numeroInvertido = invertirNumero(numeroOriginal);

        System.out.println("numeroOriginal" + numeroOriginal);
        System.out.println(" numeroInvertido" + numeroInvertido);
        System.out.println("-------------------------------------------");

    }

    public static double invertirNumero(double numero) {
        return -numero;
    }
    {

    // 11. Concatenar dos cadenas de texto:

        String cadena1 ="Hola";
        String cadena2 = "Mundillo";
        String concatenacion = cadena1 + cadena2;

        System.out.println("Cadena 1" + cadena1);
        System.out.println("Cadena 2" + cadena2);
        System.out.println("Nombre completo" + concatenacion );
        System.out.println("-------------------------------------------");


        // 12. Convertir un número entero a String:

        int numeroEntero = 57;
        String numeroString1 = String.valueOf(numeroEntero);
        String numeroString2 = numeroEntero + "";

        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número convertido a String (con String.valueOf()): " + numeroString1);
        System.out.println("Número como cadena " + numeroString2);
        System.out.println("-------------------------------------------");



        // 13. Redondear un número decimal:

        double numeroDecimal = 57.95;
        long numeroRedondeado = Math.round(numeroDecimal);

        System.out.println("numero decimal" + numeroDecimal);
        System.out.println("Numero redondeado" + numeroRedondeado);
        System.out.println("-------------------------------------------");


}

}
