import java.util.ArrayList;
public class Escola
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<Estudante> estudantes;
    private String nome;

    public Escola(int n) {
        
    }
    
    public double mediaEscola(){
        double soma=0;
        for(Estudante e:estudantes){
            soma+=e.getNivelLeitura();
        }
        return soma/estudantes.size();
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    public String getNivelLeitura() {
        return this.nome;
    }
    
    public ArrayList<Estudante> getEstudantes() {
        return this.estudantes;
    }
    
    public void setEstudantes(ArrayList<Estudante> estudantes){
        this.estudantes = estudantes;
    }
    public ArrayList<Estudante> acimaDaMedia(double media){
        ArrayList<Estudante> acimaDaMedia = new ArrayList<>();
        for(Estudante e: estudantes){
            if(e.getNivelLeitura() > media){
                 acimaDaMedia.add(e);
            }
        }
        return acimaDaMedia;
    }
    
    public ArrayList<Estudante> acimaDaMediaEscola(){
        ArrayList<Estudante> acimaDaMediaEscola = new ArrayList<>();
        for(Estudante e: estudantes){
            if(e.getNivelLeitura() > mediaEscola()) {
               acimaDaMediaEscola.add(e); 
            }
        }
        return acimaDaMediaEscola;
    } 
}
