package Disciplina;

import java.util.Scanner;

public class EscolherDisciplina {

    public static String listaDeDisciplina() {

        Scanner scanner = new Scanner(System.in);

        do {

        System.out.println("""
                QUÍMICA (1),\s
                FÍSICA (2),\s
                BIOLOGIA (3),\s
                MATEMÁTICA (4),\s
                PORTUGUÊS (5),\s
                HISTÓRIA (6),\s
                GEOGRAFIA (7),\s
                EDUCAÇÃO FÍSICA (8),\s
                ARTES (9),\s
                INGLÊS (10)""".indent(1));

        String action = scanner.nextLine();
        String disciplina = " ";



            switch (action) {
                case "1" -> disciplina = "QUIMICA";
                case "2" -> disciplina = "FISICA";
                case "3" -> disciplina = "BIOLOGIA";
                case "4" -> disciplina = "MATEMATICA";
                case "5" -> disciplina = "PORTUGUES";
                case "6" -> disciplina = "HISTORIA";
                case "7" -> disciplina = "GEOGRAFIA";
                case "8" -> disciplina = "EDUCACAOFISICA";
                case "9" -> disciplina = "ARTES";
                case "10" -> disciplina = "INGLES";
                default -> System.out.println("Opção inválida, por favor, informe outra");
            }

            return disciplina;
        }while (true);
    }

}
