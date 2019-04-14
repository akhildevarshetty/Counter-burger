package composite;

public class Premium extends LeafDecorator 
{
    private String[] type;

    public Premium(String d, double p)
    {
        super(d,p);
    }

    //Premium type toppings @1.50
    public void setOptions(String[] type)
    {
        this.type = type;
        if ( type.length>0)
            this.price=this.price+(type.length * 1.50);
    }

    public String getDescription()
    {
        String description = "";
        for ( int i = 0; i<type.length; i++ )
        {
            if(i>0) 
            	description +=" + "+type[i]; 
            else 
            	description=type[i];
        }
        return description;
    }
}

