import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ModificarPrograma {
    public static void main(String[] args){
        System.out.println("Meu nome é Guilherme. A data de hoje é " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
