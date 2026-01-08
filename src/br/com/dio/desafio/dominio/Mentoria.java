package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 * Representa uma mentoria.
 * Diferente do curso, não depende de carga horária,
 * mas possui uma data específica.
 */

public class Mentoria extends Conteudo {

    // Data em que a mentoria acontece
    private LocalDate data;

    /**
     * Regra de XP fixa para mentoria,
     * pois o valor está mais ligado à experiência
     * do que à duração.
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Facilita a leitura das informações no console.
     */
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
