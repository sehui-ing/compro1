package compro1;

import java.util.Scanner;

public class MemberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member member = new Member("Hong", "홍", 10);

        System.out.println("초기정보");
        System.out.println("기존 아이디 = " + member.getId());
        System.out.println("기존 이름 = " + member.getName());
        System.out.println("기존 포인트 = " + member.getPoint());
        System.out.println();

        System.out.print("변경할 아이디 : ");
        String id = scanner.nextLine();
        member.setId(id);

        System.out.print("변경할 이름 : ");
        String name = scanner.nextLine();
        member.setName(name);

        System.out.print("지급할 포인트 : ");
        int added = scanner.nextInt();
        member.setPoint(member.getPoint() + added);

        System.out.println();
        System.out.println("변경된 아이디 : " + member.getId());
        System.out.println("변경된 이름 : " + member.getName());
        System.out.println("변경된 포인트 : " + member.getPoint());
    }
}

class Member {
    String id;
    String name;
    int point;

    Member(String id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

