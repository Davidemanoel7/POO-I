import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;
public class ExerciciosTexto02
{
    
    public ExerciciosTexto02()
    {
        
    }
    //2.2
    public int[] exercicio2_2(int x, int y)
    {
        int [] resultado = new int[2];
        if ( x > y ) {
            resultado[0]= y;
            resultado[1]= x;
        }else{
            resultado[0] = x;
            resultado[1] = y;
        }
        return resultado;
    }
    //2.3
    public int[] exercicio2_3(int a, int b, int c)
    {
        if ((a>b) && (a>c)){
            if (b >c) return new int[]{a,b,c};
            return new int[] {a,c,b};
        } else if ((b>c) && (b >a)){
            if (c>a) return new int[]{b,c,a};
            return new int[]{b,a,c};
        } else if ((c>a) && (c>b)){
            if ( a > b) return new int[]{c,a,b};
            return new int[]{c,b,a};
        }
        return new int[]{a,b,c};
    }
    //2.4 Receber um número real e retornar sua raiz quadrada
    public double exercicio2_4(double x){
        double result = Math.sqrt(x);
        return result;
    }
    //2.5
    public int exercicio2_5(String a, String b){
        int indice = a.indexOf(b);        
        return indice;
    }
    
    //2.6
    public String[] exercicio2_6(String a, String b){
        int c1 = a.compareToIgnoreCase(b);
        if(c1 > 0) return new String[]{b,a};
        return new String[]{a,b};      
    }
    
    //2.7 Receber três Strings e retorná-los 
    //em ordem alfabética (use o método compareTo)
    // st2 como parem (st1.compareTo(st2))
    // > 0 : st1 > st2
    // < 0 : st1 < st2
    // = 0 : st1 == st2
    public String[] exercicio2_7(String a, String b, String c){
        //b > a ee c > a
        if ((a.compareTo(b) < 0) && (a.compareTo(c)<0)){
            if(b.compareTo(c) > 0) return new String[]{a,c,b};
            return new String[]{a,b,c};
        } else if ((b.compareTo(c) < 0) && (b.compareTo(a) < 0)){
            if(a.compareTo(c) > 0) return new String[]{b,c,a};
            return new String[]{b,a,c};
        } else if ((c.compareTo(a) < 0) && (c.compareTo(b) < 0)){
            if(a.compareTo(b) > 0) return new String[]{c,b,a};
            return new String[]{c,a,b};
        }
        return new String[]{b,c,a};
               
    }
    //2.8  
    public String[] exercicio2_8(String[] nomes){
        for (int i=0 ; i<= nomes.length; i++){
            nomes[i] = inverte(nomes[i]);
        }   
        return nomes;
    }
    //metodo de inverter...
    private String inverte(String str){
        int ind = str.indexOf(" ");
        String ns = str.substring(ind+1, str.length()) + " " + str.substring(0,ind);
        return ns;
    }
    
    //2.9
    public void exercicio2_9(String[] str){
      for (int i=0 ; i<= str.length; i++) {
          str[i] = str[i].toUpperCase();
      } 
    }
    
    //2.10
    public String[] exercicio2_10(String[] str){
      for (int i=0 ; i<= str.length; i++) {
          str[i] = str[i].toUpperCase();
      } 
      return str;
    }
    
    //2.11 
    public int[] exercicio2_11(int[] numbs){
        int k;
        for (int i = 0; i < numbs.length; i++){
            if (numbs[i] < numbs[i+1]){
                k = numbs[i];
                numbs[i] = numbs[i+1];
                numbs[i+1] = k;
            }
        } return numbs;
    }
    //2.12
    public int exercicio2_12(int[] numbs){
        int k;
        int trocas=0;
        for (int i = 0; i < numbs.length; i++){
            if (numbs[i] < numbs[i+1]){
                k = numbs[i];
                numbs[i] = numbs[i+1];
                numbs[i+1] = k;
                trocas++;
            }
        } return trocas;
    }
    
    //2.13
    public int exercicio2_13(String[] str){
        String aux;
        int trocas=0;
        for (int i = 0; i < str.length; i++){
            if (str[i].compareTo(str[i+1])<0){
                aux = str[i];
                str[i] = str[i+1];
                str[i+1] = aux;
                trocas++;
            }
        } return trocas;
        
    }
    
    //2.14
    public int[] exercicio2_14(int[] numbs){
        while(exercicio2_12(numbs) > 0){
            numbs = exercicio2_11(numbs);
        }
        return numbs;
    }
    
    //2.15
    public String[] exercicio2_15(String[] str){
        while(exercicio2_13(str) > 0){
            str = exercicio2_13B(str);
        }
        return str;
    }
    
    //troca
    public String[] exercicio2_13B(String[] str){
        String aux;
        for (int i = 0; i < str.length; i++){
            if (str[i].compareTo(str[i+1])<0){
                aux = str[i];
                str[i] = str[i+1];
                str[i+1] = aux;
            }
        } return str;        
    }
    
    //2.16
    public String[] exercicio2_16(String[] names){
        for (int i = 0; i < names.length; i++){
            names[i] = inverte(names[i]);
        }
        while(exercicio2_13(names) > 0){
            names = exercicio2_13B(names);
        }
        return names;
    }
    
    //2.17
    public String[] exercicio2_17(String[] names){
        for (int i = 0; i < names.length; i++){
            names[i] = inverte(names[i]);
        }
        while(exercicio2_13(names) > 0){
            names = invPalavras(names);
        }
        return names;
    }
    
    private String[] invPalavras(String[] str){
        int ind;
        
        for (int i=0; i< str.length; i++){
            ind = str[i].indexOf(" ");
            str[i] = str[i].substring(ind+1, str.length) + ", " + str[i].substring(0,ind);
        }
        return str;
    }
    
}