public class Cache {
    public static void main(String[] args) throws Exception {
        System.out.println("Cache started");
        System.out.println();

        // LRU based cache of initial size 3
        CacheImpl<String, String> lruCacheImpl = new CacheImpl<>(new LRUEvictionPolicy<>(), new HashMapBasedStorage<>(3));
        lruCacheImpl.put("Bhaskar Sharan", "77XXXXXXXX");
        lruCacheImpl.put("Anni", "63XXXXXXXX");
        System.out.println(lruCacheImpl.get("Bhaskar Sharan"));
        lruCacheImpl.put("NTR", "70XXXXXXXX");
        lruCacheImpl.put("BTS", "94XXXXXXXX");
        System.out.println(lruCacheImpl.get("Adam"));
        
    }
}
