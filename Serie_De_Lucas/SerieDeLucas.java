
public class SerieDeLucas
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int np;
    private int nq;
    private int num;
    
    // Xn = (Xn-1) * p - (Xn-2 * q
    
    public SerieDeLucas(int p, int q)
    {
        np = p;
        nq = q;
        num = -1;
    }
        
    public int getP() {return np;}
    
    public int getQ() {return nq;}
    
    public int prox(){
        num++;
        return lucas(num);
    }
        
    public int saltarN(int numSaltos){
       num += numSaltos;
       return lucas(num);
    }
    
    public int lucas(int n){
        if (n < 2 ) return n;
        return getP()*lucas(n-1) - getQ()*lucas(n-2);
    }    
}
