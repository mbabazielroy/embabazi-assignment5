/**
 * Assignment 5 
 * TCSS 305
 */
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/**
 *  @author embabazi
 * @version 1
 */
public class MenuBar extends JMenuBar implements PropertyChangeListener {
    /**
     * 
     */
    private static final long serialVersionUID = 5277900625219346262L;

    //    /**
    //     * Array of the thickness options to be made.
    //     */
    //    private static final int[] BUTTONS = {1};

    /**
     * The minor tick spacing for the slider.
     */
    private static final int MINOR_TICK_SPACING = 1;

    /**
     * The major tick spacing for the slider.
     */
    private static final int MAJOR_TICK_SPACING = 5;
    /**
     * The initial frames per second at which the simulation will run.
     */
    private static final int INITIAL_SIZE = 3;
    /**
     * The maximum frames per second at which the simulation will run.
     */
    private static final int MAX_SIZE = 15;
    /**Husky gold color.*/
    private static final Color UW_GOLD = new Color(232, 211, 162);
    /**
     * The slider for pencil size.
     */
    private JSlider mySlider;
    /** the file options. */
    private final JMenu myOptionsMenu = new JMenu("Options");
    /** the file tools. */
    private final JMenu myToolsMenu = new JMenu("Tools");
    /** the help menu. */
    private final JMenu myHelpMenu = new JMenu("Help");
    /** the button group for tool menu items. */
    private final ButtonGroup myToolGroup = new ButtonGroup();
    /** A button to clear the DrawingPanel. */
    private final JMenuItem myClearButton = new JMenuItem("Clear");
    /** A menu item for the Thickness radio buttons. */
    private final JMenu myThickness = new JMenu("Thickness");
    /** the button to pull up the about index. */
    private final JMenuItem myAbout = new JMenuItem("About...");
    /** the checkBox to fill the shape.*/
    private final JCheckBox  myFillCheckBox = new JCheckBox("Fill");
    /**the fill color button.*/
    private final JMenuItem myFillColor = new JMenuItem("Fill Color...");
    /**An image for the Frame.*/
    private final ImageIcon myImg = new ImageIcon("files/w_small.png");

    /**
     * Constructs the menu bar.
     */
    public MenuBar() {
        super();
        setUpMenu();
    }

    /**
     * Sets up the menu bar.
     */
    private void setUpMenu() {
        myAbout.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent theEvent) {
                JOptionPane.showMessageDialog(null,
                        "Mbabazi Elroy\n Autumn 2022",
                        "TCSS 305 Paint",
                        JOptionPane.PLAIN_MESSAGE, myImg);
            }
        });
        myOptionsMenu.add(myThickness);  
        myOptionsMenu.addSeparator();

        myHelpMenu.add(myAbout);

        //        myPanel.setFill(UW_GOLD); 

        add(myOptionsMenu);
        add(myToolsMenu);
        add(myHelpMenu);

    }


    /**
     * Creates a radio button menu item, associates an action with the button,
     *  adds the button to the Tools menu.
     * 
     * @param theAction the Action to associate with the new button being
     *          created.
     */
    public void createToolMenuButton(final Action theAction) {
        final JRadioButtonMenuItem createdButton = new JRadioButtonMenuItem(theAction);
        if ("Line".equals(createdButton.getName())) {
            createdButton.setSelected(true);
        }
        myToolGroup.add(createdButton);
        myToolsMenu.add(createdButton);
    }

    /**
     * Creates a slider menu item, associates a PropertyChangeListener,
     * adds the slider to the thickness button and the menu.
     * 
     * @param theName of the button.
     * @param thePanel the area in which the thickness is changed on.
     * @param theAmount the # the button holds.
     */
    private void createThicknessButton(final DrawingPanel thePanel) {
        //final int theAmount) {
        mySlider = new JSlider(SwingConstants.HORIZONTAL, 0, MAX_SIZE,
                INITIAL_SIZE);
        mySlider.setMajorTickSpacing(MAJOR_TICK_SPACING);
        mySlider.setMinorTickSpacing(MINOR_TICK_SPACING);
        mySlider.setPaintLabels(true);
        mySlider.setPaintTicks(true);
        /** Called in response to slider events in this window. */
        mySlider.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(final PropertyChangeEvent theEvent) {
                final int thickness = mySlider.getValue();
                thePanel.setThickness(thickness);
            }

        });
        myThickness.add(mySlider);
        //        myOptionsMenu.add(myThickness);  
        //        myOptionsMenu.addSeparator();
    }

    /**
     * Creates buttons for thickness.
     * 
     * @param thePanel the panel in which the thickness will be changed.
     */
    public void createThicknessButtons(final DrawingPanel thePanel) {

        //for (int i = 0; i < BUTTONS.length; i++) {
        createThicknessButton(thePanel); //, BUTTONS[i]);
        //}
    }

    /**
     * Creates a button, associates it with an action,
     * adds the button to the Tool's menu.
     * 
     * @param theAction Action to associate with the new button being created.
     */
    public void createColorMenuButton(final Action theAction) {
        final JMenuItem createdButton = new JMenuItem(theAction);
        createdButton.setSelected(false);
        myOptionsMenu.add(createdButton);
    }

    /**
     * Menu Item that opens and handles the drawing Color Chooser and sets the new value
     * into the Drawing Panel.
     */
    public void drawColor(final DrawingPanel thePanel) {
        myFillColor.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent theEvent) {
                final Color fillColor = JColorChooser.showDialog(null, 
                        "Fill Color Chooser", thePanel.getFillColor());  
                thePanel.setFill(fillColor);
            }
        });
        myOptionsMenu.add(myFillColor);
    }
    /**
     * Creates and returns a CheckBox menu item telling the application whether to 
     * fill the shapes.
     */
    /**
     * Creates and returns a CheckBox menu item telling the application whether to 
     * fill the shapes.
     */
    public void fillCheckBox(final DrawingPanel thePanel) {
        myFillCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent theEvent) {
                //firePropertyChange("fill", false, true);
                if (myFillCheckBox.isSelected()) {
                    thePanel.fillBox(true);
                } else {
                    thePanel.fillBox(false);
                }
            }
        });
        myOptionsMenu.addSeparator();
        myOptionsMenu.add(myFillCheckBox);
    }
    /**
     * Sets up the clear button to work for the specified Jpanel.
     * 
     * @param thePanel the JPanel to be cleared.
     */
    public void setUpClearButton(final DrawingPanel thePanel) {
        myClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                thePanel.clear();
                firePropertyChange("clear", false, true);
            }
        }); 
        myOptionsMenu.addSeparator();
        myClearButton.setEnabled(false);
        myOptionsMenu.add(myClearButton);
    }

    @Override
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if ("clear".equals(theEvent.getPropertyName())) {                
            myClearButton.setEnabled((boolean) theEvent.getNewValue()); //enable "Clear"
        }
        //        if ("fill".equals(theEvent.getPropertyName())) {
        //            myFillCheckBox.setEnabled("Rectangle".equals(theEvent.getNewValue()));
        //        }
    }
}
