public class Parent {
    public void set_name(String param_n) {
        System.out.println("부모의 이름 변경");
    }

    public void set_age(int param_i) {
        System.out.println("부모의 나이 변경");
    }
}

class Child extends Parent {
    @Override
    public void set_name(String param_n) {
        System.out.println("자식의 이름 변경");
    }
    public void set_height(int param_h) {
        System.out.println("자식의 키 변경");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.set_name("홍길동");
        c.set_age(40);
        c.set_height(170);
    }
}




    // String name;
    // int age;

    // public void set_name(String param_n) {
    //     name = param_n;
    // }
    
    // public void set_age(int param_i) {
    //     age = param_i;
    // }


// class Child extends Parent {
//     int height;

//     public void set_height(int param_h) {
//         height = param_h;
//     }

//     public static void main(String[] args) {
//         Child c = new Child();
//         c.set_name("홍길동");
//         c.set_age(40);    
//         c.set_height(170);

//         System.out.println(c.name);
//         System.out.println(c.age); 
//         System.out.println(c.height); 
//     }



