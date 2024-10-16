import java.awt.*;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square field;
    private Circle sun;
    private Circle moon; 
    private boolean moonVisible;
    private Person personizq;
    private Person personder;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-50);
        sun.changeSize(80);
        sun.makeVisible();

        field = new Square();
        field.changeColor("green");
        field.changeSize(2000);
        field.moveVertical(125);
        field.moveHorizontal(-400);
        field.makeVisible();

        {
            for (int i = 0; i < 280; i++) {
                sun.slowMoveVertical(1);
            }
        }

        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-100);
        moon.moveVertical(-60);
        moon.changeSize(40);
        moon.makeVisible();

        personizq = new Person();
        personizq.moveHorizontal(-200);
        personizq.moveVertical(20);
        
        personder = new Person();
        personder.moveHorizontal(200);
        personder.moveVertical(20);
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

    public void amanecer() {
        for (int i = 0; i < 280; i++) {
            sun.slowMoveVertical(-1);
            moon.makeInvisible(); 
            }
        personizq.makeVisible();
        personizq.slowMoveHorizontal(80);  
        personder.makeVisible();
        personder.slowMoveHorizontal(-180);
    }
}
