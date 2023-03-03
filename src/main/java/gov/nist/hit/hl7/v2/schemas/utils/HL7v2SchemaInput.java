package gov.nist.hit.hl7.v2.schemas.utils;

import org.w3c.dom.ls.LSInput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class HL7v2SchemaInput implements LSInput {
    String publicId;
    String systemId;
    String baseURI;
    String content;

    public HL7v2SchemaInput(InputStream inputStream, String publicId, String systemId, String baseURI) {
        this.publicId = publicId;
        this.systemId = systemId;
        this.baseURI = baseURI;
        if(inputStream != null) {
            this.content = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"));
        }
    }

    public String getStringData() {
        return this.content;
    }

    public Reader getCharacterStream() {
        return null;
    }

    public InputStream getByteStream() {
        return null;
    }

    public String getSystemId() {
        return systemId;
    }

    public String getPublicId() {
        return publicId;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public String getEncoding() {
        return null;
    }

    public boolean getCertifiedText() {
        return false;
    }

    public void setStringData(String stringData) {}
    public void setCharacterStream(Reader characterStream) {}
    public void setByteStream(InputStream byteStream) {}
    public void setSystemId(String systemId) {}
    public void setPublicId(String publicId) {}
    public void setBaseURI(String baseURI) {}
    public void setEncoding(String encoding) {}
    public void setCertifiedText(boolean certifiedText) {}
}
