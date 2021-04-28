package birdge;

import adapter.CollectAdapter;

public class BirtShowJdbcData extends BirtShowAbstract {
    public BirtShowJdbcData(BirtShow birtShow){
        super(birtShow);
    }

    @Override
    public void showBirt() {
//        super.showBirt(new CollectAdapter("jdbc").collect("jdbc"));
        super.showBirt(new CollectAdapter().collect("jdbc"));
    }
}
