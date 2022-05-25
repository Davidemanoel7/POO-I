import java.util.ArrayList;
public class Estado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private ArrayList<Cidade> cidades;
    public Estado() {
        
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public ArrayList<Cidade> getCidades(){
        return this.cidades;
    }
    
    public void setCidades(ArrayList<Cidade> cidades){
        this.cidades = cidades;
    }
    
    public double mediaLeituraEstado(){
        double media = 0;
        for(Cidade c: cidades){
            media += c.mediaCidade();   
        }
        return media/cidades.size();
    }
}
