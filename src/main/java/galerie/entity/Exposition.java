/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author Sara Toulon
 */
// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Exposition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NonNull
    private LocalDate debut;

    @Column(unique = true)
    @NonNull
    private String intitule;

    @Column
    private int duree;

    // Relation avec Exposititon
    @ManyToOne
    @NonNull
    private Galerie organisateur;

    // relation oneToMany vers Transaction
    @ToString.Exclude
    @OneToMany(mappedBy = "lieuDeVente")
    private List<Transaction> ventes = new LinkedList<>();
    public List<Transaction> getTransactions() {
        return ventes;
    }

    @ManyToMany
    @JoinTable(name = "Expo_Tableau",
            joinColumns = @JoinColumn(name = "id_exposition", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_tableau", referencedColumnName = "id"))
    private List<Tableau> oeuvres = new LinkedList<>();

}
