package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

/**
 * Representa o bootcamp como um todo.
 * Agrupa conteúdos e desenvolvedores inscritos.
 */
public class Bootcamp {

    private String nome;
    private String descricao;

    // Datas automáticas: início no momento da criação
    // e término após 45 dias
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    // Conjunto de devs inscritos (não permite duplicação)
    private Set<Dev> devsInscritos = new HashSet<>();

    // Conteúdos mantêm ordem de inserção
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}
