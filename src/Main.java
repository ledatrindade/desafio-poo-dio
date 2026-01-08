import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Classe principal do sistema.
 * Responsável por simular a experiência de um usuário
 * se inscrevendo em um bootcamp, progredindo nos conteúdos
 * e acumulando XP.
 */
public class Main {

    public static void main(String[] args) {

        // Scanner é usado para capturar dados digitados pelo usuário no console
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do desenvolvedor
        // Exemplo esperado: Leda
        System.out.print("Enter the developer name (example: Leda): ");
        String devName = scanner.nextLine();

        /*
         * =========================
         * CRIAÇÃO DOS CONTEÚDOS
         * =========================
         */

        // Criação de um curso
        // Define título, descrição e carga horária
        Curso curso = new Curso();
        curso.setTitulo("Java Course");
        curso.setDescricao("Learn Java from scratch");
        curso.setCargaHoraria(8);

        // Criação de uma mentoria
        // A data é definida como o dia atual
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java Mentorship");
        mentoria.setDescricao("Live mentoring session");
        mentoria.setData(LocalDate.now());

        /*
         * =========================
         * CRIAÇÃO DO BOOTCAMP
         * =========================
         */

        // Cria o bootcamp e associa os conteúdos criados
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer Bootcamp");
        bootcamp.setDescricao("Bootcamp focused on Java backend");

        // Adiciona curso e mentoria à lista de conteúdos do bootcamp
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        /*
         * =========================
         * CRIAÇÃO DO DEV
         * =========================
         */

        // Cria o desenvolvedor com o nome informado
        Dev dev = new Dev();
        dev.setNome(devName);

        // Inscreve o dev no bootcamp
        // Automaticamente ele recebe os conteúdos disponíveis
        dev.inscreverBootcamp(bootcamp);

        /*
         * =========================
         * EXIBIÇÃO DOS CONTEÚDOS
         * =========================
         */

        System.out.println("\nEnrolled contents:");
        dev.getConteudosInscritos()
                .forEach(conteudo -> System.out.println(" - " + conteudo));

        /*
         * =========================
         * PROGRESSÃO DO USUÁRIO
         * =========================
         */

        // Pergunta quantos conteúdos o usuário deseja concluir
        // Exemplo esperado: 1 ou 2
        System.out.print(
                "\nHow many contents do you want to progress? " +
                        "(example: 1 or 2): "
        );

        int steps = scanner.nextInt();

        // Executa a progressão de acordo com a quantidade informada
        for (int i = 0; i < steps; i++) {
            dev.progredir();
        }

        /*
         * =========================
         * RESULTADO FINAL
         * =========================
         */

        // Exibe os conteúdos concluídos após a progressão
        System.out.println("\nCompleted contents:");
        dev.getConteudosConcluidos()
                .forEach(conteudo -> System.out.println(" - " + conteudo));

        // Exibe o total de XP acumulado
        System.out.println("\nTotal XP: " + dev.calcularTotalXp());

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
