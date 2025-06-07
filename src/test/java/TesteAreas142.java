// imports 

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import com.iterasys.Main;


public class TesteAreas142 {

    @Test
    public void testeAreaQuadrado() {
    
      // Dados de Entrada Área do quadrado = lado²
        float lado = 6;
      // Resultado Esperado
        float resultadoEsperado = 36;
      // Executa
        float resultadoAtual = Main.areaquadrado(lado);
      // Verifica o resultado
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeRetangulo() {
      // Dados de Entrada
        float base = 30;
        float altura = 4.5f;
     // Dados de Saída / Resultado Esperado
        float resultadoEsperado = 135f;
     // Executa
        float resultadoAtual = Main.arearetangulo(base, altura);
     // Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeCirculo() {
    // Dados de Entrada
        float raio = 3;

    // Dados de Saída / Resultado Esperado
        float resultadoEsperado = 28.274334f; // Calculo Área círculo: A = π r²

    // Executa
        float resultadoAtual = Main.areacirculo(raio);

    // Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeTriangulo() {
    // Dados de Entrada
        float base = 6; 
        float altura = 8;
    // Dados de Saída / Resultado Esperado
        float resultadoEsperado = 24f; // Área de um triângulo: (base * altura) / 2
    // Executa
        float resultadoAtual = Main.areatriangulo(base, altura); 
    // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    
    // DDT: Data Driver Testing --> Teste Direcionado à Dados
    // Popular: Massa de Teste
    @ParameterizedTest
    @CsvSource(value = {
        "4, 7, 28.0",
        "3, 3, 9.0",
        "5, 5, 25.0",
        "4, 4, 16.0",
        "9, 9, 81.0"
    }, delimiter = ',')
    public void testeRetanguloDDT(float base, float altura, float resultadoEsperado) {
    // Os Dados de entrada e o resultado esperado são lidos lista de valores acima  
    // Executa
        float resultadoAtual = Main.arearetangulo(base, altura);
    // Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "areaTriangulo142.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeTrianguloCSV(float base, float altura, float resultadoEsperado) {
    // Os Dados de entrada e o resultado esperado são lidos do arquivo CSV
        float resultadoAtual = Main.areatriangulo(base, altura);

     // Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }
 
}