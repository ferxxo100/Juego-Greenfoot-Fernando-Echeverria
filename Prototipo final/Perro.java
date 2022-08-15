import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Actor
{
    MyWorld thisGame;
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Perro()
    {
    getImage().scale(getImage().getWidth() / 10 , getImage().getHeight() /10); //se modifica el tamaño del perro para hacerlo más pequeño
    }
    public void act()
    {
         moverse();
         comer();
         morir(); //se manda a llamar a las funciones creadas
         
    }
    public void moverse()
    {
        if (Greenfoot.isKeyDown("right")) //cuando apache la tecla de flecha derecha se movera 3 a la derecha
        {
            setLocation(getX()+3, getY());
            if(pegarPared()== true) //si le pega a la pared, se aleja 3 
            {
                setLocation(getX()-3, getY());
            }
        }
        if (Greenfoot.isKeyDown("left")) //cuando apache la tecla de flecha izquierda se mueve 3 a la izquierda
        {
            setLocation(getX()-3, getY());
             if(pegarPared()== true) // si le pega a cualquier pared se aleja 3 de esa dirección
            {
                setLocation(getX()+3, getY());
            }
        }
        if (Greenfoot.isKeyDown("up")) // cuando apache la flecha para arriba se movera 3 para arriba
        {
            setLocation(getX(), getY()-3);
             if(pegarPared()== true)// si le pega a la pared regresa 3 para abajo
            {
                setLocation(getX(), getY()+3);
            }
        }
        if (Greenfoot.isKeyDown("down")) // cuando apache la flecha para abajo, se movera 3 abajo
        {
            setLocation(getX(), getY()+3);
             if(pegarPared()== true) // no le puede pegar a una pared
            {
                setLocation(getX(), getY()-3);
            }
        }
    }
    public boolean pegarPared()
    {
        if(isTouching(Walls.class)) //si el perro esta tocando cualquier objeto de la clase Walls es verdadero, si no falso
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
        Actor coleccionar = getOneIntersectingObject(Hueso.class); // cuando toque un hueso, el hueso es removido
        if(coleccionar != null) //cuando toque a la instancia del objeto va a ser no igual a nada, es decir verdadero
        {
            getWorld().removeObject(coleccionar);
            thisGame.coleccionar ++; //suma uno al contador
        }
        if (isTouching(Dueño.class) && thisGame.coleccionar ==6)
        {
            getWorld().addObject(new Ganaste(), 400, 250);
            Greenfoot.stop();
        }
    }
    public boolean castigo()
    {
        if(isTouching(Chocolate.class)) //si toca al chocolate es verdadero, si no es falso
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
        if (castigo()!=false) // cuando el perro toque al chocolate, lo manda a otra posición
        {
            setLocation(42,152);
        }
    }

}
    
    
