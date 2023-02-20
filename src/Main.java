import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*criação de cursos*/
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("hahaha curso java ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso POO");
        curso2.setDescricao("hahaha curso POO");
        curso2.setCargaHoraria(2);

        /*criação de mentoria*/
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição Java");
        mentoria.setData(LocalDate.now()); /*tudo que for criado é a data automatizada a partir da criação*/


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}