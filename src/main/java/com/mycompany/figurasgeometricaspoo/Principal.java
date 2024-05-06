
package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Circulo, 2: Rectangulo, 3: Triangulo):");
        int tipoFigura = scanner.nextInt();

        double radio;
        double lado1;
        double lado2;
        double base;
        double altura;

        switch (tipoFigura) {
            case 1: // Circulo
                System.out.println("Ingrese el radio del círculo:");
                radio = scanner.nextDouble();
                
                Circulo circulo = new Circulo(nombre, color, radio);
                System.out.println("Área del círculo: " + circulo.obtenerArea());
                System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
                break;
                
            case 2: // Rectangulo
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                lado1 = scanner.nextDouble();
                
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                lado2 = scanner.nextDouble();
                
                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
                break;
                
            case 3: // Triangulo
                System.out.println("Ingrese el valor de la base del triángulo:");
                base = scanner.nextDouble();
                
                System.out.println("Ingrese el valor de la altura del triángulo:");
                altura = scanner.nextDouble();
                
                Triangulo triangulo = new Triangulo(nombre, color, base, altura);
                System.out.println("Área del triángulo: " + triangulo.obtenerArea());
                System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
                break;
            default:
                System.out.println("Tipo de figura no válido.");
        }
        
    }
}
  
