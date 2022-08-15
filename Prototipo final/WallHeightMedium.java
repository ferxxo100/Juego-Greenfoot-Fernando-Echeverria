import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallHeightMedium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallHeightMedium extends Walls
{
    /**
     * Act - do whatever the WallHeightMedium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallHeightMedium()
    {
    getImage().scale(getImage().getWidth() / 2 , getImage().getHeight() * 20); //se agarra a la imagen, y se divide su ancho dentro de dos, y se multiplica su altura por 20
    }
    public void act()
    {
        // Add your action code here.
    }
}
