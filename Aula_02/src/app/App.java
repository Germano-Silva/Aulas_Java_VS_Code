package app;

import pacote1.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int i=10;
        i++;
        System.out.println("Hello, World!");
        System.out.println("The number is"+i);
        Pessoa p1 = new Pessoa();
        p1.comprimentar();
    }
}
