package homework.homework6.MapBasicQ1;


import java.util.HashMap;
import java.util.Map;

//3. 단축 번호와 전화 번호를 map에 저장해서 출력해봅시다
public class MapBasicQ1_3 {

    static Map<Integer, String> phoneNumber = new HashMap<>();

    public static void main(String[] args) {
        phoneNumber.put(1, "010-1111-1111");
        phoneNumber.put(2, "010-2222-2222");
        phoneNumber.put(3, "010-3333-3333");

        System.out.println(phoneNumber);
        System.out.println(phoneNumber.get(1));
    }

}
