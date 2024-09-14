package com.projeto.poo.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    // Atributos
    private String matricula;
    private Turno turno;
    private Turma turma;

    private String login;
    private String senha;

    // Colections
    public static List<Aluno> alunos = new ArrayList<>();

    // Construtor
    public Aluno(String nome, String cpf, String matricula, Turno turno, Turma turma, String senha) {
        super(nome, cpf);
        this.matricula = matricula;
        this.login = matricula;
        this.senha = senha;
        this.turma = turma;
        this.turno = turno;

    }
    // Getts e sets da classe

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void imprimeFicha() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    // Metodos da Classe

    public static void matricularAluno() {

        // Imprime requisições ao usuários
        Scanner matricula = new Scanner(System.in);

        System.out.println("Digite o CPF do aluno:");
        String cpfaluno = matricula.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nomealuno = matricula.nextLine();

        System.out.println("Digite a matrícula do aluno: ");
        String matriculaaluno = matricula.nextLine();
        System.out.println("Crie a senha do aluno: ");
        String senhaaluno = matricula.nextLine();

        Turno turnoaluno = null;
        while (turnoaluno == null) {
            System.out.println("Escolha o turno do aluno, para: Manhã (Digite 1), Tarde (Digite 2), Noite (Digite 3)");
            int opcaoturnoaluno = matricula.nextInt();
            switch (opcaoturnoaluno) {
                case 1:
                    turnoaluno = Turno.MANHA;
                    break;
                case 2:
                    turnoaluno = Turno.TARDE;
                    break;
                case 3:
                    turnoaluno = Turno.NOITE;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        Turma turmaaluno = null;
        while (turmaaluno == null) {
            System.out.println(
                    "Escolha a turma do aluno, para: Turma 1 (Digite 1), Turma 2 (Digite 2), Turma 3 (Digite 3)");
            int opcaoturmaaluno = matricula.nextInt();
            switch (opcaoturmaaluno) {
                case 1:
                    turmaaluno = Turma.TURMA1;
                    break;
                case 2:
                    turmaaluno = Turma.TURMA2;
                    break;
                case 3:
                    turmaaluno = Turma.TURMA3;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        // Instancia um novo aluno

        Aluno aluno = new Aluno(cpfaluno, nomealuno, matriculaaluno, turnoaluno, turmaaluno, senhaaluno);
        alunos.add(aluno);

        // Confirmação de matricula
        System.out.println("Aluno matriculado com sucesso!");
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Turno: " + aluno.getTurno());
        System.out.println("Turma: " + aluno.getTurma());

    }

    public static void mostrarAlunos() {

        System.out.println("==========LISTA DE ALUNOS MATRICULADOS==========");
        for (Aluno a : alunos) {
            System.out.println(a.getInfo());
        }

    }

    public String getInfo() {
        return "Nome: " + getNome() + ", Cpf: " + getCpf() + ",Matricula: " + getMatricula() + ", Turno: " + turno
                + ", Turma: " + turma;
    }

    // Voltar pra terminar Remover aluno
    public static void removerAluno() {
        for (int i = 0; i < alunos.size(); i++) {
            Pessoa p = alunos.get(i);

            if (p.getNome().equals("Pedro")) // Provavel uso em busca por aluno, dps

            {

                alunos.remove(p);

                break;
            }
        }

    }

    public static void alimentaAluno() {
        Aluno aluno = new Aluno("Joao", "1111111111", "001", Turno.MANHA, Turma.TURMA1, "1234");
        Aluno aluno2 = new Aluno("Pedro", "1111111111", "001", Turno.MANHA, Turma.TURMA1, "1234");
        Aluno aluno3 = new Aluno("Lucas", "1111111111", "001", Turno.MANHA, Turma.TURMA1, "1324");
        alunos.add(aluno);
        alunos.add(aluno2);
        alunos.add(aluno3);

    }

    // Métodos Aluno menu
    public static void menuAluno() {
        int opcao;
        do {
            Scanner menuAluno = new Scanner(System.in);
            
            System.out.println("------------");
            System.out.println("MENU ALUNO");
            System.out.println("------------");

            System.out.print("1. Ver notas\n");

            System.out.println("2. Listar Cadastro");

            System.out.println("0. Sair ");
            opcao = menuAluno.nextInt();

            switch (opcao) {
                case 1:
                    mostrarBoletim();
                    break;
                case 2:
                    mostrarDados();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }

        } while (opcao != 0);

    }

    // Métodos do Menu aluno

    public static void mostrarBoletim() {

        Scanner scanner = new Scanner(System.in);
        String nomedigitado;
        System.out.println("Insira o nome do aluno: ");
        nomedigitado = scanner.nextLine();
        System.out.println("----------");
        System.out.println("BOLETIM");
        System.out.println("----------");
        for (Nota n : Nota.notas) {
            if (n.getAluno().getNome().equals(nomedigitado)) {
                System.out.println("Disciplina: " + n.getDisciplina().getNome() + " | Nota: " + n.getValor());

            }
        } 
    }

    public static void mostrarDados() {
        Scanner scanner = new Scanner(System.in);
        String nomedigitado;
        System.out.println("Insira o nome do aluno: ");
        nomedigitado = scanner.nextLine();
        System.out.println("------------------");
        System.out.println("DADOS CADASTRAIS");
        System.out.println("------------------");
        for (Aluno p : Aluno.alunos) {
            if (p.getNome().equals(nomedigitado)) {
                System.out.println("Nome: " + p.getNome() + " Cpf: " + p.getCpf() + " Matricula: " + p.getMatricula()
                        + " Turno: " + p.getTurno() + " Turma: " + p.getTurma() + " Login: " + p.getLogin() + " Senha: "
                        + p.getSenha());
                
            }
        } 
    } 
}