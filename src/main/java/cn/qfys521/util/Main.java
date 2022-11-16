package cn.qfys521.util;
import cn.qfys521.util.Blocks.Blocks;
import cn.qfys521.util.Blocks.liquid;
public class  Main {
    public static void main(String agrs[]){
    Blocks b1 = new Blocks();
    System.out.println(b1.getBlockName("水"));
    System.out.println(b1.getBlockChineseName("water"));
    liquid l1 = new liquid();
    System.out.println(l1.getliquidName("水"));
    System.out.println(l1.getliquidChineseName("water"));
    
    try{
        System.out.println(b1.getBlockChineseName("1"));
    }catch(Exception e2){
        System.out.println(e2);
    }
    
    }
} 