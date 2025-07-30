package broCode.dynamicArray;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        //check if size (number of elements) of the array is equal to or greater than the capacity of the array i.e. String[] strArr = new String[capacity];
        if(size >= capacity){
            grow();
        }
        //if the size is less than capacity then assign data to array with the size as index of the array
        array[size] = data;
        //now increase the size by 1 to keep the size updated after addition of new element
        size++;
    }

    public void insert(int index, Object data){

    }

    public void delete(Object data){

    }

    public int search(Object data){
        return -1;
    }

    private void grow(){}

    private void shrink(){}

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String str = "";
        for(int i= 0; i < size; i++){
            str = str + array[i] + ", ";
        }
        if(str != ""){
            str = "[" + str.substring(0, str.length()-2) + "]";
        }else{
            str = "[" + "]";
        }
        return str;
    }

}
