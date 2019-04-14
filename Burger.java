package composite;

public class Burger extends LeafDecorator 
{
    private String[] size;

    public Burger( String b, double p)
    {
        super(b,p);
    }

    public void setSizeOptions(String[] size)

    {
        this.size = size ;
        for (String type:size)
        {
        	switch(type)
        	{
        		case "1/3lb.": this.price=this.price+9.50;
        					break;
        					
        		case "2/3lb.": this.price=this.price+11.50;
							break;
				
        		case "1lb.": this.price=this.price+13.50;
							break;
        		case "In A Bowl": this.price=this.price+1.50;
							break;
        	}
        }
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

	@Override
	public void setOptions(String[] opt) 
	{
		// TODO Auto-generated method stub
		
	}

}

