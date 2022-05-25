import java.util.Random;
import java.util.ArrayList;

public class TesteMercado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Random r = new Random();
    public TesteMercado()
    {
    }
    
    public Rede teste(){
        Rede redeMercado = criarRede();
        redeMercado.setMercados(criarMercado(10));
        
        return redeMercado;
    }
    
    public Produto criarProduto(){
        Produto p = new Produto();
        p.setPreco(1.0 + (r.nextInt(40)+1));
        p.setDesc("Produto "+ r.nextInt(1001));
        return p;
    }
    
    public ArrayList<Item> criarItens(int n){
        ArrayList<Item> itens = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            Item it = new Item();
            it.setPreco(1.0 + (r.nextInt(40)+1));
            it.setQnt(r.nextInt(100));
            it.setProduto(criarProduto());
            itens.add(it);
        }
        return itens;
    }
    
    public ArrayList<Venda> criarVendas(int n){
        ArrayList<Venda> vendas = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++){
            Venda v = new Venda();
            v.setData(""+(r.nextInt(28)+1)+"/"+(r.nextInt(12)+1)+"/2022");
            v.setItens(criarItens(10));
            vendas.add(v);
        }
        return vendas;
    }
    
    public ArrayList<Mercado> criarMercado (int n){
        ArrayList<Mercado> mercados = new ArrayList<>();
        for (int i = 0 ; i < n ; i ++){
            Mercado m = new Mercado();
            m.setNome("Mercado Sao "+ (r.nextInt(n)+1));
            m.setVendas(criarVendas(10));
            mercados.add(m);
        }
        return mercados;
    }
    
    public Rede criarRede(){
      Rede rede = new Rede();
      rede.setNome("Rede BSI");
      return rede;        
    }
}
