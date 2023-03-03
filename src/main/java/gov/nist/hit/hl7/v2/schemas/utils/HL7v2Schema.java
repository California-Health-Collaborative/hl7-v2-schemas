package gov.nist.hit.hl7.v2.schemas.utils;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.InputStream;

public class HL7v2Schema {

    public static final String SCHEMA_FOLDER = "hl7-v2-schemas";
    private static final SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    static {
        factory.setResourceResolver(new HL7v2SchemaResourceResolver());
    }

    public static InputStream getProfile() {
        return HL7v2Schema.class.getResourceAsStream(getSchemaPath("Profile.xsd"));
    }

    public static Schema getProfileSchema() throws SAXException {
        return factory.newSchema(new StreamSource(getProfile()));
    }

    public static InputStream getCoConstraints() {
        return HL7v2Schema.class.getResourceAsStream(getSchemaPath("CoConstraintContext.xsd"));
    }

    public static Schema getCoConstraintsSchema() throws SAXException {
        return factory.newSchema(new StreamSource(getCoConstraints()));
    }

    public static InputStream getConformanceContext() {
        return HL7v2Schema.class.getResourceAsStream(getSchemaPath("ConformanceContext.xsd"));
    }

    public static Schema getConformanceContextSchema() throws SAXException {
        return factory.newSchema(new StreamSource(getConformanceContext()));
    }

    public static InputStream getSlicing() {
        return HL7v2Schema.class.getResourceAsStream(getSchemaPath("ProfileSlicing.xsd"));
    }

    public static Schema getSlicingSchema() throws SAXException {
        return factory.newSchema(new StreamSource(getSlicing()));
    }

    public static InputStream getValueSetBindings() {
        return HL7v2Schema.class.getResourceAsStream(getSchemaPath("ValueSetBindings.xsd"));
    }

    public static Schema getValueSetBindingsSchema() throws SAXException {
        return factory.newSchema(new StreamSource(getValueSetBindings()));
    }

    public static InputStream getValueSetLibrary() {
        return HL7v2Schema.class.getResourceAsStream(getSchemaPath("ValueSets.xsd"));
    }

    public static Schema getValueSetLibrarySchema() throws SAXException {
        return factory.newSchema(new StreamSource(getValueSetLibrary()));
    }


    public static String getSchemaPath(String filename) {
        return "/" + SCHEMA_FOLDER + "/" + filename;
    }
}
