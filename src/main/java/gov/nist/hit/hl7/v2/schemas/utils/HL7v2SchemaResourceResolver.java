package gov.nist.hit.hl7.v2.schemas.utils;

import org.w3c.dom.ls.LSResourceResolver;

import java.io.InputStream;

public class HL7v2SchemaResourceResolver implements LSResourceResolver {

    public HL7v2SchemaInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
        InputStream content = HL7v2SchemaResourceResolver.class.getResourceAsStream(HL7v2Schema.getSchemaPath(systemId));
        return new HL7v2SchemaInput(content, publicId, systemId, baseURI);
    }
}
