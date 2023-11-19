package chap_09.coffee;

import chap_09.user.User;

// 어떤 타입도 상관없지만 반드시 User라는 클래스를 상속하는 것을 써야함
public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
