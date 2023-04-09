package com.example.patern.generative.factory.prototype;

public abstract class Account implements Cloneable {
    protected abstract void accountType();

    public Object clone() {

        Object clone = null;

        try {

            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
