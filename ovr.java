public class ovr {
    public static void main(String[] agrs){
        int a = 1, b = 2, c = 3, d = 4;
        int mx, mn;
        mx = a < b ? b : a;  // a가 b보다 작으면 mx에 b의 값을 저장하고, 아니면 a값을 저장한다.
        if (mx == 1){
            mn = a > mx ? b : a;
        }
        else {
            mn = b < mx ? d : c;
        }
        System.out.println(mn);
    }
}
