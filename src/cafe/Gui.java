package cafe;

import java.io.IOException;
import java.util.Scanner;
import org.jpl7.Term;

public class Gui {    
    static final String[][] preString = {
        {"","baixa"           ,"alta"         ,""              ,""                ,""           ,""},
        {"","quente"          ,"frio"         ,""              ,""                ,""           ,""},
        {"","baixa"           ,"alta"         ,""              ,""                ,""           ,""},
        {"","baixa"           ,"alta"         ,""              ,""                ,""           ,""},
        {"","folha"           ,"fruto"        ,"caule"         ,"folha_fruto"     ,"raiz"       ,""},
        {"","sim"             ,"larvas"       ,"lagartas"      ,"formigas"        ,"escuros"    ,"nao"},
        {"","normal"          ,"reduzida"     ,"não_atacado"   ,""                ,""           ,""},
        {"","normal"          ,"amarelecido"  ,"sujas"         ,"mucha"           ,"furada"     ,"não_afetado"},
        {"","irregular"       ,"regular"      ,"sem_mancha"    ,""                ,""           ,""},
        {"","escurecido"      ,"laranja"      ,"marrom"        ,"clara"           ,"sem_mancha" ,""},
        {"","sim"             ,"nao"          ,""              ,""                ,""           ,""},
        {"","mancha_escura"   ,"mancha_anelar","haros_amarelos","perfurados"      ,""           ,""},
        {"","não_afetado"     ,"danificado"   ,"manchado"      ,""                ,""           ,""},
        {"","canto_estridente","morte_plantas","rastros_muco"  ,"materia_organica","nenhuma"    ,""}
    };
    
    public static void clean() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
 
    public static String mainMenu(){
        String text = "";
        
        text += "|||Sistema de identificacao de pragas e doencas do cafe|||\n";
        text += "Acoes:\n";
        text += "1-Iniciar identificacao;\n";
        text += "0-Sair do sistema.\n";
        
        return text;
        
    }   
    
    public static String questionMenu(int indexQ){
        String text = "";
        
        text += "|||Sistema de identificacao de pragas e doencas do cafe|||\n";
        text += "Identificacao de praga/doenca iniciado. Pergunta " + indexQ +"/14:\n";
        
        switch (indexQ) {
            case 1:
                text += Gui.umidadeMenu();
                break;
            case 2:
                text += Gui.temperaturaMenu();
                break;
            case 3:
                text += Gui.insolacaoMenu();
                break;   
            case 4:
                text += Gui.altitudeMenu();
                break;
            case 5:
                text += Gui.focoMenu();
                break; 
            case 6:
                text += Gui.insetosMenu();
                break;    
            case 7:
                text += Gui.areaFoliarMenu();
                break;    
            case 8:
                text += Gui.aspectoFoliarMenu();
                break;    
            case 9:
                text += Gui.manchaFoliarFormatoMenu();
                break;    
            case 10:
                text += Gui.manchaFoliarColoracaoMenu();
                break;    
            case 11:
                text += Gui.desfolhaMenu();
                break;    
            case 12:
                text += Gui.frutoMenu();
                break;    
            case 13:
                text += Gui.raizCauleMenu();
                break;    
            case 14:
                text += Gui.peculiaridadeMenu();
                break;
                
        }
        
        return text;
        
    }
    
