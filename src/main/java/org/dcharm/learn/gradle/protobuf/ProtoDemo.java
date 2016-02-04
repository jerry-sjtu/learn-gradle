package org.dcharm.learn.gradle.protobuf;


/**
 * Created by wangqiang on 2016/2/3.
 */
public class ProtoDemo {
    public static void main(String[] args) throws Exception {
        AddressBookProtos.Person p1 = AddressBookProtos.Person.newBuilder()
                .setId(1)
                .setName("qiang")
                .build();
        System.out.println(p1);
        byte[] bytes = p1.toByteArray();
        System.out.println(bytes);
        System.out.println(bytes.length);

        AddressBookProtos.Person p2 = AddressBookProtos.Person.parseFrom(bytes);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
