/**
 * Assignment 5
 * TCSS 305
 */
package tool;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import view.DrawingPanel;

/**
 *  @author embabazi
 * @version 1
 */
public class ColorChooserAction extends AbstractAction {
    /**
     * 
     */
    private static final long serialVersionUID = 219135197508728403L;
//    /**
//     * The color for some elements in the GUI.
//     */
//    private static final Color UW_PURPLE = new Color(51, 0, 111);
    /** The menu bar associated with the Action. */
    private final JMenuBar myMenuBar;

    /** The panel associated with the Action. */
    private final DrawingPanel myPanel;

    /**
     * Construct line action.
     * 
     * @param theMenuBar the menu bar associated with this color chooser.
     * @param thePanel the panel of the color chooser.
     */
    public ColorChooserAction(final JMenuBar theMenuBar, final DrawingPanel thePanel) {
        super("Color...");
        myMenuBar = theMenuBar;
        myPanel = thePanel;
        putValue(Action.SELECTED_KEY, true);
    }

    /** {@inheritDoc} */
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        final Color color = JColorChooser.showDialog(null, "Select a Color", 
                myPanel.getColor());
        JMenu jMenu = new JMenu();
        jMenu = (JMenu) myMenuBar.getComponent(2);
        jMenu.getMenuComponent(0).setBackground(color);
        myPanel.setColor(color);
    }
}
