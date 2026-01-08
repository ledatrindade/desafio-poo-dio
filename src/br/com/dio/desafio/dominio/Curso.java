package br.com.dio.desafio.dominio;

/**
 * Representa um curso dentro do bootcamp.
 * Herda os atributos e comportamentos de Conteudo.
 */
public class Curso extends Conteudo {

    // Carga horária influencia diretamente no XP do curso
    private int cargaHoraria;

    /**
     * Implementação específica da regra de XP para cursos.
     * Quanto maior a carga horária, maior o XP.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Sobrescreve o toString para facilitar
     * a visualização do objeto no console.
     */
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
