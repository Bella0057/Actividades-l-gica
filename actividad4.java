public class actividad4 {
    public static void main(String[] args) {
        
        //1. Obtener la última palabra de una frase:

        String frase = "Hola mundo";
        String[] palabras = frase.split(" ");

        String ultimaPalabra = palabras[palabras.length - 1];

        System.out.println("la ultima palabra es: " + ultimaPalabra);

        //2. Convertir la primera letra de una frase a mayúscula:

        String frase1 = "hola mundo";
        String fraseMayuscula =  frase1.substring(0, 1).toUpperCase() + frase.substring(1);

        System.out.println(" frase 1" + frase1);
        System.out.println("Frase con la primera letra en mayúscula" + fraseMayuscula);

        //3. Eliminar todas las vocales de una frase:

        String frase3 = "¡Hola, Mundo!";
        String fraseSinVocales = frase3.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Frase sin vocales: " + fraseSinVocales);

        //4. Contar el número de caracteres en una frase:

        String frase4 = "¡Hola, mundo!";
        int numeroDeCaracteres = frase4.length();
        System.out.println("El número de caracteres en la frase es: " + numeroDeCaracteres);


        //5. Verificar si una frase comienza con una subcadena específica:

        String frase5 = "¡Hola, mundo!";
        String subcadena = "¡Hola";
        boolean comienzaConSubcadena = frase5.startsWith(subcadena);
        System.out.println("La frase comienza con la subcadena: " + comienzaConSubcadena);

        // 6. Obtener la subcadena que va desde la última aparición de carácter " " hasta el final de la frase:

        String frase6 = "¡Hola, mundo!";
        int ultimoEspacio = frase6.lastIndexOf(" ");
        String subcadena1 = frase6.substring(ultimoEspacio + 1);

        System.out.println("La subcadena del espacio hasta el final es: " + subcadena1);

        //7. Convertir una frase a minúsculas y luego a mayúsculas utilizando métodos de String:

        String frase7 = "¡Hola, Mundo!";
        String fraseMinuscula = frase7.toLowerCase();
        String fraseMayusculas = fraseMinuscula.toUpperCase();

        System.out.println("Frase en minúsculas: " + fraseMinuscula);
        System.out.println("Frase en mayúsculas: " + fraseMayusculas);

        //8. Eliminar los espacios en blanco al principio y al final de una frase utilizando métodos de String:

        String frase8 = "   ¡Hola, Mundo!   ";
        String fraseSinEspacios = frase8.trim();

        System.out.println("Frase sin espacios en blanco: '" + fraseSinEspacios + "'");

        //9. Reemplazar todas las apariciones de una letra por otra en una frase utilizando métodos de String:

        String frase9 = "Hola Estrellitas, bienvenidos al mundo de Java";
        String fraseMinusc = frase9.toLowerCase();
        String fraseModificada = fraseMinusc.replace('a', 'e');
        
        System.out.println(fraseModificada);

        //10. Obtener la longitud de una frase sin usar la propiedad length:

        String frase10 = "Hola Mundo, bienvenido al mundillo";
        
        int longitud = frase10.length();
        
        System.out.println("La longitud de la frase es: " + longitud);

    }
    
}


