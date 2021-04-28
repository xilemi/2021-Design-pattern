package test;

import birdge.BirtShowImpl1;
import birdge.BirtShowImpl2;
import birdge.BirtShowJdbcData;
import birdge.BirtShowTextData;

public class TestClass {
    public static void main(String[] args){
        BirtShowTextData showText=new BirtShowTextData(new BirtShowImpl1());
        showText.showBirt();
        BirtShowJdbcData showJdbc =new BirtShowJdbcData(new BirtShowImpl1());
        showJdbc.showBirt();
        BirtShowTextData showText1 =new BirtShowTextData(new BirtShowImpl2());
        showText1.showBirt();
        BirtShowTextData showJdbc1=new BirtShowTextData(new BirtShowImpl2());
        showJdbc1.showBirt();
    }
}
