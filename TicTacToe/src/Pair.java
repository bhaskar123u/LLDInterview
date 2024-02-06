public class Pair<K, V> {
  
  K k;
  V v;

  Pair(K k, V v) {
    this.k = k;
    this.v = v;
  }

  K getKey() {
    return k;
  }

  V getValue() {
    return v;
  }
  
}
