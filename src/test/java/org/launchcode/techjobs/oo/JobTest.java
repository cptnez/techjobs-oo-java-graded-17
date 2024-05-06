package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import javax.crypto.spec.PSource;
import java.util.Locale;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    Job jobOne = new Job();
    Job jobTwo = new Job();
    Job jobFullConstructor =  new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence")) ;
    Job jobFullConstructorTwo = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence")) ;
    Job jobEmptyField = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("")) ;


    @Test
    public void testSettingJobId(){
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertNotNull(jobFullConstructor.getName());
        assertNotNull(jobFullConstructor.getEmployer());
        assertNotNull(jobFullConstructor.getLocation());
        assertNotNull(jobFullConstructor.getPositionType());
        assertNotNull(jobFullConstructor.getCoreCompetency());

        assertEquals(jobFullConstructor.getName(), "Product tester");
        assertEquals(jobFullConstructor.getEmployer().toString(), "ACME");
        assertEquals(jobFullConstructor.getLocation().toString(), "Desert");
        assertEquals(jobFullConstructor.getPositionType().toString(), "Quality control");
        assertEquals(jobFullConstructor.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        assertNotEquals(jobFullConstructor.getId(), jobFullConstructorTwo.getId());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String expected =
                System.lineSeparator() +
                        "ID: " + jobFullConstructor.getId() + "\r\n" +
                        "Name: " + jobFullConstructor.getName() + "\r\n" +
                        "Employer: " + jobFullConstructor.getEmployer() + "\r\n" +
                        "Location: " + jobFullConstructor.getLocation() + "\r\n" +
                        "Position Type: " + jobFullConstructor.getPositionType() + "\r\n" +
                        "Core Competency: " + jobFullConstructor.getCoreCompetency() +
                        System.lineSeparator();

        assertEquals(expected, jobFullConstructor.toString());
    }
    @Test
   public void testToStringHandlesEmptyField() {
        String expected =
                System.lineSeparator() +
                        "ID: " + jobEmptyField.getId() + "\r\n" +
                        "Name: " + jobEmptyField.getName() + "\r\n" +
                        "Employer: " + jobEmptyField.getEmployer() + "\r\n" +
                        "Location: " + jobEmptyField.getLocation() + "\r\n" +
                        "Position Type: " + jobEmptyField.getPositionType() + "\r\n" +
                        "Core Competency: " + "Data not available" +
                        System.lineSeparator();
        assertEquals(expected, jobEmptyField.toString());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        assertTrue(jobFullConstructor.toString().startsWith(System.lineSeparator()));
        assertTrue(jobFullConstructor.toString().endsWith(System.lineSeparator()));
    }


}



