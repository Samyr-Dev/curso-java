package org.funcional;

public class FuncaoAnonima {
    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                System.out.println("Função anonima");
            }
        };
        thread.run();
    }
}
