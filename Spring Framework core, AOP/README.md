
# Spring core and AOP assignment

1. Create project with Rectangle as a base class.  
   Create Point class and add 4 Point class objects in Rectangle.  
   Add height and width also as properties in rectriangle class.  
   Add spring configuration using JAVA BASED approach(Using java configuration class).  
   
   Bonus-Use individual objects and also try collections(List,set,map) of Obejcts for ex.  
   @Bean  
    public List<String> strList(){  
        return Arrays.asList("pink", "red", "yellow");  
    }  
	
## Output  
Rectangle Dimensions :  
Height :35, Width :50  
  
Four points are:  
Point 1: 10 , 10  
Point 2: 45 , 10  
Point 3: 45 , 60  
Point 4: 10 , 60  
  
List of fruits: [apple, mango, orange]  

2. Create aspect using After, AfterReturning, AfterThrowing, Around advices in AOP.  
   Use pointcut types within, args also along with execution.  
   Refer springAOP project shared on github.  
   
## Output  

