package com.codegym.project.repository;

import com.codegym.project.model.Note;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note, Integer> {
}
