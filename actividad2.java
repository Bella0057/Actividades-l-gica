import java.util.Scanner;

public class actividad2 {
  public static void main(String[] args) {

    // Ejercicio 1
    // Suma y multiplicación: enteros

    int numero01 = 20;
    int numero02 = 20;

    int resultadoSuma = numero01 + numero02;
    int resultadoMultiplicacion = numero01 * numero02;

    System.out.println(numero01);
    System.out.println(numero02);
    System.out.println(resultadoSuma);
    System.out.println(resultadoMultiplicacion);
    System.out.println("suma y multiplicación");
    System.out.println("-------------------------------------------------------");

    // Ejercicio 2
    // Resta y división: enteros

    int numero001 = 50;
    int numero002 = 30;
    int resultadoResta = numero001 - numero002;
    int resultadoDivision = numero001 / numero002;

    System.out.println(numero001);
    System.out.println(numero002);
    System.out.println(resultadoResta);
    System.out.println(resultadoDivision);
    System.out.println("resta y division");
    System.out.println("----------------------------------------------------------");

    // Ejercicio 3:
    // Operaciones combinadas: Escribe un programa que solicite al usuario tres
    // números enteros
    // y realice las siguientes operaciones: suma de los tres números,
    // multiplicación del primer
    // número por el segundo y división del resultado entre el tercer número.

    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, ingrese el primer número entero");
    int numero0001 = scanner.nextInt();

    System.out.println("Por favor, ingrese el segundo numero entero");
    int numero0002 = scanner.nextInt();

    System.out.println("Por favor, ingrese el tercer número entero");
    int numero0003 = scanner.nextInt();

    int sumaTresNumeros = numero0001 + numero0002 + numero0003;
    int multiplicacion = numero0001 * numero0002;
    int division = multiplicacion / numero0003;

    System.out.println("suma tres número:" + sumaTresNumeros);
    System.out.println("multiplicación primero por el segundo:" + multiplicacion);
    System.out.println("división:" + division);
    System.out.println("----------------------------------------------------------");


    // Ejercicio 4:
    // Operaciones con decimales: Escribe un programa que solicite al usuario dos
    // números decimales y realice las siguientes operaciones: suma, resta,
    // multiplicación y división.


    System.out.println("Ingrese un número decimal");
    double numero1 = scanner.nextDouble();

    System.out.println("Ingrese otro número decimal");
    double numero2 = scanner.nextDouble();

    double resultadoSuma4 = numero1 + numero2;
    double resultadoResta4 = numero1 - numero2;
    double resultadoMultiplicacion4 = numero1 * numero2;
    double resultadoDivision4 = numero1 / numero2;

    System.out.println("Primer número:" + numero1);
    System.out.println("Segundo número:" + numero2);
    System.out.println ("Suma:" + resultadoSuma4);
    System.out.println("Resta:" + resultadoResta4);
    System.out.println( "Multiplicación:" + resultadoMultiplicacion4);
    System.out.println("División:" + resultadoDivision4);
    System.out.println("operaciones decimales");
    System.out.println("-------------------------------------------------------");


    // Ejercicio 5
    // Incremento y decremento: Escribe un programa que declare una variable entera
    // y la inicialice con un valor. Luego, incrementa su valor en 1 y muestra el
    // resultado. Después, decrementa su valor en 1 y muestra el resultado
    // nuevamente.

    int variableEntera = 10;
    int variableIncrementada = variableEntera + 1;
    int variableDecrementada = variableEntera - 1;

    System.out.println("Valor original de la variable:" + variableEntera);
    System.out.println("Valor incrementado de la variable:" + variableIncrementada);
    System.out.println("Decremento de la variable" + variableDecrementada);
    System.out.println( "incremento y decremento de la variable");
    System.out.println("-----------------------------------------------------------");

    // Ejercicio 6
    // Operador de asignación compuesta: Escribe un programa que declare una
    // variable entera y la inicialice con un valor. Utiliza el operador de
    // asignación compuesta para sumar 5 a la variable y luego mostrar su valor.

    int variableEquis1 = 10;
    variableEquis1 += 5;

    System.out.println("Valor orginal de la variables:"  + 10);
    System.out.println("Valor al sumar 5:" + variableEquis1);
    System.out.println("Asignacion compuesta");
    System.out.println("-------------------------------------------------------------");

    // Ejercicio 7
    // Operadores lógicos: Escribe un programa que tome dos valores booleanos
    // ingresados por el usuario y muestre el resultado de las operaciones lógicas
    // AND, OR y NOT entre esos valores.

    //Operador booleano AND.


    System.out.println("Ingrese un número booleano (true/false):");
    boolean numeroUno = scanner.nextBoolean();

    System.out.println("Ingrese nuevamente un número booleano (true/false):");
    boolean numeroDos = scanner.nextBoolean();

    boolean resultadoAnd = numeroUno && numeroDos;

    System.out.println("El resultado de la operación AND es:" + resultadoAnd);


    //Operador booleano OR

    System.out.println("Ingrese un número (true/false:");
    boolean numero11 = scanner.nextBoolean();

    System.out.println("Ingrese un número (true/false):");
    boolean numero22 = scanner.nextBoolean();

    boolean resultadoOr = numero11 || numero22;

    System.out.println("El resultado de la operación OR es:" + resultadoOr);


    //Operador booleano:  NOT

    System.out.print("Ingrese el primer valor booleano (true/false): ");
    boolean valor1 = scanner.nextBoolean();

    System.out.print("Ingrese el segundo valor booleano (true/false): ");
    boolean valor2 = scanner.nextBoolean();

    boolean resultado1 = !valor1;
    boolean resultado2 = !valor2;

    System.out.println("El resultado de NOT " + valor1 + " es: " + resultado1);
    System.out.println("El resultado de NOT " + valor2 + " es: " + resultado2);

      // Ejercicio 8
      // Operador ternario: Escribe un programa que tome un número entero ingresado
      // por el usuario y
      // utilice el operador ternario para determinar si el número es positivo o
      // negativo. Luego,
      // muestra el resultado en la salida.

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        String resultado = numero > 0 ? "positivo" : "negativo";

        System.out.println("El número ingresado es " + resultado + ".");
        
        scanner.close();


    }

  }

