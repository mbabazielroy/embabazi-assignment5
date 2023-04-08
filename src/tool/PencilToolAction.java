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
public class PencilToolAction extends AbstractTool {
    /**
     * 
     */
    private static final long serialVersionUID = -953226594135036300L;
    /** The name of the pencil tool. */
    private static final String NAME = "Pencil";
    /**
     * The image Icon for the Pencil.
     */
    private static final ImageIcon THE_ICON = new ImageIcon("files/pencil_bw.gif");
   
    /**
     * Construct pencil action.
     * 
     * @param thePanel panel associated with this action.
     */
    public PencilToolAction(final DrawingPanel thePanel) {
        super(NAME, thePanel, THE_ICON);

    }
}
