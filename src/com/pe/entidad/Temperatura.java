package com.pe.entidad;

import java.text.DecimalFormat;

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

    public double convertirFormato(double valor) {
        double resultado;
        DecimalFormat dt = new DecimalFormat("#.00");
        resultado = Double.parseDouble(dt.format(valor).replace(",", "."));
        return resultado;
    }

    public double convertirCelsiusaFarehneit() {
        double resultado, resultadoF;
        resultado = (this.getValorTemperatura() * 9 / 5) + 32;
        resultadoF = this.convertirFormato(resultado);
        return resultadoF;
    }

    public double convertirFarehnheitaCelsius() {
        double resultado, resultadoF;
        resultado = (this.getValorTemperatura() - 32) / 1.8;
        resultadoF = this.convertirFormato(resultado);
        return resultadoF;
    }

    public double convertirKelvinaCelcius() {
        double resultado, resultadoF;
        resultado = this.getValorTemperatura() - 273.15;
        resultadoF = this.convertirFormato(resultado);
        return resultadoF;
    }

    public double convertirCelciusaKelvin() {
        double resultado, resultadoF;
        resultado = this.getValorTemperatura() + 273.15;
        resultadoF = this.convertirFormato(resultado);
        return resultadoF;
    }

    public double convertirFarehnheitaKelvin() {
        double resultado, resultadoF;
        resultado = (5 * (this.getValorTemperatura() - 32)) / 9 + 273.15;
        resultadoF = this.convertirFormato(resultado);
        return resultadoF;
    }

    public double convertirKelvinaFarehnheit() {
        double resultado, resultadoF;
        resultado = (1.8 * (this.getValorTemperatura() - 273.15)) + 32;
        resultadoF = this.convertirFormato(resultado);
        return resultadoF;
    }

}
