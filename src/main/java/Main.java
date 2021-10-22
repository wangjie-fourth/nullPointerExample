import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        SimpleData simpleData = mapper.readValue("{}", SimpleData.class);
        testBoxToPrimitive(simpleData.a);
    }
    
    public static void testBoxToPrimitive(int a){
        System.out.println("a = " + a);
    }
}
