package ch04_class;

public class AccountMain {
    public static void main(String[] args) {

        int[] arr = new int[2];

        Account[] management = new Account[2];

        management[0] = new Account("국민은행","홍길동",5000,4885);

        management[1] = new Account("신한은행","춘향이",4885);

        for (int i = 0; i < management.length; i++) {
            management[i].display();

        }

        Account[] banks = {
                new Account("하나은행","김종수",10000,555),
                new Account("새마을금고","얍얍",8142)};
        for (int i = 0; i < banks.length; i++) {
            banks[i].display();

        }



    }



}

