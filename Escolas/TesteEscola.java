
import java.util.Random;
import java.util.ArrayList;

public class TesteEscola
{
    private Random numRandom = new Random();
    
    public TesteEscola()
    {
        // inicializa variáveis de instância
        //x = 0;
    }
    public Estado dedoDeDeus(int n){
        Estado e = criarEstados(n);
        e.setCidades(criarCidades(10));
        for (Cidade c: e.getCidades()){
            c.setEscolas(criarEscola(10));
            for (Escola escola: c.getEscolas()){
                escola.setEstudantes(criarEstudantes(20));
            }
        }
        return e;
    }
    
    public Estado criarEstados(int n){
        Estado e = new Estado();
        e.setNome("Estado "+(numRandom.nextInt(100)+1));
        return e;
    }
    
    public ArrayList<Cidade> criarCidades(int n){
        ArrayList<Cidade> cidade = new ArrayList<>(n);
        for(Cidade c : cidade){
            c.setNome("Sao Joao "+(numRandom.nextInt(1001)));
            cidade.add(c);
        }
        return cidade;
    }
    
    public ArrayList<Escola> criarEscola(int n){
        ArrayList<Escola> escolas = new ArrayList<>(n);
        for(Escola es : escolas){
            es.setNome("Escola "+(numRandom.nextInt(100001)));
            escolas.add(es);
        }
        return escolas;
    }
    
    public ArrayList<Estudante> criarEstudantes(int n){
        ArrayList<Estudante> estudantes = new ArrayList<>(n);
        for(Estudante est : estudantes){
            est.setCpf("0000000"+(numRandom.nextInt(10000)));
            est.setNivelLeitura(numRandom.nextInt(10)+1);
            estudantes.add(est);
        }
        return estudantes;
    }
}
