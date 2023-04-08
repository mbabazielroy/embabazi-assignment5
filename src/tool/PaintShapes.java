package tool;

import java.awt.Color;
import java.awt.Shape;

public class PaintShapes {
    /**Shape of element.*/
    private final Shape myShape;

    /**Draw color of element.*/
    private final Color myColor;

    /**Fill color of element.*/
    private final Color myFillColor;

    /**Says if element is filled.*/
    private final boolean myShapeFilled;

    /**Thickness of element.*/
    private final int myThickness;

    /**
     * Constructor which initializes the fields above.
     * @param theShape shape of element
     * @param theDrawColor draw color of element
     * @param theFillColor fill color of element
     * @param theFilled whether or not element filled
     * @param theThickness the thickness of the element
     */
    public PaintShapes(final Shape theShape, final Color theColor,
            final Color theFillColor, final boolean theFilled,
            final int theThickness) {
        myShape = theShape;
        myColor = theColor;
        myFillColor = theFillColor;
        myShapeFilled = theFilled;
        myThickness = theThickness;
    }

    /**
     * Get the shape of the element.
     * @return name of shape.
     */
    public Shape getShape() {
        return myShape;
    }
    
    /**
     * Get the thickness of the element.
     * @return thickness.
     */
    public int getThickness() {
        return myThickness;
    }

    /**
     * Get the draw color of the element.
     * @return draw color.
     */
    public Color getColor() {
        return myColor;
    }

    /**
     * Get the fill color of the element.
     * @return fill color.
     */
    public Color getFillColor() {
        return myFillColor;
    }

    /**
     * Get whether or not element filled.
     * @return boolean true if filled.
     */
    public boolean isFilled() {
        return myShapeFilled;
    }
}