    public static String umidadeMenu(){
        String text = "";
        
        text += "Clima - qual a umidade da regiao de plantio?\n";
        text += "1-Umidade baixa;\n";
        text += "2-Umidade alta;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String temperaturaMenu(){
        String text = "";
        
        text += "Clima - qual a temperatura da regiao de plantio?\n";
        text += "1-Calor;\n";
        text += "2-Frio;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String insolacaoMenu(){
        String text = "";
        
        text += "Clima - qual a media da insolacao da regiao de plantio?\n";
        text += "1-Baixa incidencia solar;\n";
        text += "2-Alta incidencia solar;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String altitudeMenu(){
        String text = "";
        
        text += "Clima - qual a altitude da regiao de plantio?\n";
        text += "1-Baixa altitude;\n";
        text += "2-Alta altitude;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
     
    public static String focoMenu(){
        String text = "";
        
        text += "Foco de ataque - qual o foco do ataque da praga/doenca?\n";
        text += "1-Folhas;\n";
        text += "2-Fruto;\n";
        text += "3-Caule;\n";
        text += "4-Folhas/Fruto;\n";
        text += "5-Raiz;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String insetosMenu(){
        String text = "";
        
        text += "Insetos - ha alguma presenca de insetos no entorno da plnata?\n";
        text += "1-Sim;\n";
        text += "2-Sim-Larvas;\n";
        text += "3-Sim-Lagartas;\n";
        text += "4-Sim-Formigas;\n";
        text += "5-Sim-Insetos escuros;\n";
        text += "6-Nao;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String areaFoliarMenu(){
        String text = "";
        
        text += "Sobre as folhas - como está o tamanho da folha?\n";
        text += "1-Estao normais;\n";
        text += "2-Estao menores;\n";
        text += "3-Nao foram atacadas;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String aspectoFoliarMenu(){
        String text = "";
        
        text += "Sobre as folhas - qual o aspecto das folhas?\n";
        text += "1-Esão normais;\n";
        text += "2-Estão amarelecidas;\n";
        text += "3-Aparentam estarem sujas;\n";
        text += "4-Estao muchas;\n";
        text += "5-Estao furadas;\n";
        text += "6-Nao foram afetadas;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
  
    public static String manchaFoliarFormatoMenu(){
        String text = "";
        
        text += "Sobre as folhas - qual o formato das manchas?\n";
        text += "1-Manchas irregulares;\n";
        text += "2-Manchas regulares;\n";
        text += "3-Sem manchas;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String manchaFoliarColoracaoMenu(){
        String text = "";
        
        text += "Sobre as folhas - como estao as manchas?\n";
        text += "1-Manchas escurecidas;\n";
        text += "2-Estão laranjas;\n";
        text += "3-Manchas marrons;\n";
        text += "4-Manchas claras;\n";
        text += "5-Sem manchas;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }    
    
    public static String desfolhaMenu(){
        String text = "";
        
        text += "Sobre as folhas - ha ocorrencia de desfolha?\n";
        text += "1-Sim;\n";
        text += "2-Nao;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String frutoMenu(){
        String text = "";
        
        text += "Fruto - qual a situacao do fruto do cafe?\n";
        text += "1-Possuem manchas escuras;\n";
        text += "2-Possuem manchas anelares;\n";
        text += "3-Possuem haros amarelos;\n";
        text += "4-Estao perfurados;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String raizCauleMenu(){
        String text = "";
        
        text += "Raiz/Caule - como esta a raiz/caule?\n";
        text += "1-Nao foram afetados;\n";
        text += "2-Danificados;\n";
        text += "3-Manchados;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static String peculiaridadeMenu(){
        String text = "";
        
        text += "Pecualiridade - selecione uma peculiaridade dessa doenca/praga?\n";
        text += "1-Ouco canto estridente na lavoura;\n";
        text += "2-Ha morte de plantas;\n";
        text += "3-Ha rastros de muco;\n";
        text += "4-A muita materia organica na região;\n";
        text += "5-Nao ha peculiaridade;\n";
        text += "0-Nao sei informar;\n";
        
        return text;
    }
    
    public static int getInput(int rangeFromZeroTo){
        Scanner scan = new Scanner(System.in);
        int count = 0, retorno = -1;
        do{
            if (count != 0)
                System.out.print("Insira a opcao desejada dentre as disponiveis: ");
            else
                System.out.print("Insira a opcao desejada: ");
            
            count = -1;
            try {
                retorno = scan.nextInt();
            } catch (Exception e) {
                scan.next();
                retorno = -1; 
            }
            
        }while(retorno < 0 || retorno > rangeFromZeroTo);
        
        return retorno;
        
    }
    
    public static void waiting(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira qualquer tecla para continuar.. ");
        scan.next();
        Gui.clean();
    }
    
}
