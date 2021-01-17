/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Tableau;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sara Toulon
 */
public interface TableauRepository extends JpaRepository<Tableau, Integer>  {
    
}
