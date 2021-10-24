package com.company.comands;

import com.company.Participant;

public abstract class Teams implements Participant {

    private final String name;
    private final boolean onDistance;
    private final int maxRunDistance;
    private final int maxJumpHeight;
    private final int maxSwimDistance;

    public Teams(String name, int maxRunDistance,
                 int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }



    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал кросс");
        } else {
            System.out.println(name + " не справился с кроссом");

        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену");
        } else {
            System.out.println(name + " не справился с прыжком");

        }
    }

    @Override
    public void swim(int distance) {
       if (distance <= maxSwimDistance) {
            System.out.println(name + " успешно переплыл");
        } else {
            System.out.println(name + " не смог переплыть");

        }
    }

}
