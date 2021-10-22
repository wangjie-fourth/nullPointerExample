import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;

public class Main {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        MutableConfigOverride simpleData = mapper.readValue("{}", MutableConfigOverride.class);
        testBoxToPrimitive(simpleData.getMergeable());
    }
    
    public static void testBoxToPrimitive(boolean a){
        System.out.println("a = " + a);
    }
}
