import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallHeightSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallHeightSmall extends Walls
{
    /**
     * Act - do whatever the WallHeightSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallHeightSmall()
    {
    getImage().scale(getImage().getWidth() / 2 , getImage().getHeight() * 5); //se agarra a la imagen, y se divide su ancho dentro de dos, y se multiplica su altura por 5
    }
    public void act()
    {
        // Add your action code here.
    }
}
