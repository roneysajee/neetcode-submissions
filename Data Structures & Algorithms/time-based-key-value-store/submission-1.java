class TimeMap {
    private Map<String,TreeMap<Integer,String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> valueMap = map.computeIfAbsent(key, (k) -> new TreeMap<>());
        valueMap.put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        TreeMap<Integer,String> valueMap =  map.get(key);
        Map.Entry<Integer,String> entry = valueMap.floorEntry(timestamp);
        if(entry == null) return "";
        return entry.getValue();
    }
}
