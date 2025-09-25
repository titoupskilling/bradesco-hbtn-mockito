package main.java.mockito;

public class Calculadora {
    public int somar(int a, int b) {
        ServicoMatematico servico = new ServicoMatematicoImpl();
        System.out.println(servico.somar(a, b));
        return servico.somar(a, b);
    }
}
