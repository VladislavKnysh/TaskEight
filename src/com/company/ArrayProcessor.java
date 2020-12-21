package com.company;

public class ArrayProcessor<T> {
    private final T[] data;
    public ArrayProcessor (T[] array){
        this.data = array;
    }

    public void process(ElementProcessor elementProcessor){
        for (T element:data) {
            elementProcessor.run(element);
        }
    }
}
