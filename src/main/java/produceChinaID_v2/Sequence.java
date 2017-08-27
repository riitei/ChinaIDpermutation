/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID_v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author riitei
 */
public class Sequence implements DataCollect {

    private String sequence;
    private List<ID> sequenceList;
    private Map<String,Object> sequenceMap;

    public void sequence() {
        sequenceList = new ArrayList<>();
// 補三位數 算第四位驗證碼
        for (int i = 0; i < 1000; i++) {
            sequence = String.format("%03d", i);
            sequenceList.add(new ID(sequence));
        }
    }//for i

    public List<ID> getSequence() {
        return sequenceList;
    }

    @Override
    public void ID() {
        //...............................
    }


    @Override
    public void setDataCollect(Map<String, Object> data) {
        return;
    }

    @Override
    public Map<String, Object> getDataCollect() {
        return sequenceMap;
    }


}
