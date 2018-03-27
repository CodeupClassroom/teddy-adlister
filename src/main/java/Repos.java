import models.GhRepo;

import java.util.List;

public interface Repos {
    List<GhRepo> findAll();
    GhRepo findOne(long id);
    List<String> getCommits(long id);
}
