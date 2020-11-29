package com.lagou.utils;

import java.util.Random;

/**
 * 生成随机数工具类
 * @author 吴侠志  2019/8/6
 * @version 1.0
 */
public class RandomUtil {
    private static final String[] WORDS={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
    private static final String[] DIGITALS={"0","1","2","3","4","5","6","7","8","9"};

    /**
     * 随机整数
     * @param min
     * @param max
     * @return
     */
    public static Integer randomInt(Integer min,Integer max){
        Random random=new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }

    /**
     * 固定长度随机字符串
     * @param length
     * @return
     */
    public static String randomString(Integer length){
        int maxIndex=WORDS.length;
        StringBuilder buf=new StringBuilder();
        for(int i=0;i<length;i++){
            buf.append(WORDS[randomInt(0,maxIndex)]);
        }
        return buf.toString();
    }

    /**
     * 固定长度随机字符串
     * @param length
     * @param words
     * @return
     */
    public static String randomString(Integer length,String[] words){
        int maxIndex=words.length;
        StringBuilder buf=new StringBuilder();
        for(int i=0;i<length;i++){
            buf.append(words[randomInt(0,maxIndex)]);
        }
        return buf.toString();
    }

    /**
     * 固定长度随机数字字符串
     * @param length
     * @return
     */
    public static Long randomNumbers(Integer length){
        int maxIndex=DIGITALS.length;
        StringBuilder buf=new StringBuilder();
        for(int i=0;i<length;i++){
            buf.append(DIGITALS[randomInt(0,maxIndex)]);
        }
        return Long.parseLong(buf.toString());
    }

}
