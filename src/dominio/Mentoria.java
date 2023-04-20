package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate dataMentoria;

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public Double calcularXp () {
        return XP_PADRAO + 10d;
    };

    @Override
    public String toString() {
        return "Mentoria{ " +
                "titulo= " + getTitulo() + 
                ", descrição= " + getDescricao() +
                ", data= " + dataMentoria +
                "}";
    }
}
