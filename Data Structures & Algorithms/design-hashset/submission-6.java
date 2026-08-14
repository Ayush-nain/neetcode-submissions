class MyHashSet {

    boolean hmap[];
    public MyHashSet() 
    {
        hmap=new boolean[1000001];        
    }
    
    public void add(int key) 
    {
        hmap[key]=true;        
    }
    
    public void remove(int key) 
    {
        hmap[key]=false;        
    }
    
    public boolean contains(int key) 
    {
        return hmap[key];        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */