package cn.qfys521.util;
import cn.qfys521.util.Blocks.Blocks;
public class  Main {
    public static void main(String agrs[]){
    Blocks b1 = new Blocks();
    System.out.println(b1.getBlockName("1"));
    System.out.println(b1.getBlockChineseName("2"));
    
    try{
        System.out.println(b1.getBlockChineseName("1"));
    }catch(Exception e2){
        System.out.println(e2);
    }
    
    }
} 