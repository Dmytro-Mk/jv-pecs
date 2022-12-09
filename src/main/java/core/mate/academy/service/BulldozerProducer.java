package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Machine> {
    @Override
    public List<Machine> get() {
        Bulldozer firstBulldozer = new Bulldozer();
        Bulldozer secondBulldozer = new Bulldozer();
        List<Machine> list = new ArrayList<>();
        list.add(firstBulldozer);
        list.add(secondBulldozer);
        return list;
    }
}
