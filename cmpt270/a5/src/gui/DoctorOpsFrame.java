/**
 * @author Yuwen Liu
 * @SN 11219371
 * @NSID yul905
 * @version 1.0
 */
package gui;

import javax.swing.JFrame;

import entities.Doctor;
import startup.HospitalSystem;

/**
 * The frame for the window to display the operations that involve patients.
 */
public class DoctorOpsFrame extends JFrame {
    /** The standard width for the frame. */
    public static final int DEFAULT_WIDTH = 350;

    /** The standard height for the frame. */
    public static final int DEFAULT_HEIGHT = 200;

    /**
     * Create the frame for the operations that involve patients.
     */
    public DoctorOpsFrame() {
        setTitle("Doctor Operations");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        DoctorOpsPanel panel = new DoctorOpsPanel();
        add(panel);
    }

    /**
     * A main to run the GUI version of the hospital system that only involves patient operations
     * and the ward.
     */
//    public static void main(String[] args) {
//        HospitalSystem system = new HospitalSystem();
//        system.initialize();
//        PatientOpsFrame frame = new PatientOpsFrame();
//        frame.setLocation(300, 300);
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        frame.setVisible(true);
//    }

    public static final long serialVersionUID = 1;
}
