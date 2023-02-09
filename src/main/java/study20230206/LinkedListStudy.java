package study20230206;

import java.util.Objects;

public class LinkedListStudy<T> {

    private Node<T> first;

    private int size = 0;

    //스태틱은 클래스내의 변수를 하나도 사용하지 않을때 사용
    //스태틱x 은 내부값을 사용할때
    //add, size, get, remove, empty

    public void add(T item) {
        Node<T> node = new Node<>(item);

        //데이터가 없을때
        if (Objects.isNull(first)) {
            first = node;
            size++;
            return;
        }

        //데이터가 있을때
        Node<T> lastNode = findNode(size - 1);
        lastNode.setNext(node);
        size++;
    }

    public T get(int index) {
        //데이터가 없을때
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        //TODO:보다작을때 상황도 만들어보자

        //데이터가 있을때
        Node<T> node = findNode(index);
        return node.getItem();
    }

    private Node<T> findNode(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = first.getNext();
        }
        return node;
    }

    public void remove(int index) {
        //데이터가 없을때
        if (index >= size || size < 0) {
            throw new IndexOutOfBoundsException();
        }

        //데이터가 1개일때
        if (size == 1) {
            first = null;
            size--;
            return;
        }
        
        if (index == 0) {
            //요거는 개인적으로 한번 고민해보자
        }

        //데이터가 있을때
        Node<T> beforeNode = findNode(index - 1);
        Node<T> removeNode = findNode(index);
        beforeNode.setNext(removeNode.getNext());
        size--;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

