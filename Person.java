public class Person {
    //version 1.
    // String name ="홍길동";
    // int age = 40;

    // public void set_name(String n)
    // {
    //     name = n;
    // }
    // public void set_age(int i)
    // {
    //     age = i;
    // }

    // public static void main(String[] args) {
    //     Person p1 = new Person(); // p1 이라는 인스턴스 생성

    //     p1.set_name("광부");
    //     p1.set_age(25);
    //     System.out.print(p1.age + "살 " + p1.name + "입니다.");
    // }
    
    // version 2.
    String name;
    int age;

    public Person() {
        this.name = "사람";
        this.age = 1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void toPrint() {
        System.out.println( this.name + "님의 나이는 " + this.age + "살 입니다.");
    }

    public static void main(String[] args)
    {
        Person p1 = new Person ();
        p1.toPrint();

        Person p2 = new Person("이흥직", 40);
        p2.toPrint();
    }

}





// public static void main (String[] args) {
//     try {
//         코드실행
//     }
//     catch(ArithmeticException e) {
//         산술계산 오류 발생 시 실행
//     }
//     catch(Exception e){
//         모든 오류 발생 시 실행
//     }
//     finally{
//         모든 오류 처리가 종료된 후 실행
//     }
// }