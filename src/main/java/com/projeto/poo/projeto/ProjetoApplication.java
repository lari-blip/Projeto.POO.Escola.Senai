package com.projeto.poo.projeto;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProjetoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoApplication.class, args);

        Aluno.alimentaAluno();
        Disciplina.alimentaDisciplina();
        Nota.alimentaNota();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("Escolha como prosseguir: ");
            System.out.println("1. Acessar o menu do aluno.");
            System.out.println("2. Acessar o menu do professor.");
            System.out.println("0. Sair.");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluno.menuAluno();

                    break;
                case 2:
                    Professor.menuProfessor();

                    break;
                case 0:
                    System.out.println("Saindo...");

                    break;
                default:
                    System.out.println("Insira um digito válido.");

                    break;

            }
        } while (opcao != 0);

    }

}