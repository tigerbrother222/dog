package org.dog.core.event;

import org.dog.core.entry.DogTcc;

public class TccTryAchievementEvent  extends TccEvent {



    public TccTryAchievementEvent(DogTcc source) {
        super(source);
    }

    @Override
    public DogTcc getSource() {
        return super.getSource();
    }
}
