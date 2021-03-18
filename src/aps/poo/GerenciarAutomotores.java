/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class GerenciarAutomotores {
//    ArrayList<Carro>listaCarros = new ArrayList<>();
//    ArrayList<Moto>listaMotos = new ArrayList<>();
//    ArrayList<Picape>listaPicapes = new ArrayList<>();

    ArrayList<Automotor> automotores;

    public GerenciarAutomotores() {
        automotores = new ArrayList<>();
    }

    //metodo que adiciona o veiculo no arraylist
    public void adicionar(Automotor a) {
        automotores.add(a);
    }
    //metodo que remove o veiculo pela placa digitada
    public boolean remover(String placa) {
        Automotor a = buscaPorPlaca(placa);
        if (a != null) {
            automotores.remove(a);
            return true;
        } else {
            return false;
        }
    }
    //busca o veiculo pela placa digitada
    public Automotor buscaPorPlaca(String placa) {
        for (int i = 0; i < automotores.size(); i++) {
            Automotor a = automotores.get(i);
            if (a.getPlaca().equals(placa)) {
                return a;
            }
        }
        return null;
    }
    //lista todos os objetos tipo carro
    public String listarCarros() {
        String infoCarros = null;
        // percorre o arraylist de automotores
        for (Automotor a : automotores) {
            // checa se o automotor a eh uma instancia da classe carro
            if (a instanceof Carro) {
                infoCarros = a.toString() + "\n";
            }
        }
        return infoCarros;

    }
    //lista todos os objetos do tipo moto
    public String listarMoto() {
        String infoMoto = null;
        for (Automotor a : automotores) {
            if (a instanceof Moto) {
                infoMoto = a.toString() + "\n";
            }
        }
        return infoMoto;
    }
    //lista todos os objetos do tipo picape
    public String listarPicape() {
        String infoPicape = null;
        for (Automotor a : automotores) {
            if (a instanceof Picape) {
                infoPicape = a.toString() + "\n";
            }
        }
        return infoPicape;
    }
    //obtem o valor do imposto calculado a partir do metodo de calcular imposto nos objetos do tipo carro, picape e moto
    public double obtValorImposto(String placa) {
        Automotor a = buscaPorPlaca(placa);
        if (a instanceof Carro) {
            return a.calcularImposto();
        } else if (a instanceof Moto) {
            return a.calcularImposto();
        } else if (a instanceof Picape) {
            return a.calcularImposto();
        }
        return -1;
    }
    //lista o objeto do tipo carro pelo tipo de combustivel digitado
    public String listarCarroPorCombustivel(String combustivel) {
        String infoCarro = null;
        for (Automotor a : automotores) {
            if (a instanceof Carro) {
                if (((Carro) a).getCombustivel().equals(combustivel)) {
                    infoCarro = ((Carro) a).toString();
                }
            }
        }
        return infoCarro;
    }

    public static void main(String[] args) {
        GerenciarAutomotores GA = new GerenciarAutomotores();
        int op = 0;
        int ano;
        String modelo;
        String marca;
        float valorMercado;
        String placa;
        String combustivel;
        String cabine;
        Scanner entrada = new Scanner(System.in);
        /*
        Carro GTR = new Carro(2015, "GT 34", "Nissan", 500000f, "EZN2008", "Flex");
        Moto Hornet = new Moto(2004, "CB600 Hornet", "Honda", 15000f, "BRN2007");
        Picape Hilux = new Picape(2019, "Hilux", "Toyota", 200000f, "BRU9589", "Dupla");

        GA.adicionar(GTR);
        GA.adicionar(Hornet);
        GA.adicionar(Hilux);
        System.out.println(GA.automotores.size());

        System.out.println(GA.listarCarros());
        System.out.println(GA.listarMoto());
        System.out.println(GA.listarPicape());
        System.out.println(GA.buscaPorPlaca("EZN2008"));
        
        System.out.println(GA.obtValorImposto("BRU9589"));
         */
        
        //interface para o usuário
        do {
            System.out.println("#######################################");
            System.out.println("1 - Adicionar Carro");
            System.out.println("2 - Adicionar Moto");
            System.out.println("3 - Adicionar Picape");
            System.out.println("4 - Listar Carro");
            System.out.println("5 - Listar Moto");
            System.out.println("6 - Listar Picape");
            System.out.println("7 - Listar Carro por Combustível");
            System.out.println("8 - Calcular Imposto");
            System.out.println("9 - Buscar por Placa");
            System.out.println("10 - Remover");
            System.out.println("11 - Sair");
            System.out.println("#######################################");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Qual o ano do carro?");
                    ano = entrada.nextInt();
                    System.out.println("Qual o modelo do carro?");
                    modelo = entrada.next();
                    System.out.println("Qual a marca do carro?");
                    marca = entrada.next();
                    System.out.println("Qual o valor do carro?");
                    valorMercado = entrada.nextFloat();
                    System.out.println("Qual a placa do carro?");
                    placa = entrada.next();
                    System.out.println("Qual o tipo de combustível do carro(álcool, gasolina, flex, GNV, diesel)?");
                    combustivel = entrada.next();
                    Carro c = new Carro(ano, modelo, marca, valorMercado, placa, combustivel);
                    GA.adicionar(c); //o objeto é adicionado no array
                    System.out.println("Carro adicionado com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Qual o ano da moto?");
                    ano = entrada.nextInt();
                    System.out.println("Qual o modelo da moto?");
                    modelo = entrada.next();
                    System.out.println("Qual a marca da moto?");
                    marca = entrada.next();
                    System.out.println("Qual o valor da moto?");
                    valorMercado = entrada.nextFloat();
                    System.out.println("Qual a placa da moto?");
                    placa = entrada.next();
                    Moto m = new Moto(ano, modelo, marca, valorMercado, placa);
                    GA.adicionar(m); //o objeto é adicionado no array
                    System.out.println("Moto adicionada com sucesso!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Qual o ano da picape?");
                    ano = entrada.nextInt();
                    System.out.println("Qual o modelo da picape?");
                    modelo = entrada.next();
                    System.out.println("Qual a marca da picape?");
                    marca = entrada.next();
                    System.out.println("Qual o valor da picape?");
                    valorMercado = entrada.nextFloat();
                    System.out.println("Qual a placa da picape?");
                    placa = entrada.next();
                    System.out.println("A picape é cabine dupla ou simples?");
                    cabine = entrada.next();
                    Picape p = new Picape(ano, modelo, marca, valorMercado, placa, cabine);
                    GA.adicionar(p); //o objeto é adicionado no array 
                    System.out.println("Picape adicionada com sucesso!");
                    System.out.println();
                    break;
                case 4:
                    System.out.println(GA.listarCarros());
                    break;
                case 5:
                    System.out.println(GA.listarMoto());
                    break;
                case 6:
                    System.out.println(GA.listarPicape());
                    break;
                case 7:
                    System.out.println("Digite o tipo de combustível: ");
                    combustivel = entrada.next();
                    System.out.println(GA.listarCarroPorCombustivel(combustivel));

                    break;
                case 8:
                    System.out.println("Digite a placa para realizar o calculo do imposto: ");
                    placa = entrada.next();
                    System.out.println(GA.obtValorImposto(placa)+" Reais");

                    break;
                case 9:
                    System.out.println("Digite a placa do veículo: ");
                    placa = entrada.next();
                    System.out.println(GA.buscaPorPlaca(placa));

                    break;
                case 10:
                    System.out.println("Digite a placa do veículo que deseja remover: ");
                    placa = entrada.next();
                    System.out.println(GA.remover(placa));
                    System.out.println("Veículo removido com sucesso!");
                    break;
                case 11:
                    op = -1;
                    break;
                default:
                    break;
            }
        } while (op != -1);

    }
}
