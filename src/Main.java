import br.com.diodesafio.dominio.Curso;
import br.com.diodesafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        mentoria.setTitle("Aprenda já");
        curso.setTitle("SpringKitlin");

        System.out.println(mentoria.toString());
    }
}