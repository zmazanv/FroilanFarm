package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rideable {

    /*
    The `default` keyword here is enabling the interface to create a *default* method that can be used
    by any classes that may implement it. As you know, normally you only provide the method signature
    and nothing else, by which the classes implementing need to override and create their own version.
    This method here is not blank and works, which is enabled by the `default` keyword.
    The classes that implement this interface can use this method without needing to change it as is, or
    can override it like normal to create a new implementation. The `default` keyword here has nothing
    to do with the `default` access modifier. This keyword here is doing something completely different
    and unrelated.
    */
    default void beDismounted() {
        System.out.println(this.getClass().getSimpleName() + " has been dismounted from.");
    }
    default void beMounted() {
        System.out.println(this.getClass().getSimpleName() + " has been mounted on.");
    }

}
