package com.john;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {

        public static void main( String[] args )
        {
            List<String> list = Arrays.asList("California", "Arizona", "Minnesota", "New Jersey");
            List <String> anotherList = new ArrayList<>();
            Map<String, String> states = new HashMap<String, String>();
            //create a set of Integre objcts
            Set<Integer> nums = new HashSet<Integer>();

            //add the number 1..10
            for (int i=1; i<10; i++){
                nums.add(i);
            }

            // Add 1, 4, 9, 16, 25
            // Since it's a Set, only the add() of 16 and 25 do anything.
            for (int i=1; i<=5; i++) {
                nums.add(i * i);
            }

            // Foreach works on a Set.
            for (int num:nums) {
                System.out.println(num);
            }

            // Iterator works on a set.
            // (the values will appear in some random order for a HashSet
            // as we have here)
            Iterator<Integer> it = nums.iterator();
            while (it.hasNext()) {
                int val = it.next();
            }

            // Other Collection utilties work
            nums.contains(9); // true
            nums.containsAll(Arrays.asList(1, 2, 3)); // true

            // addAll() is essentially a mathematical union operation.
            // Change nums to the union with the set {16, 17}
            nums.addAll(Arrays.asList(16, 17));

            anotherList.add("California");
            anotherList.add("Arizona");
            anotherList.add("Minnesota");
            anotherList.add("New Jersey");

            for(String String : anotherList ){
                System.out.println(String);
            }

            states.put("ca", "California");
            states.put("az", "Arizona");
            states.put("mn", "Minnesota");
            states.put("nj", "New Jersey");

            // Pull out live Collection of all the values.
            Collection<String> values = states.values();
            System.out.println(values);

            // Pull out live set of the keys -- use to print key->value for
            // the whole map. The order of the keys is random for a HashSet.
            Set<String> keys = states.keySet();
            for (String key:keys) {
                System.out.println(key + "->" + states.get(key));
            }

        }
}