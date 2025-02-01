package br.ufpr.lpoo.tarefa04.exercicio9;

public class Circunferencia {
    double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return String.format("Circunferência -> raio: %.1f cm, área: %.2f cm², perímetro: %.2f cm",
                this.raio, this.calculaArea(), this.calculaPerimetro());
    }
}
