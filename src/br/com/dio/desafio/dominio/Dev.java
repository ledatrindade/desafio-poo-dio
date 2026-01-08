package br.com.dio.desafio.dominio;

import java.util.*;

/**
 * Representa o desenvolvedor participante do bootcamp.
 * Controla inscrição, progresso e cálculo de XP.
 */
public class Dev {

    private String nome;

    // Conteúdos ainda não concluídos
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    // Conteúdos já finalizados
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Inscreve o dev em um bootcamp,
     * adicionando todos os conteúdos disponíveis.
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Simula o progresso do dev.
     * Move um conteúdo de inscritos para concluídos.
     */
    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("No content available to progress.");
        }
    }

    /**
     * Soma o XP de todos os conteúdos concluídos.
     */
    public double calcularTotalXp() {
        return conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
