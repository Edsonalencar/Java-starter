import br.com.diodesafio.dominio.BootCamp;
import br.com.diodesafio.dominio.Curso;
import br.com.diodesafio.dominio.Dev;
import br.com.diodesafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Spring", "Aprenda tudo de Spring");
        curso1.setWorkload(99);
        Curso curso2 = new Curso("Kotling", "Aprenda tudo de Kotling");
        curso2.setWorkload(120);

        Mentoria mentoria = new Mentoria("Vida profissional de um dev Java", "Entenda como é o mercado de trabalho e quais oportunidades te espera");
        mentoria.setWorkload(4);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setName("SpringKotlin - de noob a pro");
        bootCamp.setDescription("Aprenda hoje tudo sobre spring e kotlin");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setName("Pedro Silva");
        dev1.starterBootCamp(bootCamp);
        System.out.println("Cursos Inscritos " + dev1.getName() + " " + dev1.getStartingConteudos());

        dev1.nexting();
        dev1.nexting();
        dev1.xpTotalCalc();
        System.out.println("Cursos Concluidos " + dev1.getName() + " " + dev1.getEndingConteudos());

        System.out.println("\n");

        Dev dev2 = new Dev();
        dev2.setName("Edson Alencar");
        dev2.starterBootCamp(bootCamp);
        System.out.println("Cursos Inscritos " + dev2.getName() + " " + dev2.getStartingConteudos());

        dev2.nexting();
        dev2.nexting();
        dev2.xpTotalCalc();
        System.out.println("Cursos Concluidos " + dev2.getName() + " " + dev2.getEndingConteudos());
    }
}