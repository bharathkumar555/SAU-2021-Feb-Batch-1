import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ReplaceWithRegex {

    String st_original;
    String st_pattern;
    String st_replacement;

    ReplaceWithRegex(String original, String pattern, String replacement){
      st_original = original;
      st_pattern = pattern;
      st_replacement = replacement;
    }

    String replaceDNASequence(){

      Pattern pattern = Pattern.compile(st_pattern, Pattern.CASE_INSENSITIVE);
      Matcher matcher_1 = pattern.matcher(st_original);
		
	System.out.println("Match found at position: ");
      while(matcher_1.find()){
        System.out.println(matcher_1.start());
      }

      Matcher matcher = pattern.matcher(st_original);

      if(matcher.find()) {
        return(st_original.replaceAll(st_pattern, st_replacement));
      } 
      else {
        return("No substring match found");
      }
    } 
}

class ReplaceString {
  public static void main(String[] args) {

      // start with S or K ,follwed by 3 B's ,follwed by one or more L's and ends with H
    
   
      String charSequence = "KBBBLLLHABGJKBBBLHSDJG KBBBLLHSJGJHSH  DGKBBBLH";
   
    
	  String pattern = "[SK]B{3}L+H";
      String substring = "BHARATH";

      ReplaceWithRegex replace = new ReplaceWithRegex(charSequence,pattern,substring);
      String replced_string = replace.replaceDNASequence();
	  
      System.out.println("Original character sequence: "+charSequence);
      System.out.println("Modified character sequence: "+ replced_string);
  }
}

//ouput
//Match found at position:
//0
//12
//23
//41
//Original character sequence: KBBBLLLHABGJKBBBLHSDJG KBBBLLHSJGJHSH  DGKBBBLH
//Modified character sequence: BHARATHABGJBHARATHSDJG BHARATHSJGJHSH  DGBHARATH