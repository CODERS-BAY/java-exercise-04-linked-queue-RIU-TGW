package impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

import skeleton.Person;
import skeleton.Queue.Node;

public class QueueIterator implements Iterator<Person> {

    private Node current;

    public QueueIterator(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Person next() {

        if (current == null) {
            throw new NoSuchElementException();
        }

        Person person = current.person;
        current = current.next;

        return person;
    }
}
