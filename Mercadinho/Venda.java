import java.util.ArrayList;
public class Venda
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String data;
    private ArrayList<Item> itens;
    
    public Venda()
    {
        // inicializa variáveis de instância
    }
    
    public String getData(){
        return this.data;
    }
    public void setData(String novaData){
        this.data = novaData;
    }
    
    public ArrayList<Item> getItens(){
        return this.itens;
    }
    public void setItens(ArrayList<Item> itens){
        this.itens = itens;
    }
    
    public String getMes(){
        String mes = this.data.substring(3, data.length());
        return mes;
    }
    
    public double total()
    {
        double soma = 0;
        for(Item i: itens){
            soma+= i.total();
        }
        return soma;
    }
}
