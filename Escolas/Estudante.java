

public class Estudante
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int nivelLeitura;
    private String cpf;
       
    public Estudante() {
        
    }
    
    public void setNivelLeitura(int n) {
        this.nivelLeitura = n;
    } 
    
    public int getNivelLeitura() {
        return this.nivelLeitura;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getcpf() {
        return this.cpf;
    }
}
