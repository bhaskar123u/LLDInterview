public class CacheImpl<Key, Value> {
  private final EvictionPolicy<Key> evictionPolicy;
  private final Storage<Key, Value> storage;

  public CacheImpl(EvictionPolicy<Key> evictionPolicy, Storage<Key, Value> storage) {
    this.evictionPolicy = evictionPolicy;
    this.storage = storage;
  }

  public void put(Key key, Value value) {
    try {
      this.storage.add(key, value);
      this.evictionPolicy.keyAccessed(key);
    } catch (StorageFullException exception) {
      System.out.print("Cache storage full, eviction started. ");
      Key keyToRemove = evictionPolicy.evictKey();
      if (keyToRemove == null) {
        throw new RuntimeException("Unexpected State. Storage full and no key to evict.");
      }
      this.storage.remove(keyToRemove);
      System.out.println("Creating space by evicting key " + keyToRemove);
      put(key, value);
    }
  }

  public Value get(Key key) {
    try {
      Value value = this.storage.get(key);
      this.evictionPolicy.keyAccessed(key);
      System.out.print("Retrieving value for key "+ key + " : ");
      return value;
    } catch (NotFoundException notFoundException) {
      System.out.print("Tried to access non-existing key " + key + " : ");
      return null;
    }
  }

}
