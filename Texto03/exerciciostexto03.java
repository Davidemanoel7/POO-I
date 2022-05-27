import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.io.File;
import java.util.ArrayList;
import java.awt.Toolkit;
import java.awt.Dimension;

public class exerciciostexto03
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    public exerciciostexto03()
    {
        // inicializa variáveis de instância
        
    }

    public String ex3_1() {
        Date dataAgora = new Date();
        return ""+dataAgora;
    }
    
    public String ex3_2(){
        SimpleDateFormat f1 = new SimpleDateFormat("EEEE, dd/MMMM/yyyy");
        Date dataA = new Date();
        String dataFormatada = f1.format(dataA);
        dataFormatada = format(dataFormatada);
        return dataFormatada;
    }
    
    private String format(String s){
        int i1 = s.indexOf("/");
        int i2 = s.indexOf("/",i1+1);
        s = (s.substring(0,i1)+" de " + s.substring(i1+1,i2) + " de " +s.substring(i2+1,s.length()));
        return s;
    }
    
    public String[] ex3_3(String dir){
        File pasta = new File(dir);
        if(pasta.exists()){
            return pasta.list();
        }
        return new String[]{null};
    }
    
    public String[] ex3_4(String dir){
        File pasta = new File(dir);
        File pt;
        String[] f = ex3_3(dir);
        for (int i=0; i < f.length; i++){
            pt = new File(pasta.getPath()+"/"+f[i]);
            if(pt.isDirectory()){ 
                f[i] = "D: " + f[i];
            } else f[i] = "[A]: " + f[i];
        }
        
        return f;
    }
    
    public boolean ex3_5(String dir){
        File pasta = new File(dir);
        if(pasta.exists()){
            pasta.delete();
            return true;
        }
        return false;
    }
    
    public void ex3_6(){
        JFrame jan = new JFrame();
        jan.setTitle("Janelinha do cap");
        jan.setSize(666,666);
        
        JMenuBar menu = new JMenuBar();
        jan.setJMenuBar(menu);
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu cap = new JMenu("666");
        
        menu.add(file);
        menu.add(edit);
        menu.add(cap);
        
        jan.setVisible(true);
    
    }
    
    public void ex3_7(String dir) throws java.io.IOException {
        File f = new File(dir);
        if ( f.exists()){
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(dir);
        }
    }
    
    public void ex3_8 (String dir)throws java.io.IOException{
        File f = new File(dir);
        if (f.exists()){
           Runtime runtime = Runtime.getRuntime();
           Process process = runtime.exec("gedit " + dir);
        }
    
    }   
    
    private Date formatdatas(String a) throws java.text.ParseException {
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        return f1.parse(a);
    }
    
    public void ex3_9(){
        JFrame wind = new JFrame();
        Toolkit res = Toolkit.getDefaultToolkit(); 
        Dimension d = res.getScreenSize();
        wind.setSize( d.width,d.height);
        wind.setTitle("HAHAHAHAHA");
        wind.setVisible(true);
    
    }
    
    public String ex3_10(String a, String b) throws Exception{
        Date data1 = formatdatas(a);
        Date data2 = formatdatas(b);
        
        if(data1.compareTo(data2)>0) return a;
        return b;
    }
    
    public Date[] ex3_11(Date[] datas) throws Exception{
        Date[] datesOrd = new Date[datas.length];
        for(int i =0; i<datas.length;i++){
            datesOrd[i] = datas[i];
            Date k = datesOrd[i];
            Date ks = datas[i];
            int j = i-1;
            while(j>=0 && datesOrd[j].compareTo(k)>0){
                datesOrd[j+1] = datesOrd[j];
                datas[j+1] = datas[j];
                j = j-1;
            }
            datesOrd[j+1] = k;
            datas[j+1] = ks;
        }  
        return datesOrd;
    }
    
    public String ex3_12(String data) throws java.text.ParseException {
        SimpleDateFormat toDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat toDay = new SimpleDateFormat("EEEE");
        Date date = toDate.parse(data);
        
        return toDay.format(date);
    }
    
}
