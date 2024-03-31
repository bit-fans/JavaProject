package MyArrayList;

import java.util.Arrays;

public class MyArrayList implements IList{

    public int[] elem;
    public int useSized;
    public static final int DEFAULT_CAPACITY=5;
    public MyArrayList(){
        elem=new int[DEFAULT_CAPACITY];
        this.useSized=0;
    }

    /**
     * 尾插法
     * @param data
     */
    @Override
    public void add(int data) {
        //判断数组是否装满
        if(isFull()){
            elem= Arrays.copyOf(elem,elem.length*2);
        }
        elem[useSized]=data;
        useSized++;
    }

    @Override
    public boolean isFull() {
        return this.useSized==elem.length;
    }

    /**
     * 在指定位置插入数据
     * @param pos
     * @param data
     */
    @Override
    public void add(int pos, int data) {
        //下标是否合法
        CheckPos(pos);

        //顺序表是否满载
        if(isFull()){
            elem= Arrays.copyOf(elem,elem.length*2);
        }

        //找到pos位置
        for (int i = useSized-1; i>=pos ; i--) {
            elem[i+1]=elem[i];
        }
        elem[pos]=data;
    }
    private void CheckPos(int pos){
        if(pos<0 || pos>useSized){
            throw new PosNotLegalException("下标不合法");
        }
    }

    @Override
    public boolean contains(int toFind) {
        for (int i = 0; i < useSized; i++) {
            if(elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(int toFind) {
        for (int i = 0; i < useSized; i++) {
            if(elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int pos) {
        CheckPos(pos);
        return elem[pos];
    }

    @Override
    public void set(int pos, int value) {
        CheckPos(pos);
        elem[pos]=value;
    }

    /**
     * 删除key
     * @param toRemove
     */
    @Override
    public void remove(int toRemove) {
        int index=indexOf(toRemove);
        for (int i = index; i < useSized-1; i++) {
            elem[i]=elem[i+1];
        }
        useSized--;
    }

    @Override
    public int size() {
        return useSized;
    }

    @Override
    public void clear() {
        elem=null;
    }

    @Override
    public void display() {
        for (int i = 0; i < useSized; i++) {
            System.out.println(elem[i]);
        }
    }
}
