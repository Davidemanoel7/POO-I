import java.util.ArrayList;
public class Mercado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private ArrayList<Venda> vendas;

    public Mercado()
    {
        nome = "";
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public ArrayList<Venda> getVendas(){
        return this.vendas;
    }
    public void setVendas(ArrayList<Venda> vendas){
        this.vendas = vendas;
    }
    
    public double total()
    {
        double soma = 0;
        for(Venda v: vendas){
            soma+= v.total();
        }
        return soma;
    }
    
    //total (em valor) das vendas de um mes
    public double totalDoMes(String mesEAno){
        double soma =0;
        for(Venda v: vendas){
            if(v.getMes().equalsIgnoreCase(mesEAno))
            soma+= v.total();
        }
        return soma;
    }
    
    //todas as vendas realizadsa no mes
    public ArrayList<Venda> vendasMes(String data){ //dd/mm/yyyy
        String mesRef = data.substring(3,data.length()); //tratamento de entrada (mm/yyy)
        ArrayList<Venda> vendMes = new ArrayList<>();
        for(Venda v: vendas){
            if(v.getMes().equalsIgnoreCase(mesRef))
            vendMes.add(v);
        }
        return vendMes;
    }
    
}
