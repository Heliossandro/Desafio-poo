import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mitoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso");
        curso1.setCarga_horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCarga_horaria(4);

        Mitoria mitoria = new Mitoria();
        mitoria.setTitulo("mitoria java");
        mitoria.setDescricao("descriçao mitoria java");
        mitoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mitoria);*/

        Conteudo conteudo = new Curso();
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Devolver");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getDescricao("Descrição Bootcamp Java Devolver");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mitoria);

        Dev devHeliosssandro = new Dev();
        devHeliosssandro.setNome("Heliossandro");
        devHeliosssandro.inscreverBootcamp(bootcamp);

System.out.println("Conteudos inscritos"+ devHeliosssandro.getConteudosInscritos());
        devHeliosssandro.progredir();
        System.out.println("-");
    System.out.println("Conteudos inscritos"+ devHeliosssandro.getConteudosInscritos());
    System.out.println("Conteudos concluidos"+ devHeliosssandro.getConteudosConcluidos());
        System.out.println("Xp"+ devHeliosssandro.calcularTotalXp());

System.out.println("--------------");


        Dev devSandro = new Dev();
        devSandro.setNome("Sandro");
        devSandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+ devSandro.getConteudosInscritos());
        devHeliosssandro.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos"+ devSandro.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+ devSandro.getConteudosConcluidos());
        System.out.println("Xp"+ devSandro.calcularTotalXp());
    }
}