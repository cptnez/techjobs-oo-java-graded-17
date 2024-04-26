package org.launchcode.techjobs.oo;

import org.junit.Test;

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
    Job getJobFullConstructorTwo = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence")) ;

    @Test
    public void testSettingJobId(){
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }
@Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(jobFullConstructor.getName() instanceof String);
        assertTrue(jobFullConstructor.getEmployer() instanceof Employer);
        assertTrue(jobFullConstructor.getLocation() instanceof Location);
        assertTrue(jobFullConstructor.getPositionType() instanceof PositionType);
        assertTrue(jobFullConstructor.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(jobFullConstructor.getName(), "Product tester");
        assertEquals(jobFullConstructor.getEmployer().toString(), "ACME");
        assertEquals(jobFullConstructor.getLocation().toString(), "Desert");
        assertEquals(jobFullConstructor.getPositionType().toString(), "Quality control");
        assertEquals(jobFullConstructor.getCoreCompetency().toString(), "Persistence");
}
@Test
    public void testJobsForEquality() {
    assertNotEquals(jobFullConstructor.getId(), getJobFullConstructorTwo.getId());
}
}
