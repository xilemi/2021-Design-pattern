package birdge;

import adapter.CollectAdapter;
import adapter.CollectTextIml;

public class BirtShowTextData extends BirtShowAbstract{
    public BirtShowTextData(BirtShow birtShow){
        super(birtShow);
    }

    @Override
    public void showBirt() {
//        super.showBirt(new CollectAdapter("text").collect("text"));
        super.showBirt(new CollectTextIml().collect("text"));
    }
}
