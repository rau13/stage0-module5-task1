package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

import java.util.LinkedList;

public class FridgeAlgorithm implements Fridge{
    private final LinkedList<Actions> actionsQueue = new LinkedList<>();
    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
        open();
        getMilk();
        close();
    }


    @Override
    public void close() {
        actionsQueue.add(Actions.CLOSE);
    }

    @Override
    public void open() {
        actionsQueue.add(Actions.OPEN);
    }

    @Override
    public void getMilk() {
        actionsQueue.add(Actions.GET_MILK);
    }
    public enum Actions {
        OPEN,
        CLOSE,
        GET_MILK
    }
}
