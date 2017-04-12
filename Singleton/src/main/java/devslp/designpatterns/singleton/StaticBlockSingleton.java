package devslp.designpatterns.singleton;

/**
 *
 * @author Enrique Guardiola
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception ex){
            throw new RuntimeException("Exception ocurred in static singleton initialization: " + ex.getMessage());
        }
    }
    
    private StaticBlockSingleton(){}
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
