package cafe;

import org.jpl7.*;
import java.util.Map;

public class JPLutil {
    private Query testQuery;
    private Query mainQuery;
    
    public JPLutil() {
        
    }
    
    public boolean testConnection(){
        testQuery = new Query("consult('CafeD&P.pl')");
        
        return testQuery.hasSolution();
        
    }
    
    public Map<String,Term>[] consultToknowledgement(String[] list){ 
        String queryString = "";
        
        for (int i = 0; i < list.length; i++){
            if (list[i] == "")
                queryString += ("V" + i + ",");
            else
                queryString += (list[i] + ",");
            
        }
        
        queryString += "Busca";
        
        mainQuery = new Query("infestacaoIdentificada(" + queryString + ")");
        
        return mainQuery.allSolutions();
    }
    
}
