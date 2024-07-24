package org.example.modelo;

abstract class VeiculoAutomotor implements BemSeguravel{
    private String modelo;
    private double valorMercado;
    private int anoFabricação;


    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricação) {
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricação = anoFabricação;
    }

    public String getModelo() {
        return modelo;
    }


    public double getValorMercado() {
        return valorMercado;
    }


    public int getAnoFabricação() {
        return anoFabricação;
    }


}
