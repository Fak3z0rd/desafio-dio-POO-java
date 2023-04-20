package dominio;

public class Curso {
    String titulo;
    String descricao;
    int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
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
                ", carga horária= " + cargaHoraria +
                "}";
    }
}
