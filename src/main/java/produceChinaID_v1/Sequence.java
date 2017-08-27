/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID_v1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author riitei
 */
class SequenceID {

    private String sequenceID;

    public SequenceID(String sequenceID) {
        this.sequenceID = sequenceID;
        
    }

    public String getSequence() {
        return this.sequenceID;
    }

}

public class Sequence {

    private String sequence;
    private List<SequenceID> sequenceList;

    public void sequence() {
        sequenceList = new ArrayList<>();
// 補三位數 算第四位驗證碼
        for (int i = 0; i < 1000; i++) {
            sequence = String.format("%03d", i);
            sequenceList.add(new SequenceID(sequence));
        }
    }//for i

    public List<SequenceID> getSequence() {
        return sequenceList;
    }

}
