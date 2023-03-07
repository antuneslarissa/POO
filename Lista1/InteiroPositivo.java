public class InteiroPositivo {
    private int x;

    public void setValor(int valor) {
        if (valor > 0) {
            x = valor;
        } else {
            throw new IllegalArgumentException("O valor deve ser inteiro positivo.");
        }
    }

    public InteiroPositivo multiplicar(InteiroPositivo outro) {
        InteiroPositivo resultado = new InteiroPositivo();
        resultado.setValor(x * outro.x);
        return resultado;
    }

    public int calcularFatorial() {
        int fatorial = 1;
        for (int i = x; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public int[] identificarDivisores() {
        int[] divisores = new int[x];
        int quantidadeDivisores = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisores[quantidadeDivisores] = i;
                quantidadeDivisores++;
            }
        }
        int[] resultado = new int[quantidadeDivisores + 1];
        resultado[0] = quantidadeDivisores;
        for (int i = 1; i <= quantidadeDivisores; i++) {
            resultado[i] = divisores[i - 1];
        }
        return resultado;
    }

    public int[] calcularFibonacci() {
        int[] fibonacci = new int[x];
        fibonacci[0] = 1;
        if (x > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < x; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public double calcularH() {
        double resultado = 0.0;
        for (int i = 1; i <= x; i++) {
            resultado += 1.0 / i;
        }
        return resultado;
    }

    public double calcularI() {
        double resultado = 0.0;
        for (int i = 1; i <= x; i++) {
            resultado += (double) i / ((x - i + 1) * (x - i + 1) + i - 1);
        }
        return resultado;
    }

    public double calcularS() {
        double resultado = 0.0;
        double termo = 1.0;
        for (int i = 1; i <= 20; i++) {
            resultado += termo;
            termo *= x / i;
        }
        return resultado;
    }

    public double calcularP() {
        double resultado = 0.0;
        for (int i = 1; i <= x; i++) {
            int termo = i * 2;
            if (termo % 4 == 0) {
                resultado += fatorial(termo) / i;
            } else {
                resultado -= fatorial(termo) / i;
            }
        }
        return resultado;
    }

    private int fatorial(int n) {
        int resultado = 1;
        for (int i = n; i > 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}