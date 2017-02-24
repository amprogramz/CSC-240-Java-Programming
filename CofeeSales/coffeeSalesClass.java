
public class coffeeSalesClass 
{
    
    //Two constant data fields
    final double PRICE_PER_POUND = 5.99;
    final double TAX_RATE = .0725;
    //Two variables to hold the bags and weight
    int bags;
    double weight;
    
    //no-argument constructor that creates a sale of one bag weighing one pound
    public coffeeSalesClass()
    {
        bags = 1;
        weight = 1;
    }
    //constructor that accepts arguments from the first class for number of bags 
    //and the weight of each bag.
    public coffeeSalesClass(int numOfBags, double bagsWeight )
    {
        bags = numOfBags;
        weight = bagsWeight;
    }
    //returns the sale amount before tax
    public double getSale() 
    {
        return weight * bags * PRICE_PER_POUND;
    }
    //returns the tax on the transaction
    public double getSaleTax()
    {
        return (weight * bags * PRICE_PER_POUND) * TAX_RATE;
    }
    //returns the total sale price 
    public double getTotalPrice()
    {
        return (weight * bags * PRICE_PER_POUND) + 
                ((weight * bags * PRICE_PER_POUND) * TAX_RATE);
    }
    //returns the price "per pound"
    public double getPrice()
    {
        return PRICE_PER_POUND;
    }
    //returns the "tax rate"
    public double getTaxRate()
    {
        return TAX_RATE * 100;
    }
    //returns the bags 
    public int getBags()
    {
        return bags;
    }
    //returns the weight
    public double getWeight()
    {
        return weight;
    }

    
}
