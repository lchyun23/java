public class Person {
    String name ="홍길동";
    int age = 40;

    public void set_name(String n)
    {
        name = n;
    }
    public void set_age(int i)
    {
        age = i;
    }

    public static void main(String[] args) {
        Person p1 = new Person(); // p1 이라는 인스턴스 생성

        p1.set_name("광부");
        p1.set_age(25);
        System.out.print(p1.age + "살 " + p1.name + "입니다.");
    }
}
