package composite;

public abstract class LeafDecorator extends Leaf implements PriceDecorator
{
    protected PriceDecorator wrap ;

    public LeafDecorator (String l, double p) 
    {
        super(l,p);
        this.wrap=null ;
    }
    
    abstract public String getDescription() ;
    
    abstract public void setOptions( String[] opt) ;
    
    public void wrapDecorator(PriceDecorator wrap)
    {
        this.wrap = wrap ;
    }

    public double getPrice() {

        if (wrap == null)
        {
            return price ;
        }
        else
        {
            return price + wrap.getPrice() ;
        }

    }

 
    public void printDescription() 
    { 
    	System.out.println( getDescription() ) ;

    }

}

