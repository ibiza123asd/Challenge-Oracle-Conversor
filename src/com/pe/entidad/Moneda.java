/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.entidad;

import java.text.DecimalFormat;

/**
 *
 * @author Brandon
 */
public class Moneda {

    private double valorMonedad;
    private static final double VALOR_DOLAR = 0.26;
    private static final double VALOR_EURO = 0.24;
    private static final double VALOR_STERLINA = 0.22;
    private static final double VALOR_JAPONES = 34.92;
    private static final double VALOR_WON_SUL_COREANO = 337.00;
    private static final double VALOR__UNO_DOLAR = 3.83;
    private static final double VALOR_UNO_EURO = 4.08;
    private static final double VALOR_UNO_STERLINA = 4.64;
    private static final double VALOR_UNO_JAPONES = 0.029;
    private static final double VALOR_UNO_WON_SUL_COREANO = 0.0029;

    public Moneda() {
    }

    public Moneda(double valorMonedad) {
        this.valorMonedad = valorMonedad;
    }

    public double escogertipoConversion(int opcion) {
        double monto = 0;
        switch (opcion) {
            case 0:
                monto = this.convertirDolar();
                break;
            case 1:
                monto = this.convertirEuro();
                break;
            case 2:
                monto = this.convertirSterlina();
                break;
            case 3:
                monto = this.convertirJapones();
                break;
            case 4:
                monto = this.convertirWonSul();
                break;
            case 5:
                monto = this.convertirDolarSoles();
                break;
            case 6:
                monto = this.convertirEuroSoles();
                break;
            case 7:
                monto = this.convertirSterlinaSoles();
                break;
            case 8:
                monto = this.convertirJaponesSoles();
                break;
            case 9:
                monto = this.convertirWonSulSoles();
                break;
                
        }
        return monto;
    }

    public String nombreMonedad(int opcion) {
        String valor = null;
        switch (opcion) {
            case 0:
                valor = "dolares";
                break;
            case 1:
                valor = "euros";
                break;
            case 2:
                valor = "libras sterlinas";
                break;
            case 3:
                valor = "yenes";
                break;
            case 4:
                valor = "wons";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                valor ="soles";
                break;
        }
        return valor;
    }

    public String reducirDecimales(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(valor).replace(",", ".");
    }

    public double convertirDolar() {
        double valor = this.getValorMonedad() * Moneda.VALOR_DOLAR;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirEuro() {
        double valor = this.getValorMonedad() * Moneda.VALOR_EURO;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirSterlina() {
        double valor = this.getValorMonedad() * Moneda.VALOR_STERLINA;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirJapones() {
        double valor = this.getValorMonedad() * Moneda.VALOR_JAPONES;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirWonSul() {
        double valor = this.getValorMonedad() * Moneda.VALOR_WON_SUL_COREANO;
        return Double.parseDouble(this.reducirDecimales(valor));
    }
    
    public double convertirDolarSoles() {
        double valor = this.getValorMonedad() * Moneda.VALOR__UNO_DOLAR;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirEuroSoles() {
        double valor = this.getValorMonedad() * Moneda.VALOR_UNO_EURO;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirSterlinaSoles() {
        double valor = this.getValorMonedad() * Moneda.VALOR_UNO_STERLINA;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirJaponesSoles() {
        double valor = this.getValorMonedad() * Moneda.VALOR_UNO_JAPONES;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public double convertirWonSulSoles() {
        double valor = this.getValorMonedad() * Moneda.VALOR_UNO_WON_SUL_COREANO;
        return Double.parseDouble(this.reducirDecimales(valor));
    }

    public void setValorMonedad(double valorMonedad) {
        this.valorMonedad = valorMonedad;
    }

    public double getValorMonedad() {
        return valorMonedad;
    }

}
