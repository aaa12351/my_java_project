package ch07_collection.starcraft;

import java.util.ArrayList;
import java.util.List;

public class MarineDao {
    private List<Craft> craftList = null;

    public MarineDao() {
        this.craftList = new ArrayList<Craft>();
    }

    public int insertUnit(Craft unit) {
        System.out.println(unit.getName() + "생성 완료!");
        this.craftList.add(unit);
        return 1;
    }

    public int getSize() {
        return this.craftList.size();
    }

    public List<Craft> selectAll() {
        return this.craftList;
    }

    public Craft getOne(String findUnit) {
        Craft unit = null;
        for (Craft bean : craftList) {
            if (findUnit.equals(bean.getName())) {
                unit = bean;
                break;
            } else{
            }
        }
        return unit;
    }

    public int deleteUnitData(String deleteUnit) {
        int cnt = 3 ;

        for(Craft bean:craftList){
            if(deleteUnit.equals(bean.getName())){
                this.craftList.remove(bean);
                cnt = -2;
                break;

            }else{

            }
        }
        return cnt;
    }

    public void deleteUnitAllData() {
        this.craftList.clear();
    }
}
