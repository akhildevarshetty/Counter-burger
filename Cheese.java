package composite;

public class Cheese extends LeafDecorator 
{
    private String[] size;

    public Cheese(String c, double p)
    {
        super(c,p);
    }

    //1st Cheese is for free, extra cheese @1.00
    public void setOptions( String[] size )
    {
        this.size = size; 
        
        if ( size.length > 1 )
        	this.price= this.price+((size.length-1) * 1.00) ;
    }

    public String getDescription()
    {
        String description = "" ;
        for ( int i = 0; i<size.length; i++ )
        {
            if (i>0) 
            	description += " + " + size[i] ; 
            else 
            	description = size[i] ;
        }
        return description ;
    }

}

