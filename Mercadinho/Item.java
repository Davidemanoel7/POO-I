
public class Item
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int qnt;
    private Produto produtos;
    private double preco;   

    public Item()
    {
        qnt = 0;
        preco = 0;
    }

    public int getQnt() {
        return this.qnt;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    public Produto getProduto(){
        return this.produtos;
    }
    public void setProduto(Produto p){
        this.produtos = p;
    }
    
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double novoPreco){
        this.preco = novoPreco;
    }
    
    public double total() {
        return qnt * preco;      
    }
    
}
