import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devErick = new Dev();
        devErick.setNome("Erick");
        devErick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de ERICK"+ devErick.getConteudosInscritos());

        devErick.progredir();
        devErick.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos de ERICK"+ devErick.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de ERICK"+ devErick.getConteudosConcluidos());
        System.out.println("--------");
        System.out.println("XP: "+ devErick.calcularTotalXp());
        System.out.println("--------");

        System.out.println("************************");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de CAMILA"+ devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos de CAMILA"+ devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de CAMILA"+ devCamila.getConteudosConcluidos());
        System.out.println("--------");
        System.out.println("XP: "+ devCamila.calcularTotalXp());
        System.out.println("--------");
    }
}