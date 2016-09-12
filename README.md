## Diagram og markup
Vi har Jens Egeberg og Jonas Schelde dannet os overblikket over den tildelte historie, og har ud fra det lavet
* Domain Model 1
* Design WireFrames
[Draw Diagram](https://www.draw.io/?chrome=0&lightbox=1&nav=1#G0B05IzH4qFSxSTGVUQzhEMnQtd00)

## Cup Cake Webshop
For at starte selve applikationen, er selve projektet pakket med en server, en database og alle filer knytter sammen der, i filen "webshop-ready-to-run"
Du skal åbne den fra en terminal eller kommando linje med: "java -jar (stien til filen her)"

Herefter, kan du åbne "localhost:8080" og se den kørende app.

> OBS - sql filen er kun til fremvisning, der er indlagt creation af tables i opstarten af den embedded TomCat server der ligger i Jar Filen.

## Projekt mappen
Projektet er skrevet i IntelliJ IDEA, som et gradle projektet, for at få automatisk hentet alle 'dependencies' til bootRun og Hibernate databasen.

Det er også muligt at bruge netbeans, det kræver man installerer et gradle plugin inden.
Det kan man finde her: [Netbean's Site | Gradle Plugin](http://plugins.netbeans.org/plugin/44510/gradle-support)

## NB
sql fil til at bygge SQL tabeller er vedhæftet
Jar filens indhold er lagt som zip'et mappe, til inspektion.
Opgaven er lavet med disse meget brugte og kendte frameworks:
* Materialize (CSS & JS)
* Spring (Java Framework)
* Hibernate (SQL Framework)
* Tomcat (Embedded web server)
* H2 (Hibernate SQL Database)