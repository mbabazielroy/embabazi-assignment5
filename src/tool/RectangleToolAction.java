/**
 * Assignment 5 
 * TCSS 305
 */
package tool;

import javax.swing.ImageIcon;

import view.DrawingPanel;

/**
 *  @author embabazi
 * @version 1
 */
public class RectangleToolAction extends AbstractTool {
    /**
     * 
     */
    private static final long serialVersionUID = -7142051778677400200L;
    /** Name of the Rectangle. */
    private static final String NAME = "Rectangle";
    /**
     * The Image Icon of the Rectangle.
     */
    private static final ImageIcon THE_ICON = new ImageIcon("files/rectangle_bw.gif");

    /**
     * Construct Rectangle action.
     * 
     * @param thePanel panel associated with this action.
     */
    public RectangleToolAction(final DrawingPanel thePanel) {
        super(NAME, thePanel, THE_ICON);
    }
}