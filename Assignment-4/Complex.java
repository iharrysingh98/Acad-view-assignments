class Complex
{
    private double real, imaginary;
    
    public void setVals(double r, double i)
    {
        real = r;
        imaginary = i;
    }
    
    public void display()
    {
        System.out.println("The complex number : " + real + " + i" + imaginary);
    }
}

class c2
{
    public static void main(String x[])
    {
        Complex obj = new Complex();
        obj.setVals(2,5);
        obj.display();
    }
}