public class Array {
    private int[] items;
    int count = 0;
    public Array(int length){
        items = new int[length];
    }
    public void print(){
        for(int i =0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        if (items.length == count){
            int [] newItems = new int[count*2];
            for(int i =0; i<count; i++){
                newItems [i] = items[i];
            }
            items = newItems;
        }
        items[count] = item;
        count++;
    }
    public void removeAt(int index){
        if (index < 0 || index >= 4){
            throw new IndexOutOfBoundsException();
        }else{
            for (int i = index; i < count; i++){
                items[i] = items[i+1];
                count--;
            }
        }
    }
    public int indexOf(int item){
        for (int i =0; i< count; i++ ){
            if (items[i] == item) return i;
        }
        return -1;
    }
}