package lesson_8;

public class LinearProbingHashTable<Key, Value> {
    private int M = 97;
    private int size = 0;
    private Object[] keys = new Object[M];
    private Object[] values = new Object[M];

    public int size() {return size;}

    public boolean isEmpty() {return size == 0;}

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }
        for (int i = hash(key); keys[i] != null; i = (i + 1) % M) {
            if (((Key)keys[i]).equals(key)) {
                return (Value) values[i];
            }
        }
        return null;
    }

    public void put(Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("Аргумент не может быть null");
        }
        int i;
        for (i = hash(key); keys != null; i = (i + 1) % M) {

            if(keys[i] == null){
                break;
            }else if (((Key)keys[i]).equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        size++;
        if(size == M){
            resize(M * 2);
        }
    }

    private void resize(int newSize){
        if((newSize % M) == 0){
            newSize += 1;
        }

        Object[] tmpKeys = keys;
        Object[] tmpValues = values;

        keys = new Object[newSize];
        values = new Object[newSize];

        for(int i = 0; i< M; i++){
            if((Key) tmpKeys[i] != null) {
                put((Key) tmpKeys[i], get((Key) tmpKeys[i]));
            }
        }

        M = newSize;
    }
}
