/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo;

/**
 *
 * @author bruno
 */
public class Carro extends Automotor {
    private String combustivel;

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public Carro(int anoFabricacao, String modelo, String marca, float valorMercado, String placa, String combustivel) {
        super(anoFabricacao, modelo, marca, valorMercado, placa);
        this.combustivel = combustivel;
    }
    
    //calcula o imposto do objeto carro com o mesmo valor para os gasolina, diesel e flex e outro valor para GNV.
    @Override
    public double calcularImposto() {
        if (2019 - getAnoFabricacao() > 20) {
            return 0;
        } else if ("gasolina".equals(combustivel) || "diesel".equals(combustivel) || "flex".equals(combustivel)) {
            return 0.04 * getValorMercado();
        } else {
            return 0.03 * getValorMercado();
        }

    }
    
    //imprime todas as informações mais o tipo de combustivel
    @Override
    public String Imprimir(){
        super.Imprimir();
        System.out.println("Combustível: "+combustivel);
        return combustivel;
    }
    
    //retorna todas as informações mais o combustível.
    @Override
    public String toString() {
        return "Carro: Ano " + getAnoFabricacao() + ", Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Valor de Mercado: " + getValorMercado()
                + " Placa: " + getPlaca() + ", Combustivel: " + combustivel;
    }
}
