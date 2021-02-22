import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

class ReverseOrderView {

      Map<Integer, String> getReverseOrderView(Map<Integer, String> mapping){
            Map<Integer, String> reverseOrder = new HashMap<>();
            reverseOrder = mapping.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (oldValue, newValue) -> oldValue,
                                    LinkedHashMap::new
                                ));
            return(reverseOrder);
      }
}
 
class ReverseOrderKey
{
    public static void main(String[] args)
    {
        Map<Integer, String> rollnoAndName = new HashMap<>();
			
		rollnoAndName.put(178,"Bharath kumar");
		rollnoAndName.put(145,"Naveen");
		rollnoAndName.put(199,"Kumar");
		rollnoAndName.put(234,"Akash Raj");
		rollnoAndName.put(666,"Abhishek");
		rollnoAndName.put(123,"Amar");
		rollnoAndName.put(321,"Abhishek H");
        
        System.out.println("Keys in original order of view: "+rollnoAndName);
		
 
        ReverseOrderView reversingObject = new ReverseOrderView();
        System.out.println("Keys in reverse order of view: "+reversingObject.getReverseOrderView(rollnoAndName));    
    }
}

/*output
Keys in original order of view: {145=Naveen, 321=Abhishek H, 178=Bharath kumar, 199=Kumar, 234=Akash Raj, 666=Abhishek, 123=Amar}
Keys in reverse order of view: {666=Abhishek, 321=Abhishek H, 234=Akash Raj, 199=Kumar, 178=Bharath kumar, 145=Naveen, 123=Amar}

*/