package fpoly.assginment.service.impl;

import fpoly.assginment.entity.DongSP;
import fpoly.assginment.service.RepoInterface;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public class DongSPRepo implements RepoInterface<DongSP,String> {

    @Override
    public List<Entity> getAll() {
        return null;
    }

    @Override
    public DongSP getOne(String id) {
        return null;
    }

    @Override
    public boolean add(DongSP entity) {
        return false;
    }

    @Override
    public boolean update(DongSP entity) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<DongSP> Search(Object... args) {
        return null;
    }

    @Override
    public List<DongSP> sort(Object... args) {
        return null;
    }

    @Override
    public List<String> getAllName() {
        return null;
    }
}
