import java.util.ArrayList;
public class Rede
{
    private ArrayList<Mercado> mercados;
    private String nome;
    public Rede()
    {
        nome = "";
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setMercados(ArrayList<Mercado> m){
        this.mercados = m;
    }
    
    public ArrayList<Mercado> getMercado(){
        return this.mercados;
    }
    
    
    public double totalRede(){
        double total=0;
        for(Mercado m : mercados){
            total = m.total();
        }
        return total;
    }
    
}
