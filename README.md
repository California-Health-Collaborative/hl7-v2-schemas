# HL7 v2 Validation XML Schema

This project contains the XML schema used for hl7 v2 message validation.
The XSD files are located under **src/main/resources/hl7-v2-schemas** 

## HL7 v2 Schema Utils

This project contains utils function to access the schemas (without using absolute or relative paths)
For each schema file, a util function is made available to get the resource as an **InputStream** or as an instance of the **Schema** class

```java

// -- Profile.xsd (Profile)

// Get InputStream
HL7v2Schema.getProfile()
// Get Schema
HL7v2Schema.getProfileSchema()

// -- CoConstraintContext.xsd (Co-Constraints)

// Get InputStream
HL7v2Schema.getCoConstraints()
// Get Schema
HL7v2Schema.getCoConstraintsSchema()

// -- ConformanceContext.xsd (Constraints & Predicates)

// Get InputStream
HL7v2Schema.getConformanceContext()
// Get Schema
HL7v2Schema.getConformanceContextSchema()

// -- ProfileSlicing.xsd (Slicing)

// Get InputStream
HL7v2Schema.getSlicing()
// Get Schema
HL7v2Schema.getSlicingSchema()

// -- ValueSetBindings.xsd (Value Set and Single Code bindings)

// Get InputStream
HL7v2Schema.getValueSetBindings()
// Get Schema
HL7v2Schema.getValueSetBindingsSchema()

// -- ValueSets.xsd (Value Set Library)

// Get InputStream
HL7v2Schema.getValueSetLibrary()
// Get Schema
HL7v2Schema.getValueSetLibrarySchema()

```

This project also includes an implementation of LSResourceResolver necessary to resolve XSD dependencies

_E.g. ConformanceContext.xsd includes Expression.xsd, the resource resolver is used to resolve references to Expression.xsd from ConformanceContext.xsd_

When needed please use the provided implementation

```java
HL7v2SchemaResourceResolver resourceResolver = new HL7v2SchemaResourceResolver();
```