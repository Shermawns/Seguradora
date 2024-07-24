package org.example.modelo;

public class ImovelResidencial implements BemSeguravel {
    private double valorMercado;
    private int areaConstruida;

    public double getValorMercado() {
        return valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public ImovelResidencial(double valorMercado, int areaConstruida){
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.01) + (getAreaConstruida() * 0.30);
    }

    @Override
    public String descrever() {
        return "Imóvel Residencial com valor de mercado " + valorMercado + " e área construída de " + areaConstruida + " m²";
    }
}
