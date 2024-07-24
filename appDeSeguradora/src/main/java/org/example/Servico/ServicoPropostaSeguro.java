package org.example.Servico;

import org.example.modelo.BemSeguravel;

public class ServicoPropostaSeguro implements BemSeguravel{
    public void emitir(BemSeguravel bem){
        System.out.println("Emitindo proposta de seguro para: " + bem.descrever());
        System.out.println("Prêmio: "+ bem.calcularValorPremio());
        System.out.println();
    }

    @Override
    public double calcularValorPremio() {
        return 0;
    }

    @Override
    public String descrever() {
        return null;
    }
}
