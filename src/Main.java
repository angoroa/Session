import java.net.StandardSocketOptions;
import java.util.ArrayList;

// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main{
    int radius;

    public void circleprint(){
        System.out.println("원의넓이는 " + radius*radius + "ㅠ");
    }




    public static void main(String[] args) {
        Main circle1 = new ();
        circle1.radius=5;

        circle1.circleprint();
    }
}


}



