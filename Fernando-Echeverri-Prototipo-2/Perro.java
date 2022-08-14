import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Actor
{
    int coleccionar = 0;
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Perro()
    {
    getImage().scale(getImage().getWidth() / 10 , getImage().getHeight() /10);
    }
    public void act()
    {
         moverse();
         comer();
         morir();
         ganar();
         
    }
    public void moverse()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
            if(pegarPared()== true)
            {
                setLocation(getX()-3, getY());
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
             if(pegarPared()== true)
            {
                setLocation(getX()+3, getY());
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
             if(pegarPared()== true)
            {
                setLocation(getX(), getY()+3);
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
             if(pegarPared()== true)
            {
                setLocation(getX(), getY()-3);
            }
        }
    }
    public boolean pegarPared()
    {
        if(isTouching(Walls.class))
        {
            return true;
        }
        else
        { 
        return false;
        }
    }
    public void comer()
    {
        if(getOneIntersectingObject(Hueso.class) != null) //cuando toque a la instancia del objeto va a ser no igual a nada, es decir verdadero
        {
            coleccionar ++;
            getWorld().removeObject(getOneIntersectingObject(Hueso.class));
        }
    }
    public boolean castigo()
    {
        if(isTouching(Chocolate.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void morir()
    {
        if (castigo()!=false)
        {
            setLocation(42,152);
        }
    }
    public void ganar()
    {
        if (isTouching(Dueño.class) && coleccionar ==5)
        {
            getWorld().addObject(new Ganaste(), 400, 250);
            Greenfoot.stop();
        }
    }
}
    
    
