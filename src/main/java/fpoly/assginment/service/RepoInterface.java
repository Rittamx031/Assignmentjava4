package fpoly.assginment.service;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface RepoInterface<EntityType, KeyType> {
    abstract public List<Entity> getAll();
    abstract public EntityType getOne(KeyType id);
    abstract public boolean add(EntityType entity);
    abstract public boolean update(EntityType entity);
    abstract public boolean delete(KeyType id);
    abstract List<EntityType> Search(Object...args);
    abstract List<EntityType> sort(Object...args);
    abstract List<String> getAllName();
}
