package api.home;

import java.util.List;

public interface AppInterface {
	public List<List<?>> partition(List<?> inputList, int taille) throws Exception;
}
