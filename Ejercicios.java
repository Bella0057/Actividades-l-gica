package com.cesde;

public class Ejercicios {
    
    public String ejercicio1(int num1, int num2) {
        // Implementar solución
        return "";
    }
    
    public String ejercicio2(double calificacion) {
       // Implementar solución
        return "";
    }

    
    public double ejercicio3(double precio) {
        // Implementar solución
        return 0;
    }
    
    
    public double ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
                // Implementar solución
        switch (tipoFigura) {
            case 1:
                // Área de un cuadrado: lado * lado
                return (ladoCuadrado * ladoCuadrado);
                
            case 2:
                // Área de un triángulo: (base * altura) / 2
                return (baseTriangulo * alturaTriangulo) / 2;
            case 3:
                // Área de un círculo: pi * radio al cuadrado
                return Math.PI * Math.pow(radioCirculo, 2);
            default:
                System.out.println("Tipo de figura no válido.");
                return -1;
    

            }
    }
    
    public int ejercicio5(int num1, int num2, int num3) {
        // Implementar solución
        return 0;
    }
}
