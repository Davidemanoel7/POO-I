
public class Produto
{
    private double preco;
    private String desc;
    
    public Produto()
    {
        desc = "";
        preco = 0;
    }
    
    public void setPreco (double preco){
        this.preco = preco;   
    }
    public double getPreco(){
        return this.preco;
    }
    
    public void setDesc(String descricao){
        this.desc = descricao;
    }
    public String getDescricao(){
        return this.desc;
    }
}
