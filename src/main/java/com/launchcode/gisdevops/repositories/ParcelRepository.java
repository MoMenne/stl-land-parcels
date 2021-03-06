package com.launchcode.gisdevops.repositories;

import com.launchcode.gisdevops.models.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mikemenne on 1/2/18.
 */

// add a note about JPA Repository
@Repository
public interface ParcelRepository extends JpaRepository<Parcel, Integer> {


}
