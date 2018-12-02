package application.apiUse;

import java.util.Arrays;

import api.home.App;
import api.home.AppInterface;

public class AppUseApi 
{
    public static void main( String[] args ) throws Exception
    {
    	AppInterface app = new App();
        System.out.println( app.partition(Arrays.asList(1, 2, 3, 4, 5), 2) );
        System.out.println( app.partition(Arrays.asList(1, 2, 3, 4, 5), 3) );
        System.out.println( app.partition(Arrays.asList(1, 2, 3, 4, 5), 1) );
    }
}
