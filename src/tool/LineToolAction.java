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
public class LineToolAction extends AbstractTool {
    /**
     * 
     */
    private static final long serialVersionUID = -1112821865778366787L;
    /**
     * Line's name in a string.
     */
    private static final String NAME = "Line";
    /**
     * The image Icon for the Line.
     */
    private static final ImageIcon THE_ICON = new ImageIcon("files/line_bw.gif");

    /**
     * Construct line action.
     * 
     * @param thePanel panel associated with this action.
     */
    public LineToolAction(final DrawingPanel thePanel) {
        super(NAME, thePanel, THE_ICON);
    }
}
