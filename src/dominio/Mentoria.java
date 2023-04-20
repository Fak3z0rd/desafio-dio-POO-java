package dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descricao;
    LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    Double calcularXp () {
        return 0d;
    };

    @Override
    public String toString() {
        return "Mentoria{ " +
                "titulo= " + titulo + 
                ", descrição= " + descricao +
                ", data= " + dataMentoria +
                "}";
    }
}
