package api.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App implements AppInterface
{
	public App() {
		super();
	}
	
	@Override
    public List<List<?>> partition(List<?> inputList, int taille) throws Exception{
    	List<List<?>> result = new ArrayList<List<?>>();
    	if(taille > 0) {
        	for(int i=0; i<inputList.size(); i=i+taille) {
        		try {
        			result.addAll(Arrays.asList(inputList.subList(i, i+taille)));
        		}catch(IndexOutOfBoundsException e) {
        			result.addAll(Arrays.asList(inputList.subList(i, inputList.size())));
        		}
        	}
    	}else {
    		throw new TailleException("Veuillez choisir une taille supérieur à 0");
    	}
    	return result;
    }

}
