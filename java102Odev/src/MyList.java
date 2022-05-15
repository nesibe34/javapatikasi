import java.util.Arrays;

public class MyList<T> {
    Object[] arr;
    int size=0;

    public <T> MyList() {
        this.arr=(T[]) new Object[10];
    }
    public <T> MyList(int capacity) {
        this.arr=(T[]) new Object[capacity];
    }
    public int size(){
        return size;
    }
    public int getCapacity(){
        return arr.length;
    }
    public void add(T data){
        if (size== arr.length){
            Object[] temp=arr;
            arr=new Object[temp.length*2];
            for (int i=0;i<size;i++){
                arr[i]=temp[i];
            }
        }
        arr[size++]=data;
    }
    public T get(int index){
        if (index<0 || index> arr.length)
            return null;
        return (T) arr[index];
    }
    public void remove(int index){
        if (index<0 || index> arr.length)
            System.out.println("Null");
        arr[index]=null;
        for (int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
    public void set(int index,T data){
        if (index<0 || index> arr.length)
            System.out.println("Null");
        arr[index]=data;
    }
    public String toString(){
        String str="";

        for (int i=0;i<size;i++){
            str+=arr[i]+",";

        }
        str="["+str+"]";
        return str;
    }
    public  int indexOf(T data){
        for (int i=0;i<size;i++){
            if (arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for (int i=size;i>=0;i--){
            if (arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        if (size==0)
            return false;
        else
            return true;
    }
    public  T[] toArray(){
        Object[] list=new Object[size];
        for (int i=0;i<size;i++){
            list[i]=arr[i];
        }
        return (T[]) list;
    }
    public void clear(){
        for(int i=0;i<size;i++)
            arr[i]=null;

        size=0;
    }
    public MyList<T> subList(int start,int finish){
        MyList<T> list = new MyList<>(finish-start+1);
        int indis=0;
        for(int i=start;i<finish-start+1;i++)
        {
            list.add((T)arr[i]);
        }
        return list;
    }

    public boolean contains(T data){
        for(int i=0;i<size;i++){
            if(arr[i].equals(data))
                return true;
        }
        return false;
    }
}
