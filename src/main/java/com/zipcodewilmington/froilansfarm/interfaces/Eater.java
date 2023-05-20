package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.classes.persons.Person;

public interface Eater {

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
    default void eat(Edible edibleToBeEaten) {
        StringBuilder eaterName = new StringBuilder(this.getClass().getSimpleName());
        if (this instanceof Person) {
            eaterName.append(' ').append(((Person)this).getName());
        }
        StringBuilder edibleToBeEatenName = new StringBuilder(edibleToBeEaten.getClass().getSimpleName());
        char firstLetterOfEdibleToBeEatenName = Character.toLowerCase(edibleToBeEatenName.charAt(0));
        if (firstLetterOfEdibleToBeEatenName == 'a'
                || firstLetterOfEdibleToBeEatenName == 'e'
                || firstLetterOfEdibleToBeEatenName == 'i'
                || firstLetterOfEdibleToBeEatenName == 'o'
                || firstLetterOfEdibleToBeEatenName == 'u') {
            System.out.println(eaterName + " ate an " + edibleToBeEatenName + '.');
        } else {
            System.out.println(eaterName + " ate a " + edibleToBeEatenName + '.');
        }
        /*
        This here is a placeholder which doesn't actually do anything. This is in case we explore nullifying the
        argument passed in at some point, which we may if we have time. This serves no purpose, nor hurts anything, as
        it currently is.
        */
        edibleToBeEaten = null;
    }

}
