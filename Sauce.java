package composite;

public class Sauce extends LeafDecorator 
{
    private String[] size;

    public Sauce( String s, double p )

    {
    	super(s,p);
    }

    //1st Sauce is for free, extra @0.75 for each
    public void setOptions(String[] size)
    {
        this.size = size;
        
        if (size.length>1)
        {
        	this.price=this.price+((size.length-1) * 0.75);
        }
       
    }

    public String getDescription()
    {
        String descrpition = "";
        for (int i = 0; i<size.length; i++)
        {
            if(i>0)
            	descrpition += " + " + size[i];
            else 
            	descrpition = size[i];
        }
        return descrpition;
    }

}
