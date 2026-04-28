class MyHashSet {
    ArrayList<Integer> l;
    public MyHashSet() {
        l = new ArrayList<>();
    }
    
    public void add(int key) {
        Boolean check = false;
        for(int ele : l)
        {
            if(ele == key) check = true;
        }
        if(check==false) l.add(key);
    }
    public void remove(int key) {
        for(int i=0; i<l.size(); i++)
        {
            if(l.get(i)==key) l.remove(i);
        }   
    }
    
    public boolean contains(int key) {
        Boolean check = false;
        for(int ele : l)
        {
            if(ele == key) check = true;
        }
        return check;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */