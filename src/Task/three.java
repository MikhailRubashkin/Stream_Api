package Task;
import java.util.*;

//	Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.

public class three {


    public static void main(String[] args) {

        Map<String, Integer> priceHM = new HashMap<>();

        priceHM.put("Iphone 8", 45000);
        priceHM.put("SamSumg 7", 40000);
        priceHM.put("Xiaomi Mi5S", 25000);
        priceHM.put("Honor", 35000);

        priceHM.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(priceHM.values().stream().mapToInt(Integer::intValue).sum());


    }
}









































