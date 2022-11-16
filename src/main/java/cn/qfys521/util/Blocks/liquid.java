package cn.qfys521.util.Blocks;

import java.util.HashMap;

public class liquid {
    /**
    * 未来可能会实现set()，现在已咕咕咕<br/>
    * @author qfys521<br/>
    * private String liquidName;
    * private String liquidChineseName;
    * 
    * 注:未来请新添加get()和set()，此版本的get(Str)请保留作为向下兼容使用。
    */
    
    
    /**
    * getliquidName()
    * @param liquidChineseName 流体中文名<br/>
    * @return 流体名或者null <br/>
    * @author qfys521
    */
    public String getliquidName(String liquidChineseName){
        HashMap<String,String> c2e = new HashMap<String,String>();
        c2e.put("水","water");
        c2e.put("流动的水","flowing_water");
        c2e.put("岩浆","lava");
        c2e.put("流动的岩浆","flowing_lava");
        return c2e.get(liquidChineseName);
  
        }
        
           /**
    * getliquidChineseName()
    * @param liquidName 流体名<br/>
    * @return 流体中文名或者null <br/>
    * @author qfys521
    */
    public String getliquidChineseName(String liquidName){
        HashMap<String,String>e2c = new HashMap<String,String>();
        e2c.put("water","水");
        e2c.put("flowing_water","流动的水");
        e2c.put("lava","岩浆");
        e2c.put("flowing_lava","流动的岩浆");
        return e2c.get(liquidName);
              }      
}