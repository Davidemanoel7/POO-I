import java.util.ArrayList;
import java.util.Random;
public class Cidade
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private ArrayList<Escola> escolas;
    
    public Cidade() {
        
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setEscolas(ArrayList<Escola> escolas){
        this.escolas = escolas;
    }
    
    public ArrayList<Escola> getEscolas(){
        return this.escolas;
    }
    
    public double mediaCidade() {
        double med = 0;
        for(Escola e:escolas){
            med+= e.mediaEscola();
        }
        return med/escolas.size();
    }
    
}
