import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

class Twelvemarch{

public static void main(String[] args){

List<String> lString =List.of("Hello","My","Name","is","Gaurav","Sharma");


//Strings to uppercase

lString.stream().map(String::toUpperCase).forEach(e->System.out.println(e));

//Map strings to lengths
Map<String,Integer>map=lString.stream().collect(Collectors.toMap(Function.identity(),String::length));

System.out.println(map);

//find sum 
List<Integer>list=List.of(1,2,2,23,45,6,78,99);
int s=list.stream().mapToInt(Integer::intValue).sum();
System.out.println(s);


//find distinct even numbers
List<Integer> res =
list.stream()
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
.entrySet()
.stream()
.filter(e -> e.getKey() % 2 == 0)
.map(Map.Entry::getKey)
.toList();
System.out.println(res);







}
}
