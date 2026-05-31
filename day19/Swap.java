package day19;

public class Swap<K,V> {
    K key;
    V value;

    public Swap(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public Swap<V,K> swap() {
        return new Swap<>(value,key);
    }

    public K key() {
        return this.key;
    }

    public V value() {
        return this.value;
    }

    public static void main(String[] args) {
    Swap<String, Integer> p = new Swap<>("Gözde", 21);
    Swap<Integer, String> swapped = p.swap();

    System.out.println(swapped.key());
    System.out.println(swapped.value());
    }
}
