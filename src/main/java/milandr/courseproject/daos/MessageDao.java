package milandr.courseproject.daos;

import milandr.courseproject.entities.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDao extends CrudRepository<Message, Long> {
}
