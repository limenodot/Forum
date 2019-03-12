package milandr.courseproject.daos;

import milandr.courseproject.entities.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicDao extends CrudRepository<Topic, Long> {
}
