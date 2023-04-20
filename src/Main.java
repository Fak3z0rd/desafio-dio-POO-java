import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java Dio");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin");
        curso2.setDescricao("Curso Kotlin Dio");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java da DIO");
        mentoria1.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Vinicius");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();

        System.out.println("\nConteúdos Inscritos " + dev1.getNome());
        for (Conteudo cont : dev1.getConteudosInscritos()) {
            System.out.println(cont);
        }
        
        System.out.println("\nConteúdos Concluídos " + dev1.getNome());
        for (Conteudo cont : dev1.getConteudosConcluidos()) {
            System.out.println(cont);
        }
        
        System.out.println("\nXP: " + dev1.calcularTotalXp());
    }
}
