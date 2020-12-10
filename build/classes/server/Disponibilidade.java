
import java.time.LocalDate;
import java.time.LocalTime;

public class Disponibilidade extends Mesa {
    
    private  LocalDate data;
    private LocalTime hora;
    private boolean status;


    public Disponibilidade(){
        super();
        status=true;
        data = LocalDate.now();
        hora = LocalTime.now();
       
         
		
    }

    public Disponibilidade(int id, String localizacao, int numeroPessoas, double valor,LocalDate data, LocalTime hora ,boolean status){
       

        super(id, localizacao, numeroPessoas, valor);
        setHora(hora);
        setData(data);
        setStatus(status);
    
       
    }

  

   

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

  


}
