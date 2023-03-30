package day29exteptionsmaps;

import java.util.*;

public class HashMap01 {
    /*
    1)Maps have key-value structure
    2)Keys are unique , values can be repeated
    3)Map elements  are called "Entry"
    4)All Map elements are called "Entry Set"
    5)Maps are in 3 types: i)HashMap
                            *HashMaps put the entries in random order, this makes HashMaps so fast
                            *HashMaps accept just one "null" value  in key part
                            *HashMap accept multiple "null" values in value part
                           ii)HashTable
                           iii)TreeMap
    6)If you use same key repeatedly in a Map, final value will be accepted in  the Map.
      put() method with the same key and different value updates the value of the key.
      I mean put() method can be used to update the values but this is not recommended, because java has a method to
      update values.
      put()method with the same key and different value "overwrites" the value.
     */
    public static void main(String[] args) {
        HashMap<String,Integer> cp= new HashMap<>();
        System.out.println(cp);//{}

        cp.put("USA",400000000);
        cp.put("Germany", 83000000);
        cp.put("Albania",30000000);
        cp.put(null,450000000);
        cp.put("Democratic Kongo",null);
        cp.put("Nicaragua",null);
        cp.put("Albania",35000000);
        System.out.println(cp);//{null=450000000,USA=400000000, Democratic Kongo=null, Nicaragua=null, Germany=83000000, Albania=35000000}



        //How to get just the keys
        //Example 1:Type code to find number of characters used in the keys
        Set<String> keys=cp.keySet();//will give the just keys//keySet()method returns all keys in a Set
        System.out.println(keys);//[null, USA, Democratic Kongo, Nicaragua, Germany, Albania]
        int sum=0;
        for(String w:keys) {
            if (w!=null){
                sum = sum + w.length();
        }

        }
        System.out.println(sum);//42

        //How to get just values
        //Example 2:Type code to find the total population of the countries in the Map
        Collection<Integer> values=cp.values();//values()method returns all values
        System.out.println(values);//[450000000, 400000000, null, null, 83000000, 35000000]

        int total=0;
        for(Integer w:values){
            if (w!=null){
                total=total+w;
            }
        }
        System.out.println(total);//968000000

        //How to get the value of a specific key
        //Type code to find the population of the USA.
       Integer populationOfUsa= cp.get("USA");//get() method returns the value as a specific key
        System.out.println(populationOfUsa);//400000000

        //How to update values in a Map
        cp.replace("USA",410000000);
        System.out.println(cp);//{null=450000000, USA=410000000, Democratic Kongo=null, Nicaragua=null, Germany=83000000, Albania=35000000}

        cp.replace("USA",410000000,390000000);
        System.out.println(cp);//{null=450000000, USA=390000000, Democratic Kongo=null, Nicaragua=null, Germany=83000000, Albania=35000000}
        //the second replace it is work when the 4100000000  it is like that if it is different it is not updating

        int numOfEntries=cp.size();//size() method returns num of entries
        System.out.println(numOfEntries);//6

        Integer r1=cp.getOrDefault("USA",0);//getOrDefault() method will the check the key , if the key exist it will give to you
        System.out.println(r1);//390000000
        Integer r2=cp.getOrDefault("XYZ",0);//getOrDefault() if the keys  it is not exist it will give you "0"
        System.out.println(r2);//0

        cp.putIfAbsent("USA",500000000);//{null=450000000, USA=390000000, Democratic Kongo=null, Nicaragua=null, Germany=83000000, Albania=35000000}
                                       //putIfAbsent () puts the entry into the map if the key is absent
        System.out.println(cp);//

        cp.putIfAbsent("Belgium",500000000);//
        System.out.println(cp);//{null=450000000, USA=390000000, Democratic Kongo=null, Nicaragua=null, Belgium=500000000, Germany=83000000, Albania=35000000}

        boolean r3=cp.containsKey("USA");
        System.out.println(r3);//true

        boolean r4=cp.containsValue(35000000);
        System.out.println(r4);//true

        Set<Map.Entry<String,Integer>> allEntries=cp.entrySet();//entrySet() method returns all entries in a Set whose elements  are in Set<Map.Entry<K,V
        System.out.println(allEntries);//[null=450000000, USA=390000000, Democratic Kongo=null, Nicaragua=null, Belgium=500000000, Germany=83000000, Albania=35000000]
        for(Map.Entry<String,Integer> w: allEntries){
            System.out.println(w.getKey()+ " - "+ w.getValue());//null - 450000000
                                                                // USA - 390000000
                                                               // Democratic Kongo - null
                                                               //    Nicaragua - null
                                                               //Belgium - 500000000
                                                              //Germany - 83000000
                                                              //Albania - 35000000



        }

    }
}
