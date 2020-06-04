package com.androidtutz.anushka.didemo;

import dagger.Component;
import dagger.Module;

@Component(modules = MemoryCardModule.class)
public interface SmartPhoneComponent {

    SmartPhone getSmartPhone();
}
