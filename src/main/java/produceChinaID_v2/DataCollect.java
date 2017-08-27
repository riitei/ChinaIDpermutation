/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produceChinaID_v2;

import java.util.List;
import java.util.Map;

/**
 *
 * @author riitei
 */
class ID {

    private final String id;

    public ID(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }
}

public interface DataCollect { // 收集三組序號

    public void setDataCollect(Map<String, Object> data);

    public void ID();// 實做出 Data ID

    public Map<String,Object> getDataCollect();

}
