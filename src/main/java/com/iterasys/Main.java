// 1 - Bibliotecas / Imports
// 1.1 - Pacotes
package com.iterasys;

// 2 - Classes
public class Main {
    // 2.1 - Atributos

    // 2.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Teste Calculo de Áreas: ");
    }

    
    public static float areaquadrado(float lado) {
        float area = lado * lado;
        System.out.println("Calculando a área do quadrado com lado de tamanho " + lado + ". Resultado: " + area);
        return area;
    }

    public static float arearetangulo(float base, float altura) {
        float area = base * altura;
        System.out.println("Calculando a área do retângulo com base de tamanho " + base + " e altura " + altura + ". Resultado: " + area);
        return area;
    }

    public static float areacirculo(float raio) {
        float area = (float) (Math.PI * Math.pow(raio, 2));
        System.out.println("Calculando a área do círculo com raio " + raio + ". Resultado: " + area);
        return area;
    }
    
    public static float areatriangulo(float base, float altura) {
        float area = (base * altura) / 2;
        System.out.println("Calculando a área do triângulo com base " + base + " e altura " + altura + ". Resultado: " + area);
        return area;
    }
}