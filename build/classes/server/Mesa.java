
public class Mesa {
    private int id;
    private String localizacao;
    private int numeroPessoas;
    private double valor;
    

    public Mesa(){
        id=0;
        localizacao="";
        numeroPessoas=0;
        valor=0.0;
    }
 
    public Mesa(int id, String localizacao, int numeroPessoas, double valor){
       setId(id);
       setLocalizacao(localizacao);
       setNumeroPessoas(numeroPessoas);
       setValor(valor);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}