package org.example;

import org.example.modelo.Caminhao;
import org.example.modelo.CarroParticular;
import org.example.modelo.ImovelResidencial;
import org.example.Servico.ServicoPropostaSeguro;


public class Main {
    public static void main(String[] args) {
        ServicoPropostaSeguro propostaseguro = new ServicoPropostaSeguro();
        CarroParticular carroParticular = new CarroParticular("Toyota Corolla",200000,2015);
        ImovelResidencial imovelResidencial = new ImovelResidencial(30000,40);
        Caminhao caminhao = new Caminhao("Poggers kekw",780000,2010,4);

        propostaseguro.emitir(carroParticular);
        propostaseguro.emitir(imovelResidencial);
        propostaseguro.emitir(caminhao);
    }
}