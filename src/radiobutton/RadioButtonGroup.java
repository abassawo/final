package radiobutton;

import java.awt.*;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 *
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 *
 *
 * For timing's sake and space the button groups here are being represented as an array of integers with possible values
 * from 0 to 1. 0 representing unselected, and 1 representing selected.
 */


public class RadioButtonGroup {
    private int[] buttons;

    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons
     *   The number of buttons in the group.
     * @param initial
     *   The button number that is initially selected.
     * @raise RuntimeException
     *   The initial button number is invalid.
     */
    public RadioButtonGroup(int numButtons, int initial) {
        buttons = new int[numButtons];
        buttons[initial] = 1;
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     * @param button
     *   The button number to select.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public void select(int button) {
        //enable
        buttons[button] = 1;

        //disable other buttons
        for(int i : buttons){
            if(i != button) {
                buttons[i] = 0;
            }
        }
    }

    /**
     * Returns whether a given button is selected.
     * @param button
     *   The button number to check.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public boolean isSelected(int button) {
        return buttons[button] == 1;
    }


    // TODO: Add attributes and helper methods as needed.

}
