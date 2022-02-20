package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mitoria extends Conteudo {

    private   LocalDate data;
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

    @Override
    public String toString() {
        return "Mitoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descriçao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}
