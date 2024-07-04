// abstract class Remote {
//     public int volume = 10;
//     public int channel = 1;

//     public void volume_up() {
//         this.volume++;
//     }
//     abstract void channel_change(int i);
// }

// class TV_Remote extends Remote {
//     void channel_change(int i) {
//         channel = i ;
//     }
//     public static void main(String[] args) {
//         TV_Remote tv = new TV_Remote();
//         tv.volume_up();
//         tv.volume_up();
//         System.out.println("볼륨 : " + tv.volume );
//         tv.channel_change(5);
//         System.out.println("채널 : " + tv.channel);
//     }
// }

interface Remote {
    public void volume_up();
    public void channel_change(int i);
}
class TV_Remote implements Remote {
    public int volume = 10;
    public int channel = 1;
    public void channel_change(int i) {
        this.channel = i;
    }
    public void volume_up() {
        this.volume++;
    }
    public static void main(String[] args) {
        TV_Remote tv = new TV_Remote();
        tv.volume_up();
        tv.volume_up();
        System.out.println( "볼륨 : " + tv.volume );

        tv.channel_change(5);
        System.out.println("채널 : " + tv.channel );
    }
    
}