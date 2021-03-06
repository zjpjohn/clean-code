package com.acnebs.posts.functionaldao.imperative;
import java.util.List;

/**
 * Class StuffDaoDummyImpl.
 * <p>
 * Created by andreas.czakaj on 05.03.2016
 *
 * @author andreas.czakaj
 */
class StuffDaoDummyImpl implements StuffDao {

    private List<Stuff> database;

    public StuffDaoDummyImpl(final List<Stuff> database) {
        this.database = database;
    }

    @Override
    public List<Stuff> loadAllStuff() {
        return database;
    }
}
