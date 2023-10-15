package no.jlwcrews.jdbcdemo.repository;

import no.jlwcrews.jdbcdemo.model.Part;
import org.springframework.data.repository.ListCrudRepository;

public interface PartRepository extends ListCrudRepository<Part, Integer> {
}
