package ru.mirea.lab1;

public class Ball
{
    private String brand;
    private int radius;
    public Ball(String n, int a)
    {
        brand = n;
        radius = a;
    }
    public Ball(String n)
    {
        brand = n;
        radius = 3;
    }
    public Ball()
    {
        brand = "Jabulani";
        radius = 20;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getBrand(String brand)
    {
        return brand;
    }
    public int getRadius()
    {
        return radius;
    }
    public String toString()
    {
        return this.brand+", radius "+this.radius;
    }
    public void Diameter()
    {
        System.out.println(brand+"'s diameter is "+radius*2);
    }
}
