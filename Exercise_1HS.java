class MyHashSet {

    boolean [][] storage;
    int primaryBuckets;
    int bucketItems;


    public MyHashSet() {
        this.primaryBuckets = 1000;
        this.bucketItems = 1000;
        this.storage = new boolean[primaryBuckets][];
    }

    private int hash1(int key){

       return key%primaryBuckets;
    }

    private int hash2(int key){
        return key/bucketItems;
    }
    
    public void add(int key) { // O(1) time complexity
        int bucket = hash1(key); 
        int bucketItem = hash2(key);

        if(storage[bucket] == null){
            if(bucket == 0){
                storage[bucket] = new boolean[bucketItems+1];
            }else{
                 storage[bucket] = new boolean[bucketItems];
            }
        }
   
       storage[bucket][bucketItem] = true;

    }
    
    public void remove(int key) { //O(1) time complexity
        
        int bucket = hash1(key);
        int bucketItem = hash2(key);

        if(storage[bucket] == null){
            return;
        }

        storage[bucket][bucketItem] = false;

    }
    
    public boolean contains(int key) { // O(1) time complexity
     
        int bucket = hash1(key);
        int bucketItem = hash2(key);

         if(storage[bucket] == null){
            return false;
        }

        return storage[bucket][bucketItem];
    }
}