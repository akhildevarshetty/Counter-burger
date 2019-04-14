package composite;

public class Toppings extends LeafDecorator
{
    private String[] size;

    public Toppings(String t, double p)
    {
        super(t,p);
    }

    //4 Toppings are free, extra @0.75 for each
    public void setOptions(String[] size)
    {
        this.size = size;
        
        if ( size.length > 4 )
            this.price=this.price+((size.length-4) * 0.75);
    }

    public String getDescription()
    {
        String description = "" ;
        for ( int i = 0; i<size.length; i++ )
        {
            if(i>0)
            	description += " + " + size[i]; 
            else 
            	description = size[i];
        }
        return description;
    }

}

