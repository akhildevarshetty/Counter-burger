package composite;

import java.text.DecimalFormat;

public class CustomBurger extends Composite 
{
    PriceDecorator priceDecorator = null;

    public CustomBurger(String d) 
    {
        super(d);
    }

    public void setDecorator(PriceDecorator decorator)
    {
        this.priceDecorator= decorator;
    }

    public void printDescription()
    {
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println(super.description = dec.format(priceDecorator.getPrice()));

        for(Component obj : components)
        {
            obj.printDescription();
        }

    }
}
