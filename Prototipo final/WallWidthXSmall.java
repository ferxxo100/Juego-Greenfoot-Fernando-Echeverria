import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallWidthXSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallWidthXSmall extends Walls
{
    /**
     * Act - do whatever the WallWidthXSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallWidthXSmall()
    {
    getImage().scale(getImage().getWidth() * 3 , getImage().getHeight()); //se modifica el tamaño de la imagen multiplicando su ancho por 3
    }
    public void act()
    {
        // Add your action code here.
    }
}
