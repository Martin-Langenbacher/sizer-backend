package de.langenbachersolar.sizer.sizerbackend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String name;

    private Gender gender;

    enum Gender {
        w,
        m,
        d
    }

    private LocalDateTime birthday;

    private LocalDateTime dateOfEntry;

    private LocalDateTime lastModification;

    // a) Körpermaße in mm --> Im Datenmodel 1850 mm
    private int bodySize;

    private int kopfumfang;
    private int halsumfang;
    private int schulterbreite;
    private int brustumfang;
    private int unterBrustumfang; // not m: w, d only
    private int taillenumfang;
    // private int bundumfang;
    private int hueftumfang;
    private int armlaenge;
    private int beinlaenge;

    // b) Kleidergrößen
    private int schuhgroesse; // Achtung: EU oder US oder ... welche Nummer ???? Ggf. in mm mit Umrechung...!
    // rechter / linker Fuß gleich groß ????
    // Schuhgröße (ggf. unterteilt in Skischuhe, Wanderschuhe, Turnschuhe, ...)
    private int guertellaenge;

    // Hosen / Rock
    private int unterhose;
    private int hose;           // ggf. mit Zusatz? --> slim, ...
    private Groessen jeans;

    // Oberteile
    private Groessen unterhemd;
    private Groessen anzug;
    private Groessen pullover;
    private Groessen bluse; // w, d only
    private Groessen dress; // Kleid: w & d only
    private Groessen tShirt;
    private Groessen herrenHemd; // m & d only


    // !!!!!!!!!!! Vielleicht müssen wir hier etwas anderes machen, und eine Formel für die Umrechung erfinden...
    // denn diese Größen können von Hersteller zu Hersteller unterschiedlich ausfallen... !
    enum Groessen {
        S,
        SM,
        M,
        L,
        XL,
        XXL
    }





    /*
     Jogging-Hose, … Schuhe: Skischuhe, Sport-Schuhe, …. Hemden = … Kragengröße, ….)
Erklärung zu den Größen
Kinder, (weitere Liste - nicht nur die eigene…




--> Next steps:
1) Eigenschaften
2) Controller


- Bootstrap & Timeleaf (Alternative: Bootstrap mit React/REST)



     */



}


