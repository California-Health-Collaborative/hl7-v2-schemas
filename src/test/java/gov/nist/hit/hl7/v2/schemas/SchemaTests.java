package gov.nist.hit.hl7.v2.schemas;

import static org.junit.Assert.*;

import gov.nist.hit.hl7.v2.schemas.utils.HL7v2Schema;
import gov.nist.hit.hl7.v2.schemas.utils.HL7v2SchemaResourceResolver;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;


public class SchemaTests {

    @Test
    public void checkProfile() throws SAXException {
        assertNotNull(HL7v2Schema.getProfile());
        assertNotNull(HL7v2Schema.getProfileSchema());
    }

    @Test
    public void checkCoConstraintsExists() throws SAXException {
        assertNotNull(HL7v2Schema.getCoConstraints());
        assertNotNull(HL7v2Schema.getCoConstraintsSchema());
    }

    @Test
    public void checkConformanceContext() throws SAXException {
        assertNotNull(HL7v2Schema.getConformanceContext());
        assertNotNull(HL7v2Schema.getConformanceContextSchema());
    }

    @Test
    public void checkSlicing() throws SAXException {
        assertNotNull(HL7v2Schema.getSlicing());
        assertNotNull(HL7v2Schema.getSlicingSchema());
    }

    @Test
    public void checkValueSetBindings() throws SAXException {
        assertNotNull(HL7v2Schema.getValueSetBindings());
        assertNotNull(HL7v2Schema.getValueSetBindingsSchema());
    }

    @Test
    public void checkValueSetLibrary() throws SAXException {
        assertNotNull(HL7v2Schema.getValueSetLibrary());
        assertNotNull(HL7v2Schema.getValueSetLibrarySchema());
    }

}
