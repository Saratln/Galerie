/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Sara Toulon
 */
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
public class Tableau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    @NonNull
    private String title;

    @Column
    @NonNull
    private String support;

    @Column
    private int largeur;
    
    @Column
    private int hauteur;
    
    @ManyToOne
    private Artiste auteur;
    
    @ManyToMany(mappedBy = "oeuvres")
    private List<Exposition> accrochages = new LinkedList<>();
     
    @OneToOne(mappedBy= "oeuvre")
    private Transaction vendu;
    
    
}
