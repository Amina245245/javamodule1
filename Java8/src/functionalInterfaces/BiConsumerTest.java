package functionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String>map=new HashMap<>();
map.put("ola", "o");
map.put("Hello","H");
map.put("Chao", "C");
map.forEach((k,v)->
    System.out.println(k+" For "+v));

BiConsumer<String,String>bi=
(k,v)-> System.out.println(k+" For " +v);

map.forEach(bi);
	}

}
