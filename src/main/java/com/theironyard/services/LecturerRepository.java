package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by amalabukar on 1/15/17.
 */
public interface LecturerRepository  extends CrudRepository<Lecturer, Integer> {
}
