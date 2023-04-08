/**
 * Assignment 5 
 * TCSS 305
 */
package view;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 *  @author embabazi
 * @version 1
 */
public class ToolBar extends JToolBar {
    /**
     * 
     */
    private static final long serialVersionUID = 6431099761863871361L;
    /** A button group for the tool bar buttons. */
    private final ButtonGroup myButtonGroup;

    /**
     * Constructs the toolbar.
     */
    public ToolBar() {
        super();
        myButtonGroup = new ButtonGroup();
    }

    /**
     * Create a JToggleButton for the ToolBar.
     * 
     * @param theAction to associate with the created JToggleButton
     */
    public void createToggleButton(final Action theAction) {
        final JToggleButton toggleButton = new JToggleButton(theAction);
        if ("Line".equals(toggleButton.getName())) {
            toggleButton.setSelected(true);
        }
        myButtonGroup.add(toggleButton);
        add(toggleButton);
    }


}
