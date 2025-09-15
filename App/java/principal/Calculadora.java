package principal;

public class Calculadora {
    private double valorA;
    private double valorB;

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getSoma() {
        return valorA + valorB;
    }

    public double getDiferenca() {
        return valorA - valorB;
    }

    public double getProduto() {
        return valorA * valorB;
    }

    public double getQuociente() {
        if (valorB != 0) {
            return valorA / valorB;
        } else {
            return Double.NaN; // ou poderia lançar uma exceção
        }
    }
}
