public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        int resultadoSoma = calculadora.somar(3, 4);
        System.out.println("Resultado da soma: " + resultadoSoma);
        
        int resultadoMultiplicacao = calculadora.multiplicar(5, 2);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
    }
}