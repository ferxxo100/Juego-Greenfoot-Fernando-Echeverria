import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallWidthLarge wallWidthLarge = new WallWidthLarge();
        addObject(wallWidthLarge,299,94);
        wallWidthLarge.setLocation(430,8);
        WallHeightLarge wallHeightLarge = new WallHeightLarge();
        addObject(wallHeightLarge,482,145);
        wallHeightLarge.setLocation(792,312);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,149,257);
        wallHeightMedium.setLocation(6,351);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,401,160);
        getClass();
        wallHeightSmall.setLocation(3,52);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,449,417);
        wallWidthMedium.setLocation(221,491);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,624,395);
        wallWidthSmall.setLocation(642,393);
        wallWidthSmall.setLocation(728,496);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,611,498);
        wallWidthSmall2.setLocation(619,493);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,156,232);
        wallWidthSmall3.setLocation(75,211);
        wallWidthSmall2.setLocation(574,492);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,421,271);
        wallHeightSmall2.setLocation(145,242);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,456,321);
        removeObject(wallWidthMedium2);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,279,247);
        wallWidthSmall4.setLocation(228,272);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,304,201);
        wallHeightSmall3.setLocation(237,227);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,246,179);
        wallHeightSmall4.setLocation(233,139);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,578,160);
        removeObject(wallHeightMedium2);
        wallWidthSmall2.setLocation(616,494);
        wallHeightSmall4.setLocation(238,152);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,438,95);
        wallWidthMedium3.setLocation(347,108);
        wallWidthMedium3.setLocation(392,110);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,555,168);
        wallHeightSmall5.setLocation(575,153);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,606,248);
        wallHeightSmall6.setLocation(576,228);
        WallWidthXSmall wallWidthXSmall = new WallWidthXSmall();
        addObject(wallWidthXSmall,615,272);
        wallWidthXSmall.setLocation(615,272);
        WallWidthXSmall wallWidthXSmall2 = new WallWidthXSmall();
        addObject(wallWidthXSmall2,711,210);
        wallWidthXSmall2.setLocation(740,194);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,354,376);
        wallWidthMedium4.setLocation(309,372);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,274,315);
        wallHeightSmall7.setLocation(91,330);
        wallWidthMedium4.setLocation(264,372);
        wallWidthMedium4.setLocation(160,370);
        wallHeightSmall7.setLocation(77,308);
        wallWidthMedium4.setLocation(308,384);
        wallHeightSmall7.setLocation(81,328);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,369,428);
        wallHeightSmall8.setLocation(146,481);
        wallHeightSmall8.setLocation(162,481);
        wallHeightSmall7.setLocation(77,354);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,437,329);
        wallHeightSmall9.setLocation(438,301);
        wallHeightSmall9.setLocation(439,313);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,427,261);
        wallHeightSmall10.setLocation(434,246);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,438,340);
        wallWidthSmall5.setLocation(438,340);
        wallWidthSmall5.setLocation(632,334);
        wallHeightSmall9.setLocation(442,334);
        wallHeightSmall10.setLocation(431,257);
        removeObject(wallHeightSmall10);
        removeObject(wallWidthSmall5);
        wallHeightSmall9.setLocation(431,340);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,424,244);
        wallWidthSmall6.setLocation(436,216);
        WallHeightSmall wallHeightSmall11 = new WallHeightSmall();
        addObject(wallHeightSmall11,485,260);
        wallHeightSmall11.setLocation(431,266);
        wallWidthSmall6.setLocation(416,224);
        wallWidthSmall6.setLocation(418,223);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,620,393);
        wallWidthSmall7.setLocation(581,384);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,689,324);
        wallWidthSmall8.setLocation(712,324);
        wallWidthSmall8.setLocation(712,440);
        wallWidthSmall8.setLocation(753,446);
        WallHeightSmall wallHeightSmall12 = new WallHeightSmall();
        addObject(wallHeightSmall12,461,332);
        wallHeightSmall12.setLocation(308,302);
        WallHeightSmall wallHeightSmall13 = new WallHeightSmall();
        addObject(wallHeightSmall13,351,452);
        wallHeightSmall13.setLocation(354,522);
        wallHeightSmall13.setLocation(353,487);
        wallHeightSmall13.setLocation(353,478);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,350,441);
        wallWidthSmall9.setLocation(380,452);
        wallWidthSmall9.setLocation(380,452);
        wallWidthSmall9.setLocation(344,440);
        wallHeightSmall13.setLocation(367,474);
        wallWidthSmall9.setLocation(301,428);
        WallHeightSmall wallHeightSmall14 = new WallHeightSmall();
        addObject(wallHeightSmall14,71,129);
        wallHeightSmall14.setLocation(4,87);
        Perro perro = new Perro();
        addObject(perro,216,136);
        perro.setLocation(71,172);
        perro.setLocation(500,416);
        wallHeightSmall13.setLocation(360,456);
        wallHeightSmall13.setLocation(221,491);
        wallWidthSmall9.setLocation(341,446);
        wallHeightSmall13.setLocation(356,478);
        wallWidthSmall9.setLocation(384,448);
        removeObject(wallWidthSmall9);
        removeObject(wallHeightSmall13);
        perro.setLocation(684,86);
        perro.setLocation(52,156);
        wallWidthSmall8.setLocation(758,460);
        wallWidthSmall4.setLocation(236,280);
        wallHeightSmall12.setLocation(239,241);
        wallHeightSmall3.setLocation(236,237);
        wallHeightSmall3.setLocation(244,223);
        wallHeightSmall3.setLocation(238,188);
        WallWidthXSmall wallWidthXSmall3 = new WallWidthXSmall();
        addObject(wallWidthXSmall3,220,313);
        wallWidthXSmall3.setLocation(184,280);
        wallWidthSmall4.setLocation(264,276);
        wallWidthSmall4.setLocation(265,282);
        wallWidthSmall4.setLocation(168,286);
        wallWidthSmall4.setLocation(244,335);
        wallWidthSmall4.setLocation(214,285);
        wallWidthXSmall3.setLocation(232,332);
        removeObject(wallWidthXSmall3);
        WallHeightSmall wallHeightSmall15 = new WallHeightSmall();
        addObject(wallHeightSmall15,628,437);
        wallHeightSmall15.setLocation(647,428);
        WallWidthXSmall wallWidthXSmall4 = new WallWidthXSmall();
        addObject(wallWidthXSmall4,680,415);
        wallWidthXSmall4.setLocation(688,420);
        wallWidthXSmall4.setLocation(695,460);
        Hueso hueso = new Hueso();
        addObject(hueso,517,184);
        hueso.setLocation(300,250);
        removeObject(hueso);
        Hueso hueso2 = new Hueso();
        addObject(hueso2,666,144);
        hueso2.setLocation(751,159);
        Hueso hueso3 = new Hueso();
        addObject(hueso3,204,238);
        hueso3.setLocation(192,248);
        Hueso hueso4 = new Hueso();
        addObject(hueso4,732,419);
        Hueso hueso5 = new Hueso();
        addObject(hueso5,88,440);
        hueso5.setLocation(85,450);
        Hueso hueso6 = new Hueso();
        addObject(hueso6,404,167);
        hueso6.setLocation(431,172);
        perro.setLocation(358,48);
        perro.setLocation(345,40);
        perro.setLocation(177,232);
        perro.setLocation(42,152);
        Chocolate chocolate = new Chocolate();
        addObject(chocolate,486,352);
        chocolate.setLocation(467,348);
        Dueño dueño = new Dueño();
        addObject(dueño,489,471);
        wallHeightSmall8.setLocation(163,498);
    }
}
