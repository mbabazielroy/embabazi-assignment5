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
public class EllipseToolAction extends AbstractTool {
    /**
     * 
     */
    private static final long serialVersionUID = 8245379404069505447L;
    /** Name of the Ellipse. */
    private static final String NAME = "Ellipse";
    /**
     * The image Icon for the Ellipse.*/

    private static final ImageIcon THE_ICON = new ImageIcon("files/ellipse_bw.gif");


    /**
     * Construct Elipse action.
     * 
     * @param thePanel panel associated with this action.
     */
    public EllipseToolAction(final DrawingPanel thePanel) {
        super(NAME,  thePanel, THE_ICON);
    }
}