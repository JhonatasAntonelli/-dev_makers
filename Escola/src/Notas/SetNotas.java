package Notas;
import BancoDeDados.BancoDeDados;
import Telas.TelaDoProfessor;
public class SetNotas extends BancoDeDados {

    public static void SetDaDisciplina(String disciplina, String RGAluno, double nota, String RGProfessor){


            switch (disciplina) {
                case "QUIMICA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setQuimica(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "FISICA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setFisica(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "BIOLOGIA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setBiologia(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "MATEMATICA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setMatematica(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "PORTUGUES" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setPortugues(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "HISTORIA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setHistoria(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "GEOGRAFIA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setGeografia(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "EDUCACAOFISICA" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setEducacaoFisica(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "ARTES" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setArtes(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                case "INGLES" -> {
                    BancoDeDados.loginPessoas.get(RGAluno).getAdicionarNotas().setIngles(nota);
                    System.out.println("Nota adicionada com sucesso");
                    TelaDoProfessor.TelaProfessores(disciplina, RGProfessor);
                }
                default -> System.out.println("Opção inválida, por favor, informe outra");
            }


        }
    }

