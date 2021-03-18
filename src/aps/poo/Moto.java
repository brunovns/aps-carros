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
public class Moto extends Automotor{
    public Moto(int anoFabricacao, String modelo, String marca, float valorMercado, String placa){
        super(anoFabricacao,modelo, marca, valorMercado, placa);
    }
    
    //calcula o imposto do objeto moto apenas pelo ano de fabricação.
    @Override    
    public double calcularImposto(){
            if(2019-getAnoFabricacao()>20){
                return 0;
            }else{
                return 0.02 * getValorMercado();
            }
        }
    //retorna todas as informações.
    @Override
    public String toString() {
        return "Moto: Ano " + getAnoFabricacao() + ", Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Valor de Mercado: " + getValorMercado()
                + " Placa: " + getPlaca();
    }
}
