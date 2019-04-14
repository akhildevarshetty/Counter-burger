package composite;

import java.text.DecimalFormat;


public class Leaf implements Component {

    private String description ;
    protected Double price ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
//    public Leaf ( String d )
//    {
//        description = d ;
//        price = 0.00 ;
//    }
    
    public void printDescription() {
    	if(description=="Crispy Onion Strings" || description=="The Purist") 
    	{
    		DecimalFormat fmt = new DecimalFormat("0.00");
            System.out.println( description +" "+fmt.format(price)); 	
    	}
    	else
    	{
    		System.out.print( description +" + ");
    	}
        
    }

    public void addChild(Component c) {
	    // no implementation
	}

	public void removeChild(Component c) {
        // no implementation
	}

	public Component getChild(int i) {
        // no implementation
        return null ;
	}
	 
}
