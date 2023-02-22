package com.pe.entidad;

public class Temperatura {

    private double valorTemperatura;

    public Temperatura() {
    }

    public Temperatura(double valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    public double getValorTemperatura() {
        return valorTemperatura;
    }

    public void setValorTemperatura(double valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    public double convertirGradosaFarehneit() {
        double resultado;

        resultado = (this.getValorTemperatura() * 9 / 5) + 32;

        return resultado;
    }

    public double escogerOpcion(int opcion) {
        double valor = 0;
        switch (opcion) {
            case 0:
                valor = this.convertirCelciusaKelvin();
                break;
            case 1:
                valor = this.convertirCelsiusaFarehneit();
                break;
            case 2:
                valor = this.convertirFarehnheitaCelsius();
                break;
            case 3:
                valor = this.convertirFarehnheitaKelvin();
                break;
            case 4:
                valor = this.convertirKelvinaCelcius();
                break;
            case 5:
                valor = this.convertirKelvinaFarehnheit();
                break;

        }
        return valor;
    }

    public double convertirCelsiusaFarehneit() {
        double resultado;
        resultado = (this.getValorTemperatura() * 9 / 5) + 32;
        return resultado;
    }

    public double convertirFarehnheitaCelsius() {
        double resultado;
        resultado = (this.getValorTemperatura() - 32) / 1.8;
        return resultado;
    }

    public double convertirKelvinaCelcius() {
        double resultado;
        resultado = this.getValorTemperatura() - 273.15;
        return resultado;
    }

    public double convertirCelciusaKelvin() {
        double resultado;
        resultado = this.getValorTemperatura() + 273.15;
        return resultado;
    }

    public double convertirFarehnheitaKelvin() {
        double resultado;
        resultado = (5 * (this.getValorTemperatura() - 32)) / 9 + 273.15;
        return resultado;
    }

    public double convertirKelvinaFarehnheit() {
        double resultado;
        resultado = (1.8 * (this.getValorTemperatura() - 273.15)) + 32;
        return resultado;
    }

}
