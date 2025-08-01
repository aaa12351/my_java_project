package ch04_class;

public class Account {
    private String bank;
    private String name;
    private int balance = 8888;
    private int password;

    public Account(String bank, String name, int balance, int password) {
        this.bank = bank;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public Account(String bank, String name, int password){
        this.bank = bank;
        this.name = name;
        this.password = password;
    }




        public void display(){
        System.out.println("은행 : " + bank + " 입니다.");
        System.out.println("이름 : " + name + " 입니다.");
        System.out.println("잔액 : " + balance + " 만원 입니다.");
        System.out.println("비밀번호 : " + password + " 입니다.");
    }






}
