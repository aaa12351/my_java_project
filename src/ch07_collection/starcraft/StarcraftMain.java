package ch07_collection.starcraft;

import java.util.List;

public class StarcraftMain {
    public static void main(String[] args) {
        MarineDao dao = new MarineDao();

        dao.insertUnit(new Craft("Marine", 40, 6));
        dao.insertUnit(new Craft("Firebat", 50, 8));
        dao.insertUnit(new Craft("Medic", 60, 0));

        int size = dao.getSize();
        System.out.println("유닛 총 수는 " + size + "명입니다.");

        System.out.println("[전체 유닛 목록]");

        List<Craft> craftList = dao.selectAll();
        for(Craft bean:craftList){
            String name = bean.getName();
            int hp = bean.getHp();
            int attack = bean.getAttack();

            String message = name + ", " + "HP: " + hp + ", " + "공격력: " + attack ;
            System.out.println(message);
        }

        System.out.println("\n특정 유닛을 검색하여 출력합니다.");
        String findUnit = "Marine" ;
        Craft one = dao.getOne(findUnit);

        if(one == null){
            System.out.println(findUnit + "이 유닛은 생성되지 않았습니다.");
        }else{
            String name = one.getName();
            int hp = one.getHp();
            int atteck = one.getAttack();

            String message = "발견! " + "유닛: " + name + "\t" + "HP: " + hp + "\t" + "공격력: " + atteck ;
            System.out.println(message);

        }

        System.out.println("특정 유닛을 삭제시킵니다.");
        String deleteUnit = "Firebat" ;

        int result = dao.deleteUnitData(deleteUnit);

        if(result != -1){
            System.out.println(deleteUnit + " 유닛 삭제 완료");
        }else{
            System.out.println(deleteUnit + " 유닛 삭제 불가");
        }
        System.out.println("[모든 유닛 제거]");
        dao.deleteUnitAllData();
        System.out.println("현재 유닛 수 : " + dao.getSize());

    }
}
