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
public abstract class Automotor {
    private int anoFabricacao;
    private String modelo;
    private String marca;
    private float valorMercado;
    private String placa;
 
    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setValorMercado(float valorMercado){
        this.valorMercado = valorMercado;
    }
    public float getValorMercado(){
        return valorMercado;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    
    
    public Automotor(int anoFabricacao, String modelo, String marca, float valorMercado, String placa){
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.valorMercado = valorMercado;
        this.placa = placa;
    }
    
    public abstract double calcularImposto();
        
    //todas as informações do objeto.
    public String Imprimir(){
        System.out.println("Ano de Fabricação: "+anoFabricacao);
        System.out.println("Modelo do Veículo: "+modelo);
        System.out.println("Marca do Veículo: "+marca);
        System.out.println("Valor de Mercado: "+valorMercado);
        System.out.println("Placa do Veículo: "+placa);
        return"";
    } 
    
}
