import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampJava);
        System.out.println("(inicial)Conteudos incritos Pedro: " + devPedro.getConteudosIncritos());
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("(depois de 2 progredir)Conteudos incritos: " + devPedro.getConteudosIncritos());
        devPedro.progredir();
        System.out.println("(depois de mais um progredir)Conteudos incritos Pedro: " + devPedro.getConteudosIncritos());
        System.out.println("Conteudos concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("Xp obtido: " + devPedro.calcularTotalXp());
        System.out.println("-------------------------------------------------");
        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos incritos Maria: " + devMaria.getConteudosIncritos());
        devPedro.progredir();
        System.out.println("Conteudos concluidos Maria: " + devMaria.getConteudosConcluidos());
    }
}