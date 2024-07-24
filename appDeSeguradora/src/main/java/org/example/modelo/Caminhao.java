package org.example.modelo;

public class Caminhao extends VeiculoAutomotor{
    private int quantidadeEixos;
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }


    public Caminhao(String modelo, double valorMercado, int anoFabricação, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricação);
        this.quantidadeEixos = quantidadeEixos;
    }


    @Override
    public double calcularValorPremio() {
        double calculo = getValorMercado() * 0.02;
        calculo += getQuantidadeEixos() * 50;
        return calculo;
    }

    @Override
    public String descrever() {
        return "Caminhao " + getModelo() + " " + getAnoFabricação() + ", " + getQuantidadeEixos() + " eixos , avaliado em " + getValorMercado();
    }
}
