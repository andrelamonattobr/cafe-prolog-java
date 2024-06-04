package cafe;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import org.jpl7.Term;

public class Cafe {
    static JPLutil jpl = new JPLutil();
    static String[] list;
    
    public static void main(String[] args) {
        boolean startProgram = true;
        int option;
        
        System.out.println(jpl.testConnection());
        Gui.clean();
        
        while (startProgram){
            System.out.print(Gui.mainMenu());
            
            option = Gui.getInput(1);
            
            if (option == 0)
                startProgram = false;
            else
                Cafe.execDiagnostic();
            
        }
        
    }
    
    public static void execDiagnostic(){
        int listOfRange[] = {2,2,2,2,5,6,3,6,3,5,2,4,3,5};
        
        Gui.clean();
        
        list = new String[14];
        for(int i = 0; i < 14; i++)
            list[i] = "";
        
        for (int i = 0;i < 14; i++){
            Gui.clean();
            System.out.print(Gui.questionMenu(i+1));
            list[i] = Gui.preString[i][Gui.getInput(listOfRange[i])];
            
        }
        
        Gui.clean();
        
        Map<String,Term>[] solution = jpl.consultToknowledgement(list);
        
        if (solution.length == 0){
            System.out.println("Não foi encontrado nenhuma doenca/praga");
            System.out.println("Por favor, tente novamente e insira parametros mais generalizados");
            Gui.waiting();        
        }else{
            System.out.println("Segue doenca/praga encontrada(s):");
            for (int i = 0; i < solution.length ; i++) { 
                System.out.println( "doenca/praga: " + solution[i].get("Busca")); 
            }
            Gui.waiting();
        }
            
    }
    
}
