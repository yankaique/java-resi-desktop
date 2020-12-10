public class Cliente {
    private int id;
    private String nome;
    private  int AnoDeNasc;
    private String cidade;
    private String codigo;
    
    
    public Cliente(){
             id=0;
             nome="";
             AnoDeNasc=0;
             cidade="";
             codigo="";
    }
    public Cliente( int id, String nome, int AnoDeNasc, String cidade, String codigo){

        setId(id);
        setNome(nome);
        setAnoDeNasc(AnoDeNasc);
        setCidade(cidade);
        setCodigo(codigo());
    }
    public static String codigo() {
        int qtdeMaximaCaracteres = 4;
        String[] caracteres = { "0","1","2","3","4","5","6","7","8","9",
        "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p",
        "q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F",
        "G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      
        String senha = "";

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha +=caracteres[posicao];
        }
        return senha;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeNasc() {
        return AnoDeNasc;
    }

    public void setAnoDeNasc(int anoDeNasc) {
        AnoDeNasc = anoDeNasc;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}
