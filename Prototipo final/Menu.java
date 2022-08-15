import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        musica(); //se manda a llamar a la funcion de musica
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){ 
           Greenfoot.delay(7); //tiempo de espera de 7 segundos
           Greenfoot.setWorld(new Historia()); //cuando apache la tecla enter o espacio, va a cambiar a la pantalla de historia

    }
    }
    private void musica(){
        GreenfootSound musica = new GreenfootSound("cancionprototipo.mp3"); //se agrega la musica 
        musica.setVolume(30); //volumen de 30
        musica.playLoop(); //loop para que se repita
    
    }
    
}
