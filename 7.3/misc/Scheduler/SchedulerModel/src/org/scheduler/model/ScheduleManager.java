/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scheduler.model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author geertjan
 */
public class ScheduleManager {
    
    public static List<Doctor> getDoctors() {
        return Arrays.asList(
                new Doctor("Dr. Tom"),
                new Doctor("Dr. Frank"),
                new Doctor("Dr. Susan"),
                new Doctor("Dr. Jason")
                );
    }
    
    public static List<Patient> getPatients() {
        return Arrays.asList(
                new Patient("Jack", new Doctor("Dr. Jason"), new Doctor("Dr. Frank")),
                new Patient("Peter", new Doctor("Dr. Tom"), new Doctor("Dr. Frank"))
                );
    }
    
}
