package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    };
    
    @Override
    public String toString() {
        return "Curso{ " +
                "titulo= " + getTitulo() + 
                ", descrição= " + getDescricao() +
                ", carga horária= " + cargaHoraria +
                "}";
    }
}
