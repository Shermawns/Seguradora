package org.example.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricação) {
        super(modelo, valorMercado, anoFabricação);
    }

    @Override
    public double calcularValorPremio() {
        double calculo = getValorMercado() * 0.04;
        if (getAnoFabricação() < 2000){
            calculo += calculo * 0.05;
        }
        return calculo;
    }

    @Override
    public String descrever() {
        return "Carro particular modelo " + getModelo() + " " + getAnoFabricação() + " com valor de mercado " + getValorMercado();
    }
}
