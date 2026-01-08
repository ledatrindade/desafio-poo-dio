package br.com.dio.desafio.dominio;

/**
 * Classe abstrata que representa qualquer tipo de conteúdo do bootcamp.
 * Serve como base para Curso e Mentoria.
 * Centraliza atributos e comportamentos comuns.
 */
public abstract class Conteudo {

    // XP padrão que todo conteúdo oferece.
    // Pode ser reutilizado e ajustado pelas subclasses.
    protected static final double XP_PADRAO = 10d;

    // Atributos comuns a todos os conteúdos
    private String titulo;
    private String descricao;

    /**
     * Método abstrato que força cada tipo de conteúdo
     * a definir sua própria regra de cálculo de XP.
     * (Polimorfismo)
     */
    public abstract double calcularXp();

    // Getters e setters básicos para encapsulamento

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
