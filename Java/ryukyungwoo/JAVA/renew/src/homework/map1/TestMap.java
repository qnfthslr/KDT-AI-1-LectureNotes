package homework.map1;

import java.util.HashMap;
import java.util.Map;
class NameAge {
    final String name;
    final int age;

    public NameAge (String name, int age) {
        Map<String, Integer> mapNameAge = new HashMap<>();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "NameAge{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//class FriendNamePhoneNumber {
//        public static void main(String[] args) {
//            Map<String, String> mapFriendNamePhoneNumber = new HashMap<>();
//
//            final String friendName;
//            final String PhoneNumber;
//        }
//}
class FriendNamePhoneNumber {
    final String friendName;
    final int PhoneNumber;

    public FriendNamePhoneNumber (String friendName, int PhoneNumber) {
        Map<String, Integer> mapFriendNamePhoneNumber = new HashMap<>();
        this.friendName = friendName;
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "FriendNamePhoneNumber{" +
                "friendName='" + friendName + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }}

//    class SetNumberPhoneNumber {
//    public static void main(String[] args) {
//        Map<Integer, String> mapSetNumberPhoneNumber = new HashMap<>();
//
//        final Integer setNumber;
//        final String phoneNumber;
//    }
//
class SetNumberPhoneNumber {
    final int setNumber;
    final int phoneNumber;

    public SetNumberPhoneNumber (int setNumber, int phoneNumber) {
        Map<String, Integer> mapSetNumberPhoneNumber = new HashMap<>();
        this.setNumber =setNumber ;
        this.phoneNumber =phoneNumber ;
    }

    @Override
    public String toString() {
        return "SetNumberPhoneNumber{" +
                "setNumber='" + setNumber + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }}

//    class FriendNicknameRealname {
//    public static void main(String[] args) {
//        Map<String, String> mapFriendNicknameRealname = new HashMap<>();
//
//        final String friendNickname;
//        final String realname;
//
//    }
//
//}
class FriendNicknameRealname {
    final String friendNickname;
    final String realname;

    public FriendNicknameRealname (String friendNickname, String realname) {
        Map<String, Integer> mapSetNumberPhoneNumber = new HashMap<>();
        this.friendNickname =friendNickname ;
        this.realname =realname ;
    }}
public class TestMap {
    public static void main(String[] args) {
    }
}
