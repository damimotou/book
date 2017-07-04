package ua.mega.dataaccess;

import ua.mega.domain.Action;

import java.util.List;

public interface ActionDao {
    public void create(Action newAction);
    public List<Action> getIncompleteActions(String userId);
    public void update(Action actionToUpdate) throws RecordNotFoundException;
    public void delete(Action oldAction) throws RecordNotFoundException;
}
