import java.time.LocalDate;
import java.time.LocalTime;

public class Informacoes {
    
    public static void main(String[] args) {
        Cliente c1 = new Cliente(01, "Cabral da Moca", 1988, "São Paulo","");
        Disponibilidade mesa = new Disponibilidade(2, "Perto da porta", 4, 40.00, LocalDate.of(2020, 12, 10), LocalTime.of(12, 00), true);
       
        System.out.println("Localização: "+mesa.getLocalizacao());
        System.out.println("Nome: "+c1.getNome());
        System.out.println("Codigo: "+c1.getCodigo());
         
    }
}
