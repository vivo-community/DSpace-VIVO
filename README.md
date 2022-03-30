# DSpace-VIVO
Integration project of DSpace metadata with VIVO 
For now: `dspace2vivo` pipeline

# Quick dive
## Tested with: 
- Linux Ubuntu 20.04
- Java 1.8
- Maven 3.6.3

## Exécution
1. Move in directory: `relang/org.vivoweb.dspacevivo.installer`
2. edit the file `00-env-sample-sh` , adjust values for JAVA_HOME and MAVEN_HOME and save it as `00-env.sh` if necessary.
3. Run the following script sequence to execute the test
```sh
01-install-lib.sh
02-compile-model.sh
03-test-Item-model.sh
```
4. expected result
```sh
class Item {
    id: 123456789/4
    dspaceBitstreamURL: http://localhost:4000/bitstream/123456789/3/1/pdf1.pdf
    dspaceIsPartOfCollectionID: 123456789/2
    uri: http://localhost:4000/handle/123456789/3
    url: http://localhost:4000/items/948d534a-e1d9-41b2-bb23-1ae2fe9cff4f
    listOfStatements: [class Statement {
        subjectUri: http://localhost:4000/handle/123456789/3
        predicateUri: dcterms:isPartOf
        objectUri: http://localhost:4000/handle/123456789/3
    }, class Statement {
        subjectUri: http://localhost:4000/handle/123456789/3
        predicateUri: bibo:uri
        objectUri: http://localhost:4000/handle/123456789/3
    }]
    listOfStatementLiterals: [class StatementLiteral {
        subjectUri: http://localhost:4000/handle/123456789/3
        predicateUri: dc:creator
        objectLiteral: Michel Héon
        literalType: xsd:string
    }]
}
{
  "id" : "123456789/4",
  "dspaceBitstreamURL" : "http://localhost:4000/bitstream/123456789/3/1/pdf1.pdf",
  "dspaceIsPartOfCollectionID" : "123456789/2",
  "uri" : "http://localhost:4000/handle/123456789/3",
  "url" : "http://localhost:4000/items/948d534a-e1d9-41b2-bb23-1ae2fe9cff4f",
  "listOfStatements" : [ {
    "subjectUri" : "http://localhost:4000/handle/123456789/3",
    "predicateUri" : "dcterms:isPartOf",
    "objectUri" : "http://localhost:4000/handle/123456789/3"
  }, {
    "subjectUri" : "http://localhost:4000/handle/123456789/3",
    "predicateUri" : "bibo:uri",
    "objectUri" : "http://localhost:4000/handle/123456789/3"
  } ],
  "listOfStatementLiterals" : [ {
    "subjectUri" : "http://localhost:4000/handle/123456789/3",
    "predicateUri" : "dc:creator",
    "objectLiteral" : "Michel Héon",
    "literalType" : "xsd:string"
  } ]
}
```
# General information about the repo

## Edit DSPACE2VIVO metamodel
 [dspace2vivo.yaml](https://editor.swagger.io/?url=https://raw.githubusercontent.com/vivo-community/DSpace-VIVO/dev-heon/bundles/org.vivoweb.dspacevivo.model.openapi/dspace2vivo.yaml)

## Repo directory structure
The repo encompasses the following directory structure:
```txt
├── bundles
│   ├── org.vivoweb.dspacevivo
│   │   ├── src
│   │   │   ├── main
│   │   │   │   ├── java
│   │   │   │   └── resources
│   │   │   └── test
│   │   │       ├── java
│   │   │       └── resources
│   │   └── target
│   └── org.vivoweb.dspacevivo.model.openapi
│       ├── src
│       │   ├── main
│       │   │   ├── java
│       │   │   │   └── ca
│       │   │   │       └── uqam
│       │   │   │           └── dspacevivo
│       │   │   │               └── model
│       │   │   └── webapp
│       │   │       └── WEB-INF
│       │   └── test
│       │       ├── java
│       │       │   ├── ca
│       │       │   │   └── uqam
│       │       │   │       └── dspacevivo
│       │       │   │           └── model
│       │       └── resources
│       │           ├── dspace-rdfizer-sample
│       │           ├── json-schema-validation
│       │           └── specFiles
│       └── target
└── releng
    ├── org.vivoweb.dspacevivo.installer
    │   └── src
    │       └── site
    └── org.vivoweb.dspacevivo.model.conceptual
```
The `releng` ( release engineering ) and `bundles` directories are the two root directories of the project. 
### about releng
`releng` contains the packages necessary to manage the engineering of the current and future packages of the project including the directory `org.vivoweb.dspacevivo.installer` containing the installation management scripts and the directory `org.vivoweb.dspacevivo.model.conceptual` containing the project explanatory models
### about bundles
the `bundles` directory encapsulates the project code. 
