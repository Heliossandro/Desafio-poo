import br.com.dio.desafio.dominio.Mitoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args)  {
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

    System.out.println(curso1);
    System.out.println(curso2);
        System.out.println(mitoria);
    }
}
