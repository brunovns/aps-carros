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
public class Picape extends Automotor {
    private String tipoCabine;
    
    public void setTipoCabine(String tipoCabine){
        this.tipoCabine = tipoCabine;
    }
    public String getTipoCabine(){
        return tipoCabine;
    }
    
    public Picape (int anoFabricacao, String modelo, String marca, float valorMercado, String placa, String tipoCabine){
        super(anoFabricacao, modelo, marca, valorMercado, placa);
        this.tipoCabine = tipoCabine;
    }
    
    //calcula o imposto do objeto picape, dependendo do tipo de cabine.
    @Override
    public double calcularImposto(){
        if(2019-getAnoFabricacao()>20){
            return 0;
        }else if(tipoCabine.equals("Simples")){
            return 0.02 * getValorMercado();
        }else{ //tipo de cabine dupla
        return 0.04 * getValorMercado();
    }
    }
    
    //imprime todas as informações mais o tipo de cabine.
    @Override
    public String Imprimir(){
        super.Imprimir();
        System.out.println("Tipo de Cabine: "+tipoCabine);
        return tipoCabine;
    }
    
    //retorna todas as informações mais o tipo de cabine.
    @Override
    public String toString() {
        return "Picape: Ano " + getAnoFabricacao() + ", Modelo: " + getModelo() + ", Marca: " + getMarca() + ", Valor de Mercado: " + getValorMercado()
                + " Placa: " + getPlaca() + ", Tipo da Cabine: " + tipoCabine;
    }
}
