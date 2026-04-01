package com.gustavo;

import java.util.ArrayList;
import java.util.Scanner;


public class cadastroFuncionarios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Pessoa>  pessoas = new ArrayList<>();

        int opcao;

        do{
            System.out.println("---CADASTRO DE FUNCIONARIO---");
            System.out.println("1- Cadastrar funcionario: ");
            System.out.println("2- Listar funcionarios: ");
            System.out.println("0- Sair:");
            opcao = entrada.nextInt();

            entrada.nextLine();

            switch(opcao){

                case 1:
                    Pessoa p = new Pessoa();
                    pessoas.add(p);
                    System.out.println("Digite o nome do pessoa: ");
                    p.nome = entrada.nextLine();

                    System.out.println("Digite o email: ");
                    p.email = entrada.nextLine();

                    System.out.println("Digite o idade: ");
                    p.idade = entrada.nextInt();

                    System.out.println("Cadastrado com sucesso!");
                    break;


                case 2:
                    if(pessoas.isEmpty()){
                        System.out.println("Nenhum pessoa foi encontrado!");
                    }else {
                        for(Pessoa pessoa : pessoas){
                            System.out.println("Nome: " + pessoa.nome);
                            System.out.println("Idade: " + pessoa.idade);
                            System.out.println("Email: " + pessoa.email);
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 0);

        entrada.close();
    }
}