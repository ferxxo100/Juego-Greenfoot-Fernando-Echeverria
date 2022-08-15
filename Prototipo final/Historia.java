import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Historia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Historia extends World
{

    /**
     * Constructor for objects of class Historia.
     * 
     */
    public Historia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); //dimensiones de la pantalla
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){ //cuando el usuario apache espacio o enter va a cambiar de pantalla
           Greenfoot.delay(15); //tiempo de 15 segundos
           Greenfoot.setWorld(new MyWorld()); // cambia a MyWorld, es decir el juego

    }
    }
}
