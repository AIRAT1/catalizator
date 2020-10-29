package de.catalizator.repo;

import de.catalizator.domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}
