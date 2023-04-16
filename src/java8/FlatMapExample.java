package java8;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap = new HashMap<>();

        hashMap.put("Sukumar", Arrays.asList("9898123123", "9999123123"));
        hashMap.put("Bintu", Arrays.asList("9898456456", "9999456456"));
        hashMap.put("Sukoo", Arrays.asList("9898789789", "9999789789"));

        List<String> flatMapAddress = hashMap
                .values()                       // Collection<List<String>>
                .stream()                       // Stream<List<String>>
                .flatMap(Collection::stream)    // Stream<String>
                .collect(Collectors.toList());

        System.out.println(flatMapAddress);

        String phoneString = flatMapAddress
                .stream()
                .map(Object::toString) // converted List into String
                .collect(Collectors.joining(", "));

        System.out.println(phoneString);
    }

}
